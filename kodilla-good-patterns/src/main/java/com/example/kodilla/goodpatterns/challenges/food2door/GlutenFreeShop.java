package com.example.kodilla.goodpatterns.challenges.food2door;

import java.util.List;

public class GlutenFreeShop extends Suppliers implements ShopInfo, Order {
    public GlutenFreeShop(String companyName, String saleBranch, List<Products> products) {
        super(companyName, saleBranch, products);
    }

    @Override
    public void getInfo() {

    }
}