package com.vone.mq.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Setting {
    @Id
    private String vkey;
    private String vvalue;

    public String getVkey() {
        return vkey;
    }

    public void setVkey(String vkey) {
        this.vkey = vkey;
    }

    public String getVvalue() {
        return vvalue;
    }

    public void setVvalue(String vvalue) {
        this.vvalue = vvalue;
    }
}
