package com.xbmu.domin;

import java.util.Date;

public class Post {

    private Integer pId;
    private String pTitle;
    private String pAuthor;
    private String pType;
    private String pContent;
    private Date pDate;
    public Post(){

    }

    public Post(Integer pId, String pTitle, String pAuthor, String pType, String pContent, Date pDate) {
        this.pId = pId;
        this.pTitle = pTitle;
        this.pAuthor = pAuthor;
        this.pType = pType;
        this.pContent = pContent;
        this.pDate = pDate;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getpAuthor() {
        return pAuthor;
    }

    public void setpAuthor(String pAuthor) {
        this.pAuthor = pAuthor;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "pId=" + pId +
                ", pTitle='" + pTitle + '\'' +
                ", pAuthor='" + pAuthor + '\'' +
                ", pType='" + pType + '\'' +
                ", pContent='" + pContent + '\'' +
                ", pDate=" + pDate +
                '}';
    }
}
