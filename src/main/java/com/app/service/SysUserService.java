package com.app.service;

import com.app.entity.SysUser;

/**
 * @Package com.app.service
 * @ClassName UserDaoService
 * @Author shaobin.wang
 * @Date 2019/07/05 14:39
 * @Version 1.0
 * @Description:
 **/
public interface SysUserService {

     SysUser findUserName(String name);
}
