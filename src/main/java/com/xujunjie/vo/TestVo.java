package com.xujunjie.vo;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TestVo {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date myDate;
    private String name;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
