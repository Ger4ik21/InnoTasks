package com.javawork.designapptasks.javaclasses;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String squareAvatarUrl;
    private List<String> description;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSquareAvatarUrl() {
        return squareAvatarUrl;
    }

    public void setSquareAvatarUrl(String squareAvatarUrl) {
        this.squareAvatarUrl = squareAvatarUrl;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public User(){}
}
