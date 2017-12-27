package com.xg.controller;

import com.xg.entity.User;
import com.xg.service.UserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    /*用户注册*/
    @RequestMapping("/userReg")
    public ModelAndView userReg(User user){

        ModelAndView mav=new ModelAndView();
        System.out.println("-----userReg----");
        System.out.println("oldUser"+user);

//        会员编号
        String userNum=String.valueOf(System.currentTimeMillis())+user.getUsername();

//        注册日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");

        String userRegDate=sdf.format(new Date());
//        会员密码加密
        StringBuffer sb=new StringBuffer();
//        获得盐值
        for (int i = 0; i < 6; i++) {
            char c = (char) (int) (Math.random() * 26 + 97);
            sb.append(c);
        }
        String salt=sb.toString();
        SimpleHash simpleHash=new SimpleHash("MD5",user.getPassword(),salt,3);
        String userPassword=simpleHash.toString();

//        会员的主收获地址id
        user.setUserNum(userNum);
        user.setUserRegDate(userRegDate);
        user.setPassword(userPassword);
        user.setSalt(salt);
//
        System.out.println("--newUser--"+user);
        userService.userReg(user);

        System.out.println("userReg---success");

        mav.getModel().put("user",user);
        mav.setViewName("/WEB-INF/jsp/success.jsp");
        return mav;
    }
    /*用户登录*/
    @RequestMapping("/userLogin")
    public ModelAndView userLogin(){
        System.out.println("---userLogin---");
        ModelAndView mav=new ModelAndView();

        mav.setViewName("/user/userLogin.jsp");
        return mav;
    }
}
