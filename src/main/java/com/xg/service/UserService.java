package com.xg.service;

import com.xg.entity.Page;
import com.xg.entity.User;

import java.util.List;

public interface UserService {
    /*用户注册*/
    public void userReg(User user);

    /*用户登录*/
    public User selectUserByUsercode(String usercode);

    /*查看用户*/
    public List<User> selectAllUser(User user);

    /*删除会员*/
    public void deleteUserByID(int delID);

    /*分页查询*/
    public abstract List<User> searchUserList(Page paramPage);

    public abstract List<User> getUserBycondtion(Page paramPage);

    public abstract Integer searchTotalCount(Page paramPage);

    public abstract Integer deleteUser(Integer paramInteger);


}
