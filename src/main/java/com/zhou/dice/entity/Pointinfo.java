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
public class Pointinfo implements Serializable {

    private static final long serialVersionUID = 1L;

      private String PointInfoId;

    private String Cid;

    private String PointName;

    private Integer PointCount;

    private String NextPage;


    public String getPointInfoId() {
        return PointInfoId;
    }

    public void setPointInfoId(String PointInfoId) {
        this.PointInfoId = PointInfoId;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String Cid) {
        this.Cid = Cid;
    }

    public String getPointName() {
        return PointName;
    }

    public void setPointName(String PointName) {
        this.PointName = PointName;
    }

    public Integer getPointCount() {
        return PointCount;
    }

    public void setPointCount(Integer PointCount) {
        this.PointCount = PointCount;
    }

    public String getNextPage() {
        return NextPage;
    }

    public void setNextPage(String NextPage) {
        this.NextPage = NextPage;
    }

    @Override
    public String toString() {
        return "Pointinfo{" +
        "PointInfoId=" + PointInfoId +
        ", Cid=" + Cid +
        ", PointName=" + PointName +
        ", PointCount=" + PointCount +
        ", NextPage=" + NextPage +
        "}";
    }
}
