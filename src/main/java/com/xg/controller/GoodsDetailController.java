package com.xg.controller;

import com.xg.entity.DepotGoodsInfo;
import com.xg.entity.Goods;
import com.xg.entity.GoodsDetail;
import com.xg.entity.GoodsSupplier;
import com.xg.service.GoodsDetailService;
import org.apache.shiro.session.Session;
import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class GoodsDetailController {
    @Resource
    private GoodsDetailService goodsDetailService;

    @RequestMapping("/addGoodsDetail")
    /*添加商品明细*/
    public ModelAndView addGoodsDetail(String goodsNum, String goodsDesc,
                                       MultipartFile goodsDetailImg1,
                                       MultipartFile goodsDetailImg2,
                                       MultipartFile goodsDetailImg3,
                                       String goodsOriginalPrice,
                                       String goodsSalePrice,
                                       String isUsed,
                                       int goodsCount,
                                       HttpServletRequest request) throws Exception {
        ModelAndView mav = new ModelAndView();

        String goodsDetailImgURL1="";
        String goodsDetailImgHttpURL1="";
        String goodsDetailImgURL2="";
        String goodsDetailImgHttpURL2="";
        String goodsDetailImgURL3="";
        String goodsDetailImgHttpURL3="";

        System.out.println("goodsNum----"+goodsNum);
        GoodsDetail goodsDetail = new GoodsDetail();
        StringBuffer sb = new StringBuffer();
//        获得盐值
        for (int i = 0; i < 6; i++) {
            char c = (char) (int) (Math.random() * 26 + 97);
            sb.append(c);
        }
        String salt = sb.toString();
//       商品明细编号
        String goodDetailNum = String.valueOf(System.currentTimeMillis()) + salt;
//       创建时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        String goodsCreateTime = sdf.format(new Date());

        //        图片的上传&显示

            if (goodsDetailImg1 != null) {
                String oldName = goodsDetailImg1.getOriginalFilename();
                String newName = UUID.randomUUID() + oldName.substring(oldName.lastIndexOf("."));
               goodsDetailImgURL1 = request.getSession().getServletContext().getRealPath("/");
            /*图片的上传路径*/
                goodsDetailImgURL1 = goodsDetailImgURL1 + "/goodsDetailImages/" + newName;
                System.out.println(goodsDetailImgURL1);
            /*图片显示的url*/
                goodsDetailImgHttpURL1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/goodsDetailImages/" + newName;

                File file = new File(goodsDetailImgURL1);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                goodsDetailImg1.transferTo(file);

            }

            if (goodsDetailImg2 != null) {
                String oldName = goodsDetailImg2.getOriginalFilename();
                String newName = UUID.randomUUID() + oldName.substring(oldName.lastIndexOf("."));
                goodsDetailImgURL2 = request.getSession().getServletContext().getRealPath("/");
            /*图片的上传路径*/
                goodsDetailImgURL2 = goodsDetailImgURL2 + "/goodsDetailImages/" + newName;
                System.out.println(goodsDetailImgURL2);
            /*图片显示的url*/
               goodsDetailImgHttpURL2 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/goodsDetailImages/" + newName;

                File file = new File(goodsDetailImgURL2);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                goodsDetailImg2.transferTo(file);

            }

            if (goodsDetailImg3 != null) {
                String oldName = goodsDetailImg3.getOriginalFilename();
                String newName = UUID.randomUUID() + oldName.substring(oldName.lastIndexOf("."));
               goodsDetailImgURL3 = request.getSession().getServletContext().getRealPath("/");
            /*图片的上传路径*/
                goodsDetailImgURL3 = goodsDetailImgURL3 + "/goodsDetailImages/" + newName;
                System.out.println(goodsDetailImgURL3);
            /*图片显示的url*/
               goodsDetailImgHttpURL3 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/goodsDetailImages/" + newName;

                File file = new File(goodsDetailImgURL3);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                goodsDetailImg3.transferTo(file);


            }


        goodsDetail.setGoodsDetailImgURL1(goodsDetailImgURL1);
        goodsDetail.setGoodsDetailImgHttpURL1(goodsDetailImgHttpURL1);
        goodsDetail.setGoodsDetailImgURL2(goodsDetailImgURL2);
        goodsDetail.setGoodsDetailImgHttpURL2(goodsDetailImgHttpURL2);
        goodsDetail.setGoodsDetailImgURL3(goodsDetailImgURL3);
        goodsDetail.setGoodsDetailImgHttpURL3(goodsDetailImgHttpURL3);
            goodsDetail.setGoodsNum(goodsNum);
            goodsDetail.setGoodDetailNum(goodDetailNum);
            goodsDetail.setGoodsDesc(goodsDesc);
            goodsDetail.setGoodsOriginalPrice(goodsOriginalPrice);
            goodsDetail.setGoodsSalePrice(goodsSalePrice);
            goodsDetail.setIsUsed(isUsed);
            goodsDetail.setGoodsCreateTime(goodsCreateTime);

            goodsDetailService.addGoodsDetail(goodsDetail);
            /*添加库存-商品*/
            DepotGoodsInfo depotGoodsInfo=new DepotGoodsInfo();

            depotGoodsInfo.setGoodsNum(goodsNum);
            depotGoodsInfo.setGoodsDetailNum(goodDetailNum);
            depotGoodsInfo.setDepotNum(goodsNum);
            depotGoodsInfo.setGoodsCount(goodsCount);

            goodsDetailService.addDepotCount(depotGoodsInfo);
            System.out.println("depotCount:::::"+depotGoodsInfo);

            mav.getModel().put("goodsDetail","goodsDetail");
            mav.setViewName("/selectGoodsBygoodNum");

        return mav;
    }

    /*查看商品*/
    @RequestMapping("/selectGoodsBygoodNum")
    public String selectGoodsBygoodNum(String goodsNum,HttpServletRequest request){

        Goods goods=new Goods();
        goods=goodsDetailService.selectGoodsBygoodNum(goodsNum);

        HttpSession session=request.getSession();
        session.setAttribute("goodsNum",goodsNum);
        session.setAttribute("goods",goods);



        return "forward:/selectGoodsDetail";
    }


    /*查看商品明细*/
    @RequestMapping("/selectGoodsDetail")
    public ModelAndView selectGoodsDetail(String goodsNum,Goods goods,GoodsDetail goodsDetail,HttpServletRequest request){
        HttpSession session=request.getSession();
        goodsNum= (String) session.getAttribute("goodsNum");

        ModelAndView mav=new ModelAndView();

        goodsDetail=goodsDetailService.selectGoodsDetail(goodsNum);
        goods=(Goods) session.getAttribute("goods");
        mav.getModel().put("goods",goods);
        mav.getModel().put("goodsDetail",goodsDetail);

        mav.setViewName("/goods/showGoodsDetail.jsp");
        return mav;
    }

    }
