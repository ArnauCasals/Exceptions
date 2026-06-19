package Exceptions.cinema;

import java.util.Scanner;

public class ConsoleUI {

    private ReservationService service;
    private Scanner scanner;

    public ConsoleUI(ReservationService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        int option;

        do {
            System.out.println("\n--- CINEMA MENU ---");
            System.out.println("1.- Show all reserved seats");
            System.out.println("2.- Show seats by person");
            System.out.println("3.- Reserve a seat");
            System.out.println("4.- Cancel a seat");
            System.out.println("5.- Cancel all seats by person");
            System.out.println("0.- Exit");

            option = readInt("Choose an option: ");

            try {
                switch (option) {

                    case 1 -> showAllSeats();
                    case 2 -> showSeatsByPerson();
                    case 3 -> reserveSeat();
                    case 4 -> cancelSeat();
                    case 5 -> cancelAllByPerson();
                    case 0 -> System.out.println("Goodbye!");

                    default -> System.out.println("Invalid option.");
                }

            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (option != 0);
    }

    // ---------- INPUT METHODS ----------

    private int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Invalid integer. Try again.");
                scanner.nextLine();
            }
        }
    }

    private String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    // ---------- ACTIONS ----------

    private void showAllSeats() {
        System.out.println(service.getAllSeats());
    }

    private void showSeatsByPerson() {
        String name = readString("Enter name: ");
        System.out.println(service.getSeatsByPerson(name));
    }

    private void reserveSeat() {
        int row = readInt("Row: ");
        int seat = readInt("Seat: ");
        String name = readString("Name: ");

        service.reserveSeat(row, seat, name);
        System.out.println("Seat reserved successfully.");
    }

    private void cancelSeat() {
        int row = readInt("Row: ");
        int seat = readInt("Seat: ");

        service.cancelSeat(row, seat);
        System.out.println("Seat cancelled successfully.");
    }

    private void cancelAllByPerson() {
        String name = readString("Name: ");

        service.cancelAllByPerson(name);
        System.out.println("All seats cancelled for " + name);
    }
}