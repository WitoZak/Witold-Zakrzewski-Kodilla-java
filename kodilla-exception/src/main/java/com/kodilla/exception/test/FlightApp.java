package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightApp {

    public static void main(String[] args) {

        Map<String, Boolean> activeAirports = new HashMap<>();
        activeAirports.put("Berlin", true);
        activeAirports.put("Barcelona", false);
        activeAirports.put("Briton", true);
        activeAirports.put("Boston", false);

        FlightFinder availableAirports = new FlightFinder(activeAirports);

        Flight flight =

                new Flight("Berlin", "Budapest");

        try {
            if (availableAirports.findFlight(flight)) {
                System.out.println("Fly available");
            } else {
                System.out.println("Fly not available");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Fly IMPOSSIBLE!!");
        }

    }
}