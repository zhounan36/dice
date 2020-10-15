package com.zhou.dice.entity;

import java.time.LocalDate;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhounan
 * @since 2020-10-12
 */
public class Topic implements Serializable {

    private static final long serialVersionUID = 1L;

      private String Tid;

    private String Sid;

    private String Uid;

    private String Tname;

    private String Tcontent;

    private LocalDate Tdate;

    private Integer TreplyCount;

    private LocalDate Tlastdate;


    public String getTid() {
        return Tid;
    }

    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String Tname) {
        this.Tname = Tname;
    }

    public String getTcontent() {
        return Tcontent;
    }

    public void setTcontent(String Tcontent) {
        this.Tcontent = Tcontent;
    }

    public LocalDate getTdate() {
        return Tdate;
    }

    public void setTdate(LocalDate Tdate) {
        this.Tdate = Tdate;
    }

    public Integer getTreplyCount() {
        return TreplyCount;
    }

    public void setTreplyCount(Integer TreplyCount) {
        this.TreplyCount = TreplyCount;
    }

    public LocalDate getTlastdate() {
        return Tlastdate;
    }

    public void setTlastdate(LocalDate Tlastdate) {
        this.Tlastdate = Tlastdate;
    }

    @Override
    public String toString() {
        return "Topic{" +
        "Tid=" + Tid +
        ", Sid=" + Sid +
        ", Uid=" + Uid +
        ", Tname=" + Tname +
        ", Tcontent=" + Tcontent +
        ", Tdate=" + Tdate +
        ", TreplyCount=" + TreplyCount +
        ", Tlastdate=" + Tlastdate +
        "}";
    }
}
