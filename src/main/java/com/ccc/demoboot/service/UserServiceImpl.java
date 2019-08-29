package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.User;
import com.ccc.demoboot.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {

    @Resource(name = "userMapper")
    UserMapper userMapper;

    @Override
    public User checkLogin(String username, String password) {

        User user = userMapper.findByusername(username);

        if(user!=null&&(user.getPassword().equals(password))){
            return user;
        }
        return null;
    }
}