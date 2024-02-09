package org.example;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    String flightCode;
    String departure;
    String arrival;
    double price;

    public Flight(String flightCode, String departure, String arrival, double price) {
        this.flightCode = flightCode;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    @Override
    public String toString() {
        return flightCode + " - " + departure + " -> " + arrival + " | Price: " + price + " USD";
    }
}

