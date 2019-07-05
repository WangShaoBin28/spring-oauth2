package com.app.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.app.controller
 * @ClassName IndexController
 * @Author shaobin.wang
 * @Date 2019/07/05 15:09
 * @Version 1.0
 * @Description:
 **/
@RestController
public class IndexController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, this is test interface";
    }

    @GetMapping("/info/{name}")
    public String info(@PathVariable String name) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "hello " + name + ", this your info";
    }


}
