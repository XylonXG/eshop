package com.xg.controller;

import com.xg.entity.Page;
import com.xg.entity.User;
import com.xg.service.UserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
        String password=simpleHash.toString();

//        会员的主收获地址id

        user.setUserNum(userNum);
        user.setUserRegDate(userRegDate);
        user.setPassword(password);
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
/*
    *//*查看用户*//*
    @RequestMapping("/selectAllUser")
    public ModelAndView selectAllUser(){
        ModelAndView mav=new ModelAndView();
        User user=new User();
        List<User> userList=userService.selectAllUser(user);

        mav.getModel().put("userList",userList);

        mav.setViewName("/user/showUsers.jsp");
        return mav;
    }*/

    /*删除用户*/
    @RequestMapping("/deleteUserByID")
    public ModelAndView deleteUserByID(int delID){
        ModelAndView mav=new ModelAndView();
        userService.deleteUserByID(delID);
        mav.setViewName("/searchUserList");
        return mav;
    }

    /*分页查询*/
    @RequestMapping("/searchUserList")
    public ModelAndView searchUserList(Page page) throws UnsupportedEncodingException
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
        List<User> userList = getUserListByCondition(page);

        Integer totalCounts = this.userService.searchTotalCount(page);

        int totalPages = totalCounts.intValue() % pageSize == 0 ? totalCounts.intValue() / pageSize : totalCounts.intValue() / pageSize + 1;

        p.setTotalPage(totalPages);

        page.setTotalRows(totalCounts.intValue());

        mav.getModel().put("userList", userList);

        mav.getModel().put("page", page);
        mav.setViewName("/user/showUsers.jsp");
        return mav;
    }

    private List<User> getUserListByCondition(Page page)
    {
        List<User> userList = null;
        if (page.getQueryCondition() == null)
        {
            userList = this.userService.searchUserList(page);

            return userList;
        }
        userList = this.userService.getUserBycondtion(page);


        return userList;
    }

    @RequestMapping("/deleteUser")
    public ModelAndView deleteUser(Integer id) {
        ModelAndView mav=new ModelAndView();
        this.userService.deleteUser(id);

        mav.setViewName("/searchUserList");
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
}
