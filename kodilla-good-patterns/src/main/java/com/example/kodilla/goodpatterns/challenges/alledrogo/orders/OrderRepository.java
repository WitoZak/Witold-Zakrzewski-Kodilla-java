package com.example.kodilla.goodpatterns.challenges.alledrogo.orders;

import com.example.kodilla.goodpatterns.challenges.alledrogo.products.Product;
import com.example.kodilla.goodpatterns.challenges.alledrogo.users.User;

public interface OrderRepository {

    void OrderIsClosed (User user, Product product);
}
