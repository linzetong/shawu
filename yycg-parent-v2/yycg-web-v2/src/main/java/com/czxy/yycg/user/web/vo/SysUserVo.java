package com.czxy.yycg.user.web.vo;


import com.czxy.yycg.user.pojo.SysUserCustom;
import com.czxy.yycg.user.pojo.SysUserQueryCustom;

public class SysUserVo {

    private SysUserCustom sysUserCustom;
    private SysUserQueryCustom sysUserQueryCustom;

    public SysUserCustom getSysUserCustom() {
        return sysUserCustom;
    }

    public void setSysUserCustom(SysUserCustom sysUserCustom) {
        this.sysUserCustom = sysUserCustom;
    }

    public SysUserQueryCustom getSysUserQueryCustom() {
        return sysUserQueryCustom;
    }

    public void setSysUserQueryCustom(SysUserQueryCustom sysUserQueryCustom) {
        this.sysUserQueryCustom = sysUserQueryCustom;
    }
}

