package com.xg.mapper;

import com.xg.entity.User;
import org.omg.PortableInterceptor.USER_EXCEPTION;

public interface UserMapper {
    /*用户注册*/
    public void userReg(User user);

    /*用户登录*/
    public User selectUserByUsercode(String userCid);
}
