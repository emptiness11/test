package com.example.test.service;

import com.example.test.dao.data.UserDO;
import com.example.test.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public String getUserName(Long id) {
        if (id <= 0) {
            throw new RuntimeException();
        }

        UserDO userDO = userMapper.selectOne(UserDO.builder().id(id).build());
        return userDO.getUsername();
    }
}
