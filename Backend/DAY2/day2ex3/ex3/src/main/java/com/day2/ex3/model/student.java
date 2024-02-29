package com.day2.ex3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class student {
    private long id;
    private String name;
    @JsonIgnore
    private String greet;
    public student(long id,String name,String greet)
    {
        this.id=id;
        this.name=name;
        this.greet=greet;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGreet() {
        return greet;
    }
    public void setGreet(String greet) {
        this.greet = greet;
    }


}
