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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      private String Uid;

    private String Uname;

    private String Upass;

    private String Uemail;

    private String roles;


    public String getUid() {
        return Uid;
    }

    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public String getUpass() {
        return Upass;
    }

    public void setUpass(String Upass) {
        this.Upass = Upass;
    }

    public String getUemail() {
        return Uemail;
    }

    public void setUemail(String Uemail) {
        this.Uemail = Uemail;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
        "Uid=" + Uid +
        ", Uname=" + Uname +
        ", Upass=" + Upass +
        ", Uemail=" + Uemail +
        ", roles=" + roles +
        "}";
    }
}
