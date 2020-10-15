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
public class Favorite implements Serializable {

    private static final long serialVersionUID = 1L;

      private String Fid;

    private String Uid;

    private String Tid;


    public String getFid() {
        return Fid;
    }

    public void setFid(String Fid) {
        this.Fid = Fid;
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

    @Override
    public String toString() {
        return "Favorite{" +
        "Fid=" + Fid +
        ", Uid=" + Uid +
        ", Tid=" + Tid +
        "}";
    }
}
