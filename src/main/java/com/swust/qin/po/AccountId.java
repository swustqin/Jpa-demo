package com.swust.qin.po;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AccountId implements Serializable {
    @Column(name = "id")
    private Integer id;
    @Column(name = "region")
    private Integer region;
    @Column(name = "city")
    private String city;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "AccountId{" +
                "id=" + id +
                ", region=" + region +
                ", city='" + city + '\'' +
                '}';
    }
}
