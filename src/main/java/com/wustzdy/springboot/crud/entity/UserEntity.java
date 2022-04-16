package com.wustzdy.springboot.crud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(UserEntity.TABLE_NAME)
public class UserEntity {
    public static final String TABLE_NAME = "db_user";
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "pass_word")
    private String passWord;
}

