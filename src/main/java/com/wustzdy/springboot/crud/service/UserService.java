package com.wustzdy.springboot.crud.service;

import com.wustzdy.springboot.crud.entity.UserEntity;
import com.wustzdy.springboot.crud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public String show() {
        return "Hello World!";
    }

    public List<UserEntity> showDao(int age) {
        return null;
    }

    public String insert(String userName, String passWord) { //插入一条记录
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userName);
        userEntity.setPassWord(passWord);
        userMapper.insert(userEntity);
        return "Insert ( \"" + userName + "\", passWord" + passWord + ") OK!";
    }

    public Boolean exist(int id) {
        return null;
    }

}
