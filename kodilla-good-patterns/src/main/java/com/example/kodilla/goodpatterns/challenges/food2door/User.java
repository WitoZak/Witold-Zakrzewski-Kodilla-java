package com.example.kodilla.goodpatterns.challenges.food2door;

public class User {

    private final String name;
    private final String sureName;
    private final String email;
    private final String telephoneNumber;

    public User(String name, String sureName, String email, String telephoneNumber) {
        this.name = name;
        this.sureName = sureName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }
}
