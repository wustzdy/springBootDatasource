package com.wustzdy.springboot.crud.dao;

import com.wustzdy.springboot.crud.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper //1
public interface UserDao {
    /* @Results({ //2
             @Result(property = "id", column = "id"), //2
             @Result(property = "userName", column = "user_name"),
             @Result(property = "userAge", column = "user_age")
     })*/
    @Select("SELECT * FROM user WHERE user_age = #{age}")
    List<User> get(@Param("age") int age);

    @Insert("INSERT INTO user(name, age) VALUES (#{name}, #{age})")
        //3
    void insert(User user);

    /*@Results({ //2
            @Result(property = "id", column = "id"), //2
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userAge", column = "user_age")
    })*/
    @Select("select count(*) from user where user_age=#{id}")
    boolean exist(@Param("id") int id);
}
