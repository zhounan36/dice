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
public class Dice implements Serializable {

    private static final long serialVersionUID = 1L;

      private String Did;

    private String Uid;

    private String Dtype;

    private String TopicLimtId;

    private Integer Used;

    private Integer RollNum;

    private String RollTopic;

    private String RollBody;


    public String getDid() {
        return Did;
    }

    public void setDid(String Did) {
        this.Did = Did;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    public String getDtype() {
        return Dtype;
    }

    public void setDtype(String Dtype) {
        this.Dtype = Dtype;
    }

    public String getTopicLimtId() {
        return TopicLimtId;
    }

    public void setTopicLimtId(String TopicLimtId) {
        this.TopicLimtId = TopicLimtId;
    }

    public Integer getUsed() {
        return Used;
    }

    public void setUsed(Integer Used) {
        this.Used = Used;
    }

    public Integer getRollNum() {
        return RollNum;
    }

    public void setRollNum(Integer RollNum) {
        this.RollNum = RollNum;
    }

    public String getRollTopic() {
        return RollTopic;
    }

    public void setRollTopic(String RollTopic) {
        this.RollTopic = RollTopic;
    }

    public String getRollBody() {
        return RollBody;
    }

    public void setRollBody(String RollBody) {
        this.RollBody = RollBody;
    }

    @Override
    public String toString() {
        return "Dice{" +
        "Did=" + Did +
        ", Uid=" + Uid +
        ", Dtype=" + Dtype +
        ", TopicLimtId=" + TopicLimtId +
        ", Used=" + Used +
        ", RollNum=" + RollNum +
        ", RollTopic=" + RollTopic +
        ", RollBody=" + RollBody +
        "}";
    }
}
