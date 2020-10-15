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
public class Section implements Serializable {

    private static final long serialVersionUID = 1L;

      private String Sid;

    private String Sname;


    public String getSid() {
        return Sid;
    }

    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    @Override
    public String toString() {
        return "Section{" +
        "Sid=" + Sid +
        ", Sname=" + Sname +
        "}";
    }
}
