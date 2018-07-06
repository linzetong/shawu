package com.czxy.yycg.user.service.impl;

import com.czxy.yycg.domain.po.SysUser;
import com.czxy.yycg.user.dao.SysUserMapper;
import com.czxy.yycg.user.pojo.SysUserQueryCustom;
import com.czxy.yycg.user.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findById(SysUserQueryCustom sysUserQueryCustom) {
        //此处条件没有处理，直接传递
        return sysUserMapper.findById(sysUserQueryCustom);
    }
}
