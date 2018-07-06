package com.czxy.yycg.domain.po;

import javax.persistence.Id;

public class DwWss {
	@Id
    private String id;

    private String mc;

    private String dz;

    private String yzbm;

    private String dq;
    private SysArea sysArea;

    private String jb;

    private String cws;

    private String fyljg;

    private String dh;

    private String yjkdh;

    private String lb;

    private String ypsr;

    private String ywsr;

    private String cz;

    private String vchar1;

    private String vchar2;

    private String vchar3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz == null ? null : dz.trim();
    }

    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm == null ? null : yzbm.trim();
    }

    public String getDq() {
        return dq;
    }

    public void setDq(String dq) {
        this.dq = dq == null ? null : dq.trim();
    }

    public String getJb() {
        return jb;
    }

    public void setJb(String jb) {
        this.jb = jb == null ? null : jb.trim();
    }

    public String getCws() {
        return cws;
    }

    public void setCws(String cws) {
        this.cws = cws == null ? null : cws.trim();
    }

    public String getFyljg() {
        return fyljg;
    }

    public void setFyljg(String fyljg) {
        this.fyljg = fyljg == null ? null : fyljg.trim();
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh == null ? null : dh.trim();
    }

    public String getYjkdh() {
        return yjkdh;
    }

    public void setYjkdh(String yjkdh) {
        this.yjkdh = yjkdh == null ? null : yjkdh.trim();
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb == null ? null : lb.trim();
    }

    public String getYpsr() {
        return ypsr;
    }

    public void setYpsr(String ypsr) {
        this.ypsr = ypsr == null ? null : ypsr.trim();
    }

    public String getYwsr() {
        return ywsr;
    }

    public void setYwsr(String ywsr) {
        this.ywsr = ywsr == null ? null : ywsr.trim();
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz == null ? null : cz.trim();
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

	public SysArea getSysArea() {
		return sysArea;
	}

	public void setSysArea(SysArea sysArea) {
		this.sysArea = sysArea;
	}
}