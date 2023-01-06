package com.example.kodilla.goodpatterns.challenges.airBooking;

public class Flights {

    private final String departure;
    private final String arrival;

    public Flights(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flights flights = (Flights) o;

        if (!departure.equals(flights.departure)) return false;
        return arrival.equals(flights.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + arrival.hashCode();
        return result;
    }
}
