package com.example.kodilla.goodpatterns.challenges.alledrogo.service;

import com.example.kodilla.goodpatterns.challenges.alledrogo.products.Product;
import com.example.kodilla.goodpatterns.challenges.alledrogo.users.User;

public interface OrderService {

    boolean order (User user, Product product);
}
