package com.xujunjie.entity;

import java.util.Date;

/**
 * @description 英文单词
 * @author  许军杰
 *
 */
public class EnglishWord {
    private Integer id;
    private String english;
    private String china;
    private Date addDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getChina() {
        return china;
    }

    public void setChina(String china) {
        this.china = china;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
}
