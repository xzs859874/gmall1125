package com.itguigu.gmall.gmalluser.service;

import com.itguigu.gmall.gmalluser.bean.UmsMember;
import com.itguigu.gmall.gmalluser.bean.UmsMemberReceiveAddress;


import java.util.List;

public interface IUserService  {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long MemberId);
}
