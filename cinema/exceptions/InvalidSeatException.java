package Exceptions.cinema.exceptions;

public class InvalidSeatException extends RuntimeException {

    public InvalidSeatException() {
        super("The selected seat is out of range.");
    }
}