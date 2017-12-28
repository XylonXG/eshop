package com.xg.controller;

import com.xg.entity.Goods;
import com.xg.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    /*添加商品*/
    public ModelAndView addGoods(Goods goods){
        ModelAndView mav=new ModelAndView();
        StringBuffer sb=new StringBuffer();
//        获得盐值
        for (int i = 0; i < 6; i++) {
            char c = (char) (int) (Math.random() * 26 + 97);
            sb.append(c);
        }
        String salt=sb.toString();
//        商品编号
        String goodsNUm=String.valueOf(System.currentTimeMillis())+salt;
//       创建时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");

        String goodsCreateTime=sdf.format(new Date());

        return mav;
    }
}
