package Exceptions;

public class EmptySaleException extends Exception {

    public EmptySaleException() {
        super("Empty sale error");
    }
}
