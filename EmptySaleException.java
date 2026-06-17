package Exceptions;

public class EmptySaleException extends RuntimeException {

    public EmptySaleException() {
        super("Empty sale error");
    }
}
