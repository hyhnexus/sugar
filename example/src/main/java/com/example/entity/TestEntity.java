package com.example.entity;

import com.orm.annotation.MultiUnique;
import com.orm.annotation.Table;
import com.orm.annotation.Unique;

import java.io.Serializable;

/**
 * Created by huanhuan on 2018/1/18.
 */
@MultiUnique(value = "kid, kname")
@Table(name = "test")
public class TestEntity implements Serializable {
    private String kid;
    private String kname;
    @Unique
    private long update_time;

    public long getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(long update_time) {
        this.update_time = update_time;
    }

    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }
}