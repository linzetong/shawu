package com.czxy.yycg.domain.po;

import java.util.Date;

public class SysTaskFinis {
    private Integer id;

    private String taskType;

    private String data1;

    private String data2;

    private String data3;

    private String data4;

    private String data5;

    private Date taskAddDate;

    private Date taskFinisDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1 == null ? null : data1.trim();
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2 == null ? null : data2.trim();
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3 == null ? null : data3.trim();
    }

    public String getData4() {
        return data4;
    }

    public void setData4(String data4) {
        this.data4 = data4 == null ? null : data4.trim();
    }

    public String getData5() {
        return data5;
    }

    public void setData5(String data5) {
        this.data5 = data5 == null ? null : data5.trim();
    }

    public Date getTaskAddDate() {
        return taskAddDate;
    }

    public void setTaskAddDate(Date taskAddDate) {
        this.taskAddDate = taskAddDate;
    }

    public Date getTaskFinisDate() {
        return taskFinisDate;
    }

    public void setTaskFinisDate(Date taskFinisDate) {
        this.taskFinisDate = taskFinisDate;
    }
}