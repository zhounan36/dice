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
public class Body implements Serializable {

    private static final long serialVersionUID = 1L;

    private String Bid;

    private String Tid;

    private String Uid;

    private String Bcontent;

    private LocalDate Bdate;

    private String Btype;

    private Integer Bpage;

    private String BnextPageId;


    public String getBid() {
        return Bid;
    }

    public void setBid(String Bid) {
        this.Bid = Bid;
    }

    public String getTid() {
        return Tid;
    }

    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    public String getBcontent() {
        return Bcontent;
    }

    public void setBcontent(String Bcontent) {
        this.Bcontent = Bcontent;
    }

    public LocalDate getBdate() {
        return Bdate;
    }

    public void setBdate(LocalDate Bdate) {
        this.Bdate = Bdate;
    }

    public String getBtype() {
        return Btype;
    }

    public void setBtype(String Btype) {
        this.Btype = Btype;
    }

    public Integer getBpage() {
        return Bpage;
    }

    public void setBpage(Integer Bpage) {
        this.Bpage = Bpage;
    }

    public String getBnextPageId() {
        return BnextPageId;
    }

    public void setBnextPageId(String BnextPageId) {
        this.BnextPageId = BnextPageId;
    }

    @Override
    public String toString() {
        return "Body{" +
        "Bid=" + Bid +
        ", Tid=" + Tid +
        ", Uid=" + Uid +
        ", Bcontent=" + Bcontent +
        ", Bdate=" + Bdate +
        ", Btype=" + Btype +
        ", Bpage=" + Bpage +
        ", BnextPageId=" + BnextPageId +
        "}";
    }
}
