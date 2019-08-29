package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.User;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User>  {


    User findByusername(String username);
}