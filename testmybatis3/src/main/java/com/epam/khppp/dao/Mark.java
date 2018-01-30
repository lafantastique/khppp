package com.epam.khppp.dao;

public class Mark {
    private Integer id;
    private String test_name;
    private String user_name;
    private Integer value;

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getTest_name() {
        return test_name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[ID: " + getId() + "] [Value:" + getValue() + "] [Test Name: "+ getTest_name() +"] [User Name: " + getUser_name() + "]";
    }
}
