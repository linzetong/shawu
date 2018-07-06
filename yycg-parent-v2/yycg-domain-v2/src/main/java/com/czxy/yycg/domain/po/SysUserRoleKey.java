package com.czxy.yycg.domain.po;

public class SysUserRoleKey {
    private String sysuserid;

    private String sysroleid;

    public String getSysuserid() {
        return sysuserid;
    }

    public void setSysuserid(String sysuserid) {
        this.sysuserid = sysuserid == null ? null : sysuserid.trim();
    }

    public String getSysroleid() {
        return sysroleid;
    }

    public void setSysroleid(String sysroleid) {
        this.sysroleid = sysroleid == null ? null : sysroleid.trim();
    }
}