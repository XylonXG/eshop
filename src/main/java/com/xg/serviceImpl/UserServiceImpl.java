package com.xg.serviceImpl;

import com.xg.entity.User;
import com.xg.mapper.UserMapper;
import com.xg.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    /*用户注册*/
    public void userReg(User user) {
        userMapper.userReg(user);
    }

    /*用户登录*/
    public User selectUserByUsercode(String usercode) {
        return userMapper.selectUserByUsercode(usercode);
    }
}
