package com.xg.controller;

import com.xg.entity.*;
import com.xg.service.GoodsService;
import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    /*添加商品*/
    @RequestMapping("/addGoods")
    public ModelAndView addGoods(String goodsName,String goodsCode,String goodsType,
                                 String goodsSupplier,String goodsShelfTime,
                                 MultipartFile goodsPhoto,
                                 HttpServletRequest request,
                                 String isGift,String isReturn)throws Exception{
        ModelAndView mav=new ModelAndView();

        System.out.println("---addGoods------");
        Goods goods=new Goods();
        StringBuffer sb=new StringBuffer();
//        获得盐值
        for (int i = 0; i < 6; i++) {
            char c = (char) (int) (Math.random() * 26 + 97);
            sb.append(c);
        }
        String salt=sb.toString();
//       商品编号
        String goodsNUm=String.valueOf(System.currentTimeMillis())+salt;
//       创建时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");

        String goodsCreateTime=sdf.format(new Date());
//        图片的上传显示
        if(goodsPhoto!=null){
            String oldName=goodsPhoto.getOriginalFilename();
            String newName= UUID.randomUUID()+oldName.substring(oldName.lastIndexOf("."));
            String goodsImgURL=request.getSession().getServletContext().getRealPath("/");
            /*图片的上传路径*/
            goodsImgURL=goodsImgURL+"/goodsImages/"+newName;
            System.out.println(goodsImgURL);
            /*图片显示的url*/
            String goodsImgHttpURL=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/goodsImages/"+newName;

            File file=new File(goodsImgURL);
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            goodsPhoto.transferTo(file);


            /*添加属性进行保存*/
            goods.setGoodsNum(goodsNUm);
            goods.setGoodsName(goodsName);
            goods.setGoodsCode(goodsCode);
            goods.setGoodsType(goodsType);
            goods.setGoodsSupplier(goodsSupplier);
            goods.setGoodsShelfTime(goodsShelfTime);
            goods.setGoodsImgURL(goodsImgURL);
            goods.setGoodsImgHttpURL(goodsImgHttpURL);
            goods.setIsGift(isGift);
            goods.setIsReturn(isReturn);
            goods.setGoodsCreateTime(goodsCreateTime);

            System.out.println(goods);
            goodsService.addGood(goods);
            System.out.println(goods);
            mav.getModel().put("goods",goods);
            mav.setViewName("/searchGoodsList");

        }

        return mav;
    }
    /*分页查询*/

    /*分页查询*/
    @RequestMapping("/searchGoodsList")
    public ModelAndView searchGoodsList(Page page) throws UnsupportedEncodingException
    {
        ModelAndView mav=new ModelAndView();
        Page p = page;
        int pageSize = 4;
        p.setPageSize(pageSize);
        int curPage = p.getCurrentPage();
        if (curPage == 0)
        {
            curPage = 1;
            p.setCurrentPage(curPage);
        }
        int startRow = page.getStartRow();
        if (p.getCurrentPage() != 0) {
            startRow = getStartRowBycurrentPage(curPage, pageSize);
        }
        p.setStartRow(startRow);

        String queryCondition = null;
        if (page.getQueryCondition() != null) {
            queryCondition = page.getQueryCondition();
        }
        List<Goods> goodsList = getGoodsListByCondition(page);

        Integer totalCounts = this.goodsService.searchTotalCount(page);

        int totalPages = totalCounts.intValue() % pageSize == 0 ? totalCounts.intValue() / pageSize : totalCounts.intValue() / pageSize + 1;

        p.setTotalPage(totalPages);

        page.setTotalRows(totalCounts.intValue());

        mav.getModel().put("goodsList", goodsList);

        mav.getModel().put("page", page);
        mav.setViewName("/goods/showGoods.jsp");
        return mav;
    }

    private List<Goods> getGoodsListByCondition(Page page)
    {
        List<Goods> goodsList = null;
        if (page.getQueryCondition() == null)
        {
            goodsList = this.goodsService.searchGoodsList(page);

            return goodsList;
        }
        goodsList = this.goodsService.getGoodsBycondtion(page);


        return goodsList;
    }

    @RequestMapping("/deleteGoods")
    public ModelAndView deleteGoods(Integer id) {
        ModelAndView mav=new ModelAndView();
        this.goodsService.deleteGoods(id);

        mav.setViewName("/searchGoodsList");
        return mav;
    }

    public int getStartRowBycurrentPage(int currentPage, int pageSize)
    {
        int startRow = 0;
        if (currentPage == 1) {
            return startRow = 0;
        }
        startRow = (currentPage - 1) * pageSize;

        return startRow;
    }
    /*添加商品类型*/
    @RequestMapping("/addGoodsType")
    public ModelAndView addGoodsType(GoodsType goodsType){
        System.out.println("-----addGoods------");
        ModelAndView mav=new ModelAndView();
        StringBuffer sb=new StringBuffer();
//        获得盐值
        for (int i = 0; i < 6; i++) {
            char c = (char) (int) (Math.random() * 26 + 97);
            sb.append(c);
        }
        String salt=sb.toString();
//       商品编号
        String goodTypeNum=String.valueOf(System.currentTimeMillis())+salt;
//       创建时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");

        String createTime=sdf.format(new Date());

        goodsType.setGoodTypeNum(goodTypeNum);
        goodsType.setCreateTime(createTime);
        goodsService.addGoodsType(goodsType);

        mav.getModel().put("goodsType",goodsType);
        mav.setViewName("/searchGoodsTypeList");
        return mav;
    }
    /*添加供应商*/
    @RequestMapping("/addGoodsSupplier")
    public ModelAndView addGoodsSupplier(String goodsSupplierName,
                                         String goodsSupplierCompany,
                                         String goodsSupplierCompanyAddress,
                                         String province,
                                         String city
                                        ){
        ModelAndView mav=new ModelAndView();
        GoodsSupplier goodsSupplier=new GoodsSupplier();
        System.out.println("-----addGoodsSupplier----");
        StringBuffer sb=new StringBuffer();
//        获得盐值
        for (int i = 0; i < 6; i++) {
            char c = (char) (int) (Math.random() * 26 + 97);
            sb.append(c);
        }
        String salt=sb.toString();
//       商品编号
        String goodsSupplierNum=String.valueOf(System.currentTimeMillis())+salt;
//       创建时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");

        String createTime=sdf.format(new Date());
//      供应商所在地
        goodsSupplierCompanyAddress=province+city;

        goodsSupplier.setGoodsSupplierNum(goodsSupplierNum);
        goodsSupplier.setGoodsSupplierName(goodsSupplierName);
        goodsSupplier.setCreateTime(createTime);
        goodsSupplier.setGoodsSupplierCompany(goodsSupplierCompany);
        goodsSupplier.setGoodsSupplierCompanyAddress(goodsSupplierCompanyAddress);

        mav.getModel().put("goodsSupplier",goodsSupplier);
        mav.setViewName("/WEB-INF/jsp/success.jsp");
        goodsService.addGoodsSupplier(goodsSupplier);
        return mav;
    }
//    查询商品类型
    @RequestMapping("/selectGoodsType")
    public String  selectGoodsType(HttpServletResponse response) throws Exception{
        System.out.println("---商品类型---");

        List<GoodsType> goodsTypeList=goodsService.selectGoodsType();
        JSONArray goodsTypeJson = new JSONArray(goodsTypeList);
        //处理中文乱码，并返回给Ajax值
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;character=utf-8");
        response.getWriter().print(goodsTypeJson);
        return null;
    }
    //    查询供应商
    @RequestMapping("/selectGoodsSupplier")
    public String  selectGoodsSupplier(HttpServletResponse response) throws Exception{
        System.out.println("---供应商---");

        List<GoodsSupplier> goodsSupplierList=goodsService.selectGoodsSupplier();
        JSONArray goodsTypeJson = new JSONArray(goodsSupplierList);
        //处理中文乱码，并返回给Ajax值
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;character=utf-8");
        response.getWriter().print(goodsTypeJson);
        return null;
    }

}
