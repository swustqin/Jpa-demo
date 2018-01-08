package com.swust.qin.po;


import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @EmbeddedId
    private AccountId id;
    @Column(name = "name")
    private String name;
    @Column(name = "money")
    private Double age;

    public AccountId getId() {
        return id;
    }

    public void setId(AccountId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }
}
