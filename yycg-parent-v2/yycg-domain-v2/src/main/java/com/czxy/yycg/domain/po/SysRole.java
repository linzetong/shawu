package com.czxy.yycg.domain.po;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;

import com.alibaba.fastjson.annotation.JSONField;

public class SysRole {
	@Id
    private String id;

    private String name;

    private String groupid;

    private String vchar1;

    private String vchar2;

    private String vchar3;
    
    @JSONField(serialize=false)
	private Set<SysPermission> sysPermissions = new HashSet<>(0);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getVchar1() {
        return vchar1;
    }

    public void setVchar1(String vchar1) {
        this.vchar1 = vchar1 == null ? null : vchar1.trim();
    }

    public String getVchar2() {
        return vchar2;
    }

    public void setVchar2(String vchar2) {
        this.vchar2 = vchar2 == null ? null : vchar2.trim();
    }

    public String getVchar3() {
        return vchar3;
    }

    public void setVchar3(String vchar3) {
        this.vchar3 = vchar3 == null ? null : vchar3.trim();
    }

	public Set<SysPermission> getSysPermissions() {
		return sysPermissions;
	}

	public void setSysPermissions(Set<SysPermission> sysPermissions) {
		this.sysPermissions = sysPermissions;
	}
    
}