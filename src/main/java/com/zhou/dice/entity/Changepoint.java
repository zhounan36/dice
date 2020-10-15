package com.zhou.dice.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhounan
 * @since 2020-10-12
 */
public class Changepoint implements Serializable {

    private static final long serialVersionUID = 1L;

      private String Cid;

    private String Bid;

    private String ChangeName;

    private String Ctype;

    private Integer RollNum;

    private Integer PlayerNumLimit;

    private LocalDateTime CheckDateLimit;


    public String getCid() {
        return Cid;
    }

    public void setCid(String Cid) {
        this.Cid = Cid;
    }

    public String getBid() {
        return Bid;
    }

    public void setBid(String Bid) {
        this.Bid = Bid;
    }

    public String getChangeName() {
        return ChangeName;
    }

    public void setChangeName(String ChangeName) {
        this.ChangeName = ChangeName;
    }

    public String getCtype() {
        return Ctype;
    }

    public void setCtype(String Ctype) {
        this.Ctype = Ctype;
    }

    public Integer getRollNum() {
        return RollNum;
    }

    public void setRollNum(Integer RollNum) {
        this.RollNum = RollNum;
    }

    public Integer getPlayerNumLimit() {
        return PlayerNumLimit;
    }

    public void setPlayerNumLimit(Integer PlayerNumLimit) {
        this.PlayerNumLimit = PlayerNumLimit;
    }

    public LocalDateTime getCheckDateLimit() {
        return CheckDateLimit;
    }

    public void setCheckDateLimit(LocalDateTime CheckDateLimit) {
        this.CheckDateLimit = CheckDateLimit;
    }

    @Override
    public String toString() {
        return "Changepoint{" +
        "Cid=" + Cid +
        ", Bid=" + Bid +
        ", ChangeName=" + ChangeName +
        ", Ctype=" + Ctype +
        ", RollNum=" + RollNum +
        ", PlayerNumLimit=" + PlayerNumLimit +
        ", CheckDateLimit=" + CheckDateLimit +
        "}";
    }
}
