package com.tr.consumer.controller;

import com.tr.provider.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TR
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/user/hello/{username}")
    public String hello(@PathVariable String username) {
        return userService.hello(username);
    }

}
