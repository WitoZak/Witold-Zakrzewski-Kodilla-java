package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country belgium = new Country("Belgium", new BigInteger("345677456"));
        Country germany = new Country("Germany", new BigInteger("7896999"));
        Country spain = new Country("Spain", new BigInteger("67431000"));
        Country poland = new Country("Poland", new BigInteger("386145791888"));
        Country china = new Country("China", new BigInteger("1387160670"));
        Country india = new Country("India", new BigInteger("5426009090"));
        Country indonesia = new Country("Indonesia", new BigInteger("25546678"));
        Country southKorea = new Country("South Korea", new BigInteger("68903000"));
        Country canada = new Country("Canada", new BigInteger("313232044"));
        Country brazil = new Country("Brazil", new BigInteger("245459773"));
        Country mexico = new Country("Mexico", new BigInteger("11372422"));
        Country chile = new Country("Chile", new BigInteger("313312"));
        Country nigeria = new Country("Nigeria", new BigInteger("190632261"));
        Country rpa = new Country("RPA", new BigInteger("105350333"));
        Country egypt = new Country("Egypt", new BigInteger("97041567"));
        Country zambia = new Country("Zambia", new BigInteger("2214123"));

        Continent europe = new Continent("Europe");
        europe.addCountry(belgium);
        europe.addCountry(germany);
        europe.addCountry(spain);
        europe.addCountry(poland);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(indonesia);
        asia.addCountry(southKorea);

        Continent america = new Continent("America");
        america.addCountry(canada);
        america.addCountry(brazil);
        america.addCountry(mexico);
        america.addCountry(chile);

        Continent africa = new Continent("Africa");
        africa.addCountry(nigeria);
        africa.addCountry(rpa);
        africa.addCountry(egypt);
        africa.addCountry(zambia);


        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(america);
        world.addContinent(africa);

        BigInteger peopleQuantitySum = new BigInteger("394440032616");

        //When
        BigInteger peopleQuantityTest = world.getPeopleCount();

        //Then
        assertEquals(peopleQuantitySum, peopleQuantityTest);
    }


}
