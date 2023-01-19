package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class BigMacTestSuite {

    @Test
    void testNewBigMac() {
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .bun("Roll")
                .burgers(2)
                .sauce("Spice")
                .ingredient("Lattice")
                .ingredient("Tomato")
                .sauce("Garlic")
                .ingredient("Olives")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals ("Ingredients count", 3, howManyIngredients);
    }
}
