package com.spring.client.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author xianfeng
 * @Date 2020/8/6 20:25
 * @Version 1.0
 */
@RestController
public class UserController {

    @GetMapping("/user/hello")
    public String hello() {
        return "hello";
    }
}
