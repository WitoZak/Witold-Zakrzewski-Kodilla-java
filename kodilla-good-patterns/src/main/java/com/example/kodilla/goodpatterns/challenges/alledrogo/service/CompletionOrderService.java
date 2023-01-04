package com.example.kodilla.goodpatterns.challenges.alledrogo.service;

import com.example.kodilla.goodpatterns.challenges.alledrogo.products.Product;
import com.example.kodilla.goodpatterns.challenges.alledrogo.users.User;

public class CompletionOrderService implements OrderService {


    @Override
    public boolean order(User user, Product product) {
        return false;
    }
}
