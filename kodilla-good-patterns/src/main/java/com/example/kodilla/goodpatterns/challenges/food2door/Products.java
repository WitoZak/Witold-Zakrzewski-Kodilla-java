package com.example.kodilla.goodpatterns.challenges.food2door;

public class Products {

    String productName;
    int productQuantity;


    public Products(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
