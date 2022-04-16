package com.wustzdy.springboot.crud.service;

import com.wustzdy.springboot.crud.dao.UserDao;
import com.wustzdy.springboot.crud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired //连接到UserDao Bean
    private UserDao userDao;

    public String show() {
        return "Hello World!";
    }

    public List<User> showDao(int age) {
        return userDao.get(age);
    }

    public String insert(String userName, int age) { //插入一条记录
        User user = new User();
        user.setName(userName);
        user.setAge(age);
        userDao.insert(user);
        return "Insert ( \"" + userName + "\", age" + age + ") OK!";
    }

    public boolean exist(int id) {
        return userDao.exist(id);
    }

}
