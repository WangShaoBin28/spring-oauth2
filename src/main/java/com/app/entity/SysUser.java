package com.app.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Package com.app.entity
 * @ClassName SysUser
 * @Author shaobin.wang
 * @Date 2019/07/05 14:38
 * @Version 1.0
 * @Description:
 **/
@Data
public class SysUser implements Serializable {


    /**
     * ID主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 随机盐
     */
    private String salt;

    /**
     * 权限，这里是方便模拟，其实应该从另一张表中获取
     */
    private String authorities;


    public SysUser(Long id, String username, String password, String salt, String authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.authorities = authorities;
    }
}
