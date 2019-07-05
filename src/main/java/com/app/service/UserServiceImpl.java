package com.app.service;

import com.app.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;

/**
 * @Package com.app.service
 * @ClassName UserService
 * @Author shaobin.wang
 * @Date 2019/07/05 14:43
 * @Version 1.0
 * @Description:
 **/
@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        SysUser sysUser = sysUserService.findUserName(username);

        if (sysUser == null) {
            throw new UsernameNotFoundException("用户不存在");
        }

        return new User(sysUser.getUsername(), sysUser.getPassword(), new HashSet<SimpleGrantedAuthority>());
    }
}
