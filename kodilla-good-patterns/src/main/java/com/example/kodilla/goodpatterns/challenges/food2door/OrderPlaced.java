package com.example.kodilla.goodpatterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderPlaced {

    public static void request() {
        Products product = new Products("BioGouda Cheese", 56);
        Products product1 = new Products("Green Milk", 111);
        Products product2 = new Products("Light White Mozzarella", 78);

        List<Products> dairyList = new ArrayList<>();
        dairyList.add(product);
        dairyList.add(product2);

        HealthyShop healthyShop = new HealthyShop("HealthyShop", "Dairy", dairyList);
        healthyShop.getInfo();
        System.out.println("Your order status for each product:");
        System.out.println(healthyShop.process(product));
        System.out.println(healthyShop.process(product1));
        System.out.println(healthyShop.process(product2));

    }

}
