package com.example.kodilla.goodpatterns.challenges.alledrogo;

import com.example.kodilla.goodpatterns.challenges.alledrogo.orders.OrderRequest;
import com.example.kodilla.goodpatterns.challenges.alledrogo.orders.OrderRequestRetriever;
import com.example.kodilla.goodpatterns.challenges.alledrogo.orders.ProductOrderService;
import com.example.kodilla.goodpatterns.challenges.alledrogo.orders.ProductionOrderRepository;
import com.example.kodilla.goodpatterns.challenges.alledrogo.service.CompletionOrderService;
import com.example.kodilla.goodpatterns.challenges.alledrogo.service.SmsService;

public class MainApp {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.newComer();

        ProductOrderService productOrderService = new ProductOrderService(
                new SmsService(),
                new CompletionOrderService(),
                new ProductionOrderRepository());
        productOrderService.process(orderRequest);

    }
}
