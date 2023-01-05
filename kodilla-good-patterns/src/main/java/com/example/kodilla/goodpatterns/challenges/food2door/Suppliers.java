package com.example.kodilla.goodpatterns.challenges.food2door;

import java.util.List;

public class Suppliers {

    String companyName;
    String saleBranch;
    List<Products> products;

    public Suppliers(String companyName, String saleBranch, List<Products> products) {
        this.companyName = companyName;
        this.saleBranch = saleBranch;
        this.products = products;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getSaleBranch() {
        return saleBranch;
    }

    public void companyTag() {
        System.out.println("Company Name: " + this.companyName + "\nCompany sale branch: "
                + this.saleBranch + " \n" + "products that the company sells:");
        for (Products product : products) {
            System.out.println(product);
        }
    }
    public boolean process(Products product) {
        List<?> tempList = products.stream()
                .map(Products::getProductName)
                .filter((s -> s.equals(product.getProductName())))
                .toList();
        return !tempList.isEmpty();
    }
}
