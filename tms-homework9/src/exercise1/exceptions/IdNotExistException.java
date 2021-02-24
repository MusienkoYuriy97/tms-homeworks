package exercise1.exceptions;

public class IdNotExistException extends Exception {
    public IdNotExistException() {
    }

    public IdNotExistException(String message) {
        super(message);
    }
}
