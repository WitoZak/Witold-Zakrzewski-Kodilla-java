package com.example.kodilla.goodpatterns.challenges.alledrogo.dto;

import com.example.kodilla.goodpatterns.challenges.alledrogo.users.User;

public class OrderDto {

    public User user;
    public boolean isOrdered;

    public OrderDto (final User user, final  boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
}
