package com.example.kodilla.goodpatterns.challenges.alledrogo.orders;

import com.example.kodilla.goodpatterns.challenges.alledrogo.products.Product;
import com.example.kodilla.goodpatterns.challenges.alledrogo.users.User;

public record OrderRequest(User user, Product product) {

}
