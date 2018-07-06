package com.czxy.yycg.domain.po;

import javax.persistence.Id;

public class YycgdMx {
	@Id
    private String id;

    private Long yycgdId;
    private String ypxxId;
    
    private Ypxx ypxx;
    private Yycgd yycgd;		//采购单
    

    private Float zbjg;

    private Float jyjg;

    private Integer cgl;

    private Float cgje;

    private String cgzt;
    private SysDictInfo sysDictInfoCgzt;

    private String vchar1;

    private String vchar2;

    private String vchar3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getYycgdId() {
        return yycgdId;
    }

    public void setYycgdId(Long yycgdId) {
        this.yycgdId = yycgdId;
    }

    public String getYpxxId() {
        return ypxxId;
    }

    public void setYpxxId(String ypxxId) {
        this.ypxxId = ypxxId == null ? null : ypxxId.trim();
    }

    public Float getZbjg() {
        return zbjg;
    }

    public void setZbjg(Float zbjg) {
        this.zbjg = zbjg;
    }

    public Float getJyjg() {
        return jyjg;
    }

    public void setJyjg(Float jyjg) {
        this.jyjg = jyjg;
    }

    public Integer getCgl() {
        return cgl;
    }

    public void setCgl(Integer cgl) {
        this.cgl = cgl;
    }

    public Float getCgje() {
        return cgje;
    }

    public void setCgje(Float cgje) {
        this.cgje = cgje;
    }

    public String getCgzt() {
        return cgzt;
    }

    public void setCgzt(String cgzt) {
        this.cgzt = cgzt == null ? null : cgzt.trim();
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

	public Ypxx getYpxx() {
		return ypxx;
	}

	public void setYpxx(Ypxx ypxx) {
		this.ypxx = ypxx;
	}

	public Yycgd getYycgd() {
		return yycgd;
	}

	public void setYycgd(Yycgd yycgd) {
		this.yycgd = yycgd;
	}

	public SysDictInfo getSysDictInfoCgzt() {
		return sysDictInfoCgzt;
	}

	public void setSysDictInfoCgzt(SysDictInfo sysDictInfoCgzt) {
		this.sysDictInfoCgzt = sysDictInfoCgzt;
	}
}