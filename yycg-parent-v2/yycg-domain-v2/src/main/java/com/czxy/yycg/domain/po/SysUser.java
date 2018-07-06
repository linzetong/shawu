package com.czxy.yycg.domain.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;

import com.alibaba.fastjson.annotation.JSONField;

public class SysUser {
	@Id
    private String id;

    private String usercode;

    private String username;

    private DwWss dwWss;			//单位:卫生室
    private String wssId;
	private DwGys dwGys;			//单位:供应商
	private String gysId;
	private DwWsy dwWsy;			//单位:卫生院
	private String wsyId;
    
    private SysDictInfo sysDictInfoByGroupid;			//类型
    private String groupid;
    
    private SysDictInfo sysDictInfoByUserstate;			//状态
    private String userstate;

    private String pwd;

    private String contact;

    private String addr;

    private String email;

    private String remark;

    private Date createtime;

    private String sex;

    private String phone;

    private String movephone;

    private String fax;

    private String lastupdate;

    private String vchar1;

    private String vchar2;

    private String vchar3;

    private String vchar4;

    private String vchar5;
    
    @JSONField(serialize=false)
	private Set<SysRole> sysRoles = new HashSet<SysRole>(0);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public DwWss getDwWss() {
		return dwWss;
	}

	public void setDwWss(DwWss dwWss) {
		this.dwWss = dwWss;
	}

	public DwGys getDwGys() {
		return dwGys;
	}

	public void setDwGys(DwGys dwGys) {
		this.dwGys = dwGys;
	}

	public DwWsy getDwWsy() {
		return dwWsy;
	}

	public void setDwWsy(DwWsy dwWsy) {
		this.dwWsy = dwWsy;
	}

	public SysDictInfo getSysDictInfoByGroupid() {
		return sysDictInfoByGroupid;
	}

	public void setSysDictInfoByGroupid(SysDictInfo sysDictInfoByGroupid) {
		this.sysDictInfoByGroupid = sysDictInfoByGroupid;
	}

	public SysDictInfo getSysDictInfoByUserstate() {
		return sysDictInfoByUserstate;
	}

	public void setSysDictInfoByUserstate(SysDictInfo sysDictInfoByUserstate) {
		this.sysDictInfoByUserstate = sysDictInfoByUserstate;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMovephone() {
		return movephone;
	}

	public void setMovephone(String movephone) {
		this.movephone = movephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}

	public String getVchar1() {
		return vchar1;
	}

	public void setVchar1(String vchar1) {
		this.vchar1 = vchar1;
	}

	public String getVchar2() {
		return vchar2;
	}

	public void setVchar2(String vchar2) {
		this.vchar2 = vchar2;
	}

	public String getVchar3() {
		return vchar3;
	}

	public void setVchar3(String vchar3) {
		this.vchar3 = vchar3;
	}

	public String getVchar4() {
		return vchar4;
	}

	public void setVchar4(String vchar4) {
		this.vchar4 = vchar4;
	}

	public String getVchar5() {
		return vchar5;
	}

	public void setVchar5(String vchar5) {
		this.vchar5 = vchar5;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getUserstate() {
		return userstate;
	}

	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}

	public String getWssId() {
		return wssId;
	}

	public void setWssId(String wssId) {
		this.wssId = wssId;
	}

	public String getGysId() {
		return gysId;
	}

	public void setGysId(String gysId) {
		this.gysId = gysId;
	}

	public String getWsyId() {
		return wsyId;
	}

	public void setWsyId(String wsyId) {
		this.wsyId = wsyId;
	}

	public Set<SysRole> getSysRoles() {
		return sysRoles;
	}

	public void setSysRoles(Set<SysRole> sysRoles) {
		this.sysRoles = sysRoles;
	}
	
}