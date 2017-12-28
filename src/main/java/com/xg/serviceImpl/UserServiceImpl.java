package com.xg.serviceImpl;

import com.xg.entity.Page;
import com.xg.entity.User;
import com.xg.mapper.UserMapper;
import com.xg.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
    /*查询用户*/
    public List<User> selectAllUser(User user) {
        return userMapper.selectAllUser(user);
    }
    /*删除用户*/
    public void deleteUserByID(int delID) {
        userMapper.deleteUserByID(delID);
    }

    public List<User> searchUserList(Page paramPage) {
        return userMapper.searchUserList(paramPage);
    }

    public List<User> getUserBycondtion(Page paramPage) {
        return userMapper.getUserBycondtion(paramPage);
    }

    public Integer searchTotalCount(Page paramPage) {
        return userMapper.searchTotalCount(paramPage);
    }

    public Integer deleteUser(Integer paramInteger) {
        return userMapper.deleteUser(paramInteger);
    }
    /*分页查询*/

}
