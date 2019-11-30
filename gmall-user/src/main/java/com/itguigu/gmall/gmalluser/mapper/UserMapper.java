package com.itguigu.gmall.gmalluser.mapper;

import com.itguigu.gmall.bean.UmsMember;

import com.itguigu.gmall.bean.UmsMemberReceiveAddress;



import java.util.List;

public interface UserMapper {

    List<UmsMember> selectAllUser();

    List<UmsMemberReceiveAddress> selectReceiveAddressByMemberId(Long memberId);
}
