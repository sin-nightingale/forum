package com.xbmu.domin;

import java.util.Date;

public class Comment {

    private Integer c_id;
    private String c_content;
    private Date c_time;
    private Integer floor;
    public Comment(){
    }

    public Comment(Integer c_id, String c_content, Date c_time, Integer floor) {
        this.c_id = c_id;
        this.c_content = c_content;
        this.c_time = c_time;
        this.floor = floor;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_content() {
        return c_content;
    }

    public void setC_content(String c_content) {
        this.c_content = c_content;
    }

    public Date getC_time() {
        return c_time;
    }

    public void setC_time(Date c_time) {
        this.c_time = c_time;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "c_id=" + c_id +
                ", c_content='" + c_content + '\'' +
                ", c_time=" + c_time +
                ", floor=" + floor +
                '}';
    }
}
