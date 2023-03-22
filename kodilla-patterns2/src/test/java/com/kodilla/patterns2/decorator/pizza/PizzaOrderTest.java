package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {

    @Test
    void testBasicOrderGetCost() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //when
        BigDecimal calculatedCost = pizzaOrder.getCost();

        //then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    void testBasicPizzaOrderGetDescription() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //when
        String description = pizzaOrder.getDescription();

        //then
        assertEquals("Basic Margarita", description);
    }

    @Test
    void testBasicPizzaWithHamAndExtraCheese() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //when
        BigDecimal theCost = pizzaOrder.getCost();
        //then
        assertEquals(new BigDecimal(21), theCost);
    }

    @Test
    void testBasicPizzaPlusAllDecors() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ArugulaDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraSousDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        //when
        BigDecimal theCost = pizzaOrder.getCost();
        //then
        assertEquals(new BigDecimal(30), theCost);
    }

    @Test
    void testBasicPizzaPlusAllDecorsDescription() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ArugulaDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraSousDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        //when
        String description = pizzaOrder.getDescription();
        //then
        assertEquals("Basic Margarita + Arugula + Extra Cheese + Extra Sous + Ham + Onion + Salami", description);
    }

}