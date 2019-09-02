package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.User;
public interface UserService{

    User checkLogin(String username,String password);

}
