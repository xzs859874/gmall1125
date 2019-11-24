package com.itguigu.gmall.gmalluser.mapper;

import com.itguigu.gmall.gmalluser.bean.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<user> selectAllUser();
}
