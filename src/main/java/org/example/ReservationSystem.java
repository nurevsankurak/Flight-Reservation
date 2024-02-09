package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    private List<Flight> flights = new ArrayList<>();

    public ReservationSystem() {

        flights.add(new Flight("TK101", "Istanbul", "Ankara", 99.99));
        flights.add(new Flight("TK102", "Istanbul", "Malatya", 109.99));
    }

    public void listFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public void reserveFlight(String flightCode) {
        for (Flight flight : flights) {
            if (flight.flightCode.equals(flightCode)) {
                System.out.println("Your reservation for flight " + flightCode + " has been completed.");
                return;
            }
        }
        System.out.println("Please enter a valid flight code.");
    }
}
