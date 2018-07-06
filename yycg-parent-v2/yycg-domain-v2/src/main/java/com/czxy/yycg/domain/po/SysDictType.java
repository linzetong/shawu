package com.czxy.yycg.domain.po;

public class SysDictType {
    private String typecode;

    private String typename;

    private String remark;

    private Integer typesort;

    private Integer codelength;

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getTypesort() {
        return typesort;
    }

    public void setTypesort(Integer typesort) {
        this.typesort = typesort;
    }

    public Integer getCodelength() {
        return codelength;
    }

    public void setCodelength(Integer codelength) {
        this.codelength = codelength;
    }
}