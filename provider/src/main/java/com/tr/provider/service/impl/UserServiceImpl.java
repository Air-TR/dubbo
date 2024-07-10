package com.tr.provider.service.impl;

import com.tr.provider.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author: TR
 */
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public String hello(String username) {
        return String.format("Hello, %s!", username);
    }

}
