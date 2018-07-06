package com.czxy.yycg.domain.po;

import javax.persistence.Table;

@Table(name="sys_role_permission")
public class SysRolePermissionKey {
    private String roleid;

    private String permissionid;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }

	public SysRolePermissionKey(String roleid, String permissionid) {
		super();
		this.roleid = roleid;
		this.permissionid = permissionid;
	}

	public SysRolePermissionKey() {
		super();
	}
    
}