package com.xg.controller;

import com.xg.entity.*;
import com.xg.service.AddressService;
import com.xg.service.ShowGoodsByTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ShowGoodsByTypeController {
    @Resource
    private ShowGoodsByTypeService showGoodsByTypeService;
    @Resource
    private AddressService addressService;

    @RequestMapping("/selectGoodsByGoodsType")
    public ModelAndView selectGoodsByGoodsType (String goodsTypeName, HttpServletRequest request){
        System.out.println("--------------selectGoodsByGoodsType--------------------");
        ModelAndView mav=new ModelAndView();

        List<Goods> goodsList=showGoodsByTypeService.selectGoodsByGoodsType(goodsTypeName);

        HttpSession session=request.getSession();
        session.setAttribute("goodsList",goodsList);

        mav.getModel().put("goodsList",goodsList);
        mav.setViewName("/selectGoodsDetailByGoodsNum");

        System.out.println(goodsList.size());

        return mav;
    }
    @RequestMapping("/selectGoodsDetailByGoodsNum")
    public ModelAndView selectGoodsDetailByGoodsNum(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        HttpSession session=request.getSession();
        List<GoodsDetail> goodsDetailList=new ArrayList<GoodsDetail>();
        List<Goods> goodsList=(List<Goods>) session.getAttribute("goodsList");

        Goods goods=null;
        for(int i=0;i<goodsList.size();i++){
            goods= goodsList.get(i);
            GoodsDetail goodsDetail= showGoodsByTypeService.selectGoodsDetailByGoodsNum(goods.getGoodsNum());
            goodsDetailList.add(goodsDetail);
        }

        System.out.println("goodsDetailList----"+goodsDetailList.size());
        mav.getModel().put("goodsDetailList",goodsDetailList);
        mav.setViewName("/all-class.jsp");
        return mav;
    }

    /*查询单个商品的详细信息*/
    @RequestMapping("/selectSingleGoodsInfo")
    public ModelAndView selectSingleGoodsInfo(String goodsNum,HttpServletRequest request){

        System.out.println("---------------------selectSingleGoodsInfo");
        ModelAndView mav=new ModelAndView();
        HttpSession session=request.getSession();

        Goods goods=null;
        GoodsDetail goodsDetail=null;
        int goodsCount=0;

        goods=showGoodsByTypeService.showGoodsByGoodsNum(goodsNum);
        goodsDetail=showGoodsByTypeService.showGoodsDetailByGoodsNum(goodsNum);
        goodsCount=showGoodsByTypeService.showGoodsCountByGoodsNum(goodsNum);
        /*查看供应商信息*/
        GoodsSupplier goodsSupplier=showGoodsByTypeService.showGoodsSupplierByName(goods.getGoodsSupplier());

        mav.getModel().put("goods",goods);
        mav.getModel().put("goodsDetail",goodsDetail);
        mav.getModel().put("goodsCount",goodsCount);
        mav.getModel().put("goodsSupplier",goodsSupplier);

        session.setAttribute("goods",goods);
        session.setAttribute("goodsDetail",goodsDetail);
        mav.setViewName("/goodsDetail.jsp");
        return mav;
    }
    /*将商品添加到购物车
    * 结算之后购物车的数量做相应的减少*/
    @RequestMapping("/addGoodsToShoppingCart")
    public ModelAndView addGoodsToShoppingCart(ShoppingCart shoppingCart,HttpServletRequest request,Integer buyCount,Double totalAmount)throws Exception{
        System.out.println("------addGoodsToShoppingCart-----");
        HttpSession session=request.getSession();
        ModelAndView mav=new ModelAndView();

        User user=(User) session.getAttribute("user");
        Goods goods=(Goods) session.getAttribute("goods");
        GoodsDetail goodsDetail=(GoodsDetail) session.getAttribute("goodsDetail");
        buyCount=1;
        totalAmount=buyCount*Double.parseDouble(goodsDetail.getGoodsSalePrice());
        if(user!=null){
            shoppingCart.setUserNum(user.getUserNum());
        }

        shoppingCart.setGoodsNum(goods.getGoodsNum());
        shoppingCart.setGoodsDetailNum(goodsDetail.getGoodDetailNum());
        shoppingCart.setGoodsImgHttpURL(goods.getGoodsImgHttpURL());
        shoppingCart.setGoodsDesc(goodsDetail.getGoodsDesc());
        shoppingCart.setSalePrice(Double.parseDouble(goodsDetail.getGoodsSalePrice()));
        shoppingCart.setBuyCount(buyCount);
        shoppingCart.setTotalAmount(totalAmount);
        shoppingCart.setGoodsDetailImgHttpURL1(goodsDetail.getGoodsDetailImgHttpURL1());

        showGoodsByTypeService.addGoodsToShoppingCart(shoppingCart);

        mav.getModel().put("shoppingCart",shoppingCart);
        mav.setViewName("/showShoppingCartByuserNum");

        return mav;
    }
    /*将用户加入购物车的商品显示出来*/
    @RequestMapping("/showShoppingCartByuserNum")
    public ModelAndView showShoppingCartByuserNum(String userNum,HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        List<ShoppingCart> shoppingCartList=new ArrayList<ShoppingCart>();





        HttpSession session=request.getSession();
        User user=(User) session.getAttribute("user");
        if (user!=null){
            userNum=user.getUserNum();
        }

        shoppingCartList=showGoodsByTypeService.showShoppingCartByuserNum(userNum);

        mav.getModel().put("shoppingCartList",shoppingCartList);
        session.setAttribute("shoppingCartList",shoppingCartList);

        mav.setViewName("/shoppingCart.jsp");

        return mav;
    }
    /*从购物车中删除不中意的商品*/
    @RequestMapping("/deleteFromShoppingCartById")
    public ModelAndView deleteFromShoppingCartById(int id){
        ModelAndView mav=new ModelAndView();
        showGoodsByTypeService.deleteFromShoppingCartById(id);
        mav.setViewName("/showShoppingCartByuserNum");
        return mav;
    }

    /*添加订单*/
    @RequestMapping("/addOrder")
    public ModelAndView addOrder(Order order,HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        HttpSession session=request.getSession();
        User user=(User) session.getAttribute("user");
        Goods goods=(Goods) session.getAttribute("goods");
        GoodsDetail goodsDetail=(GoodsDetail) session.getAttribute("goodsDetail");
        List<ShoppingCart> shoppingCartList=new ArrayList<ShoppingCart>();
        shoppingCartList=( List<ShoppingCart>)session.getAttribute("shoppingCartList");

        StringBuffer sb=new StringBuffer();
//        获得盐值
        for (int i = 0; i < 6; i++) {
            char c = (char) (int) (Math.random() * 26 + 97);
            sb.append(c);
        }
        String salt=sb.toString();
//       订单编号
        String orderNum=String.valueOf(System.currentTimeMillis())+salt;
        /*会员编号
         */
        String userNum=user.getUserNum();
        /*下单日期*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        String orderDate = sdf.format(new Date());
        /*订单状态*/
        String orderCondition=null;
        /*订单总金额*/
        Double orderTotalMoney=0.0;
        for (ShoppingCart shoppingCart:shoppingCartList){
                orderTotalMoney=orderTotalMoney+shoppingCart.getSalePrice();
        }
        /*订单实际金额*/
        /*发票金额*/
        /*收件人名称*/
        String username=user.getUsername();
        /*收获地址*/
        String userAddress=addressService.selectAddressByuserNum(userNum).getProvince()+
                addressService.selectAddressByuserNum(userNum).getCity();
            /*收获详细地址*/
        String userDetailAddress=addressService.selectAddressByuserNum(userNum).getProvince()+
                addressService.selectAddressByuserNum(userNum).getCity()+
                addressService.selectAddressByuserNum(userNum).getAddressDetail();



        order.setUsername(username);
        order.setOrderNum(orderNum);
        order.setUserNum(userNum);
        order.setOrderDate(orderDate);
        order.setOrderCondition(orderCondition);
        order.setOrderTotalMoney(orderTotalMoney);
        order.setOrderTrueMoney(orderTotalMoney);
        order.setInvoiceMoney(orderTotalMoney);
        order.setUserAddress(userAddress);
        order.setUserDetailAddress(userDetailAddress);

        System.out.println("order-----------------"+order);

        mav.getModel().put("order",order);
        showGoodsByTypeService.addOrder(order);
        mav.getModel().put("shoppingCartList",shoppingCartList);
        mav.getModel().put("user",user);

        session.setAttribute("order",order);

        mav.setViewName("/order/order.jsp");

        return mav;
    }

    /*进行支付*/
    @RequestMapping("/userApply")
    public  ModelAndView userApply(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        HttpSession session=request.getSession();
        Order order=(Order) session.getAttribute("order");
        GoodsDetail goodsDetail=(GoodsDetail) session.getAttribute("goodsDetail");
        List<ShoppingCart> shoppingCartList=(List<ShoppingCart>)session.getAttribute("shoppingCartList");

        mav.getModel().put("shoppingCartList",shoppingCartList);
        mav.setViewName("/order/userApply.jsp");

        return mav;

    }

}
