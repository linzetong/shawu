package com.czxy.yycg.domain.po;

import java.util.Date;

import javax.persistence.Id;

public class Yycgd {
	@Id
    private Long id;

    private String mc;
    
    private String wssId;
	private DwWss dwWss;


    private String lxr;

    private String lxdh;

    private String cjr;

    private Date cjsj;

    private Date tjsj;

    private String bz;

    private String zt;
	private SysDictInfo sysDictInfoByzt;


    private String shyj;

    private Date shsj;

    private String vchar1;

    private String vchar2;

    private Date xgsj;

    private String gysId;
	private DwGys dwGys;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    public String getWssId() {
        return wssId;
    }

    public void setWssId(String wssId) {
        this.wssId = wssId == null ? null : wssId.trim();
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr == null ? null : lxr.trim();
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    public String getCjr() {
        return cjr;
    }

    public void setCjr(String cjr) {
        this.cjr = cjr == null ? null : cjr.trim();
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public Date getTjsj() {
        return tjsj;
    }

    public void setTjsj(Date tjsj) {
        this.tjsj = tjsj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getShyj() {
        return shyj;
    }

    public void setShyj(String shyj) {
        this.shyj = shyj == null ? null : shyj.trim();
    }

    public Date getShsj() {
        return shsj;
    }

    public void setShsj(Date shsj) {
        this.shsj = shsj;
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

    public Date getXgsj() {
        return xgsj;
    }

    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }

    public String getGysId() {
        return gysId;
    }

    public void setGysId(String gysId) {
        this.gysId = gysId == null ? null : gysId.trim();
    }

	public DwWss getDwWss() {
		return dwWss;
	}

	public void setDwWss(DwWss dwWss) {
		this.dwWss = dwWss;
	}

	public SysDictInfo getSysDictInfoByzt() {
		return sysDictInfoByzt;
	}

	public void setSysDictInfoByzt(SysDictInfo sysDictInfoByzt) {
		this.sysDictInfoByzt = sysDictInfoByzt;
	}

	public DwGys getDwGys() {
		return dwGys;
	}

	public void setDwGys(DwGys dwGys) {
		this.dwGys = dwGys;
	}
    
}