package Exceptions.cinema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of seats per row: ");
        int seatsPerRow = scanner.nextInt();

        ReservationService service = new ReservationService(rows, seatsPerRow);

        ConsoleUI ui = new ConsoleUI(service);

        ui.start();

        scanner.close();
    }
}