package Exceptions.cinema.exceptions;

public class InvalidPersonNameException extends RuntimeException {

    public InvalidPersonNameException() {
        super("The name cannot contain numbers");
    }
}