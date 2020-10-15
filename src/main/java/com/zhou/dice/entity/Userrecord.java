package com.zhou.dice.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhounan
 * @since 2020-10-12
 */
public class Userrecord implements Serializable {

    private static final long serialVersionUID = 1L;

      private String Rid;

    private String Uid;

    private String Tid;

    private Integer PageNum;


    public String getRid() {
        return Rid;
    }

    public void setRid(String Rid) {
        this.Rid = Rid;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    public String getTid() {
        return Tid;
    }

    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    public Integer getPageNum() {
        return PageNum;
    }

    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    @Override
    public String toString() {
        return "Userrecord{" +
        "Rid=" + Rid +
        ", Uid=" + Uid +
        ", Tid=" + Tid +
        ", PageNum=" + PageNum +
        "}";
    }
}
