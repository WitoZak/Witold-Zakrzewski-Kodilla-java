package com.example.kodilla.goodpatterns.challenges.alledrogo.orders;

import com.example.kodilla.goodpatterns.challenges.alledrogo.dto.OrderDto;
import com.example.kodilla.goodpatterns.challenges.alledrogo.service.InformationService;
import com.example.kodilla.goodpatterns.challenges.alledrogo.service.OrderService;

public class ProductOrderService {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;


    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isOrdered = orderService.order(orderRequest.user(), orderRequest.product());
        if (isOrdered) {
            informationService.sendMessage(orderRequest.user());
            orderRepository.OrderIsClosed(orderRequest.user(), orderRequest.product());
            return new OrderDto(orderRequest.user(), true);
        } else {
            return new OrderDto(orderRequest.user(), false);
        }
    }
}
