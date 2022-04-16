package com.wustzdy.springboot.crud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wustzdy.springboot.crud.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
