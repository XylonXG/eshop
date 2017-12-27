package com.xg.realm;

import com.xg.entity.User;
import com.xg.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.web.servlet.ModelAndView;
import sun.security.util.Resources;

import javax.annotation.Resource;

public class CustomRealm extends AuthorizingRealm {
    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }

    @Resource
    private UserService userService;
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("---认证---");
        String usercode=token.getPrincipal().toString();
        System.out.println("usercode---"+usercode);
        User user=userService.selectUserByUsercode(usercode);

        System.out.println(user);

        if(user==null){
            return null;
        }
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(user,user.getPassword(), ByteSource.Util.bytes(user.getSalt()),this.getName());

        return info;
    }
}
