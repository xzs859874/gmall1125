package com.itguigu.gmall.gmalluser.mapper;

import com.itguigu.gmall.gmalluser.bean.UmsMember;
import com.itguigu.gmall.gmalluser.bean.UmsMemberReceiveAddress;



import java.util.List;

public interface UserMapper {

    List<UmsMember> selectAllUser();

    List<UmsMemberReceiveAddress> selectReceiveAddressByMemberId(Long memberId);
}
