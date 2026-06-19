package Exceptions.cinema.exceptions;

public class SeatAlreadyEmptyException extends RuntimeException {

    public SeatAlreadyEmptyException() {
        super("This seat is not reserved.");
    }
}