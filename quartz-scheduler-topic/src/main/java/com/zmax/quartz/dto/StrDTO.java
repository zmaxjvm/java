package com.zmax.quartz.dto;

import java.io.Serializable;

/**
 * Created by zmax.
 */
public class StrDTO implements Serializable {

    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
