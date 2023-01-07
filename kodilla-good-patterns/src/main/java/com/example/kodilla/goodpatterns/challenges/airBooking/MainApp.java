package com.example.kodilla.goodpatterns.challenges.airBooking;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        FlightRadar flightRadar = new FlightRadar();
        List<Flights> from = flightRadar.getFlightsFrom("Poznań");
        showFlights(from, "From");
        List<Flights> to = flightRadar.getFlightsTo("Gdańsk");
        showFlights(to, "To");
        List<Flights> through = flightRadar.getFlightsThrough("Poznań", "Gdańsk");
        showFlights(through, "Through");

    }

    public static void showFlights(List<Flights> n, String destination) {
        System.out.println(destination);
        for (Flights f : n) {
            System.out.println(f);
        }
        System.out.println();
    }
}
