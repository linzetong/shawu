package com.czxy.yycg.user.service;

import com.czxy.yycg.domain.po.SysUser;
import com.czxy.yycg.user.pojo.SysUserQueryCustom;

public interface SysUserService {

    //处理前
    public SysUser findById(SysUserQueryCustom sysUserQueryCustom);
}
