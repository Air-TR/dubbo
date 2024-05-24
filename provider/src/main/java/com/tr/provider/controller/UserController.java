package com.tr.provider.controller;

import com.tr.provider.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: TR
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/hello/{username}")
    public String hello(@PathVariable String username) {
        return userService.hello(username);
    }

}
