package com.wustzdy.springboot.crud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication(scanBasePackages = "com.wustzdy.springboot.crud") //1
@MapperScan(basePackages = "com.wustzdy.springboot.crud.dao") //2
public class springBootDataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(springBootDataSourceApplication.class, args);
    }
}
