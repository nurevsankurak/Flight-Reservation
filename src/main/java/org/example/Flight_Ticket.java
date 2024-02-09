package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flight_Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationSystem system = new ReservationSystem();

        while (true) {
            System.out.println("Press 1 to list flights, 2 to make a reservation, or 0 to exit.");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    system.listFlights();
                    break;
                case "2":
                    System.out.println("Enter the flight code for your reservation:");
                    String flightCode = scanner.nextLine();
                    system.reserveFlight(flightCode);
                    break;
                case "0":
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid selection, please try again.");
                    break;
            }
        }
    }
}
