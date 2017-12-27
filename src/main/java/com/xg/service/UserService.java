package com.xg.service;

import com.xg.entity.User;

public interface UserService {
    /*用户注册*/
    public void userReg(User user);

    /*用户登录*/
    public User selectUserByUsercode(String usercode);


}
