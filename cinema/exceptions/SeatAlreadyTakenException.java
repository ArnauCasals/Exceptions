package Exceptions.cinema.exceptions;

public class SeatAlreadyTakenException extends RuntimeException {

    public SeatAlreadyTakenException() {
        super("This seat is already reserved.");
    }
}