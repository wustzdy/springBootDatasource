package com.wustzdy.springboot.crud.controller;

import com.wustzdy.springboot.crud.entity.UserEntity;
import com.wustzdy.springboot.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired //自动连接到UserService Bean
    private UserService userService;

    @RequestMapping(value = "/show")
    public String show() {
        return userService.show();
    }

    @RequestMapping(value = "/showDao")
    public List<UserEntity> showDao(int age) {
        return userService.showDao(age);
    }

    @RequestMapping(value = "/insert")
    public String insert(String userName, String passWord) {
        return userService.insert(userName, passWord);
    }

    @RequestMapping(value = "/getId")
    public boolean exist(int age) {
        return userService.exist(age);
    }

}
