package com.kodilla.stream.world;

import java.math.BigInteger;

public class Country {

    private final String nameOfCountry;
    private final BigInteger peopleCount;

    public Country(String nameOfCountry, BigInteger peopleCount) {
        this.nameOfCountry = nameOfCountry;
        this.peopleCount = peopleCount;
    }

    public BigInteger getPeopleCount() {
        return peopleCount;
    }
}
