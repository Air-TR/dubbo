package com.tr.provider.service.impl;

import com.tr.provider.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: TR
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String hello(String username) {
        return String.format("Hello, %s!", username);
    }

}
