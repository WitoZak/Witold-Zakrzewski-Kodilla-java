package com.example.kodilla.goodpatterns.challenges.alledrogo.orders;

import com.example.kodilla.goodpatterns.challenges.alledrogo.products.Product;
import com.example.kodilla.goodpatterns.challenges.alledrogo.users.User;

public class OrderRequestRetriever {

    public OrderRequest newComer() {
        User user = new User("John", "Dow" );
        Product product = new Product("Star from Sky");

        return new OrderRequest(user, product);
    }
}
