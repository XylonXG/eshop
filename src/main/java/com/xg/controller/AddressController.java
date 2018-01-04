package com.xg.controller;

import com.xg.entity.Address;
import com.xg.entity.City;
import com.xg.entity.Province;
import com.xg.service.AddressService;
import org.apache.shiro.session.Session;
import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class AddressController {

    @Resource
    private AddressService addressService;

    private Province province;

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    // 查询省份
    @RequestMapping("/province")
    public String province( HttpServletResponse response) throws IOException {
        System.out.println("选择省份");
        //查询省份保存在list中
        List<Province> list = addressService.findAllProvince();
        //转换为JSONArray数组
        JSONArray pjson = new JSONArray(list);

        //处理中文乱码，并返回给Ajax值
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;character=utf-8");
        response.getWriter().print(pjson);
        return null;
    }

    // 查询城市
    @RequestMapping("/city")
    public String city(HttpServletResponse response,String provincename) throws IOException {
        System.out.println("city---"+provincename);
        //根据选中的省份属性，查询出城市
        List<City> list = addressService.findAllCityByProvincename(provincename);
        JSONArray cjson = new JSONArray(list);
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;character=utf-8");
        response.getWriter().print(cjson);
        return null;
    }

    /*添加收获地址*/
    @RequestMapping("/addAddress")
    public ModelAndView addAddress(Address address){
            ModelAndView mav=new ModelAndView();
            System.out.println("address:::"+address);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");

        String createDate=sdf.format(new Date());

        address.setCreateDate(createDate);

        addressService.addAddress(address);
            mav.setViewName("/WEB-INF/jsp/success.jsp");
            return mav;
    }

}

