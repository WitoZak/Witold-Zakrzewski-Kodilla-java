package com.example.kodilla.goodpatterns.challenges.alledrogo.orders;

import com.example.kodilla.goodpatterns.challenges.alledrogo.products.Product;
import com.example.kodilla.goodpatterns.challenges.alledrogo.users.User;

public class ProductionOrderRepository implements OrderRepository {

    @Override
    public void OrderIsClosed(User user, Product product) {
        System.out.println("Payment accepted");
    }
}
