package com.xg.controller;

import com.xg.entity.City;
import com.xg.entity.Province;
import com.xg.service.AddressService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AddressController {
    @Resource
    private AddressService addressService;
    @RequestMapping("/selectAllProvince")
    public ModelAndView selectAllProvince(){
        ModelAndView mav=new ModelAndView();
        /*所有省份的集合*/
        List<Province> provinceList=addressService.selectAllProvince();
        /*所有地市的集合*/
        List<City> cityList=addressService.selectAllCity();

        mav.getModel().put("provinceList",provinceList);
        mav.getModel().put("cityList",cityList);

        mav.setViewName("/user/address.jsp");

        return mav;
    }
}
