package com.example.kodilla.goodpatterns.challenges.airBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightRadar {

    private final List<Flights> line = new ArrayList<>();

    FlightRadar() {

        line.add(new Flights("Poznań", "Warszawa"));
        line.add(new Flights("Gdańsk", "Warszawa"));
        line.add(new Flights("Kraków", "Gdańsk"));
        line.add(new Flights("Wrocław", "Gdańsk"));
        line.add(new Flights("Warszawa", "Gdańsk"));
        line.add(new Flights("Kraków", "Radom"));
        line.add(new Flights("Wrocław", "Warszawa"));
        line.add(new Flights("Poznań", "Kraków"));
        line.add(new Flights("Warszawa", "Rzeszów"));
        line.add(new Flights("Radom", "Poznań"));
    }

    public List<Flights> getFlightsFrom(String from) {
        return line.stream().filter(n -> n.getDeparture().equals(from)).collect(Collectors.toList());
    }

    public List<Flights> getFlightsTo(String to) {
        return line.stream().filter(n -> n.getDeparture().equals(to)).collect(Collectors.toList());
    }

    public List<Flights> getFlightsThrough(String from, String to) {
        List<Flights> getFlightsFromPort = getFlightsFrom(from);
        List<Flights> getFlightsToPort = getFlightsTo(to);
        List<Flights> result = new ArrayList<>();
        for (Flights fromAirport : getFlightsFromPort) {
            for (Flights toAirport : getFlightsToPort) {
                if (fromAirport.getArrival().equals(toAirport.getDeparture())) {
                    result.add(fromAirport);
                    result.add(toAirport);
                }
            }
        }
        return result;
    }
}
