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
public class Card implements Serializable {

    private static final long serialVersionUID = 1L;

      private String Pid;

    private String Tid;

    private String Pname;

    private String Pcontent;

    private String Pimg;

    private Integer Ppage;

    private String Ptype;


    public String getPid() {
        return Pid;
    }

    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    public String getTid() {
        return Tid;
    }

    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public String getPcontent() {
        return Pcontent;
    }

    public void setPcontent(String Pcontent) {
        this.Pcontent = Pcontent;
    }

    public String getPimg() {
        return Pimg;
    }

    public void setPimg(String Pimg) {
        this.Pimg = Pimg;
    }

    public Integer getPpage() {
        return Ppage;
    }

    public void setPpage(Integer Ppage) {
        this.Ppage = Ppage;
    }

    public String getPtype() {
        return Ptype;
    }

    public void setPtype(String Ptype) {
        this.Ptype = Ptype;
    }

    @Override
    public String toString() {
        return "Card{" +
        "Pid=" + Pid +
        ", Tid=" + Tid +
        ", Pname=" + Pname +
        ", Pcontent=" + Pcontent +
        ", Pimg=" + Pimg +
        ", Ppage=" + Ppage +
        ", Ptype=" + Ptype +
        "}";
    }
}
