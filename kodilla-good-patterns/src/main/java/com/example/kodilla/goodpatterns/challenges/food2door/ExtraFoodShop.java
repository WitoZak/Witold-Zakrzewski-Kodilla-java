package com.example.kodilla.goodpatterns.challenges.food2door;

import java.util.List;

public class ExtraFoodShop extends Suppliers implements ShopInfo, Order {
    public ExtraFoodShop(String companyName, String saleBranch, List<Products> products) {
        super(companyName, saleBranch, products);
    }

    @Override
    public void getInfo() {

    }
}
