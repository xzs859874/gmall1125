package com.itguigu.gmall.gmalluser.service.impl;

import com.itguigu.gmall.gmalluser.bean.user;
import com.itguigu.gmall.gmalluser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itguigu.gmall.gmalluser.mapper.UserMapper;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<user> getAllUser() {

        List<user> userList = userMapper.selectAllUser();
        return userList;
    }
}
