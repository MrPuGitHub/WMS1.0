package com.ccc.demoboot.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ccc.demoboot.mapper.UserMapper;
import com.ccc.demoboot.domain.User;
import com.ccc.demoboot.service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User checkLogin(String username, String password) {
        User user = userMapper.findByusername(username);
        if(user!=null&&(user.getPassword().equals(password))){
            return user;
        }

        return null;
    }

}
