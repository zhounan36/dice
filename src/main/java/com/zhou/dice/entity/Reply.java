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
public class Reply implements Serializable {

    private static final long serialVersionUID = 1L;

      private String Replyid;

    private String Bid;

    private String Uid;

    private String ReplyTitle;

    private String ReplyContext;


    public String getReplyid() {
        return Replyid;
    }

    public void setReplyid(String Replyid) {
        this.Replyid = Replyid;
    }

    public String getBid() {
        return Bid;
    }

    public void setBid(String Bid) {
        this.Bid = Bid;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    public String getReplyTitle() {
        return ReplyTitle;
    }

    public void setReplyTitle(String ReplyTitle) {
        this.ReplyTitle = ReplyTitle;
    }

    public String getReplyContext() {
        return ReplyContext;
    }

    public void setReplyContext(String ReplyContext) {
        this.ReplyContext = ReplyContext;
    }

    @Override
    public String toString() {
        return "Reply{" +
        "Replyid=" + Replyid +
        ", Bid=" + Bid +
        ", Uid=" + Uid +
        ", ReplyTitle=" + ReplyTitle +
        ", ReplyContext=" + ReplyContext +
        "}";
    }
}
