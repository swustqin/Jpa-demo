package com.swust.qin.po;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserId implements Serializable{
    @Column(name = "id")
    private Integer id;
    @Column(name = "region")
    private Integer region;

    public UserId() {
    }

    public UserId(Integer id, Integer region) {
        this.id = id;
        this.region = region;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }
}
