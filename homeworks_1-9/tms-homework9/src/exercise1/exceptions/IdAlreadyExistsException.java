package exercise1.exceptions;

public class IdAlreadyExistsException extends Exception {
    public IdAlreadyExistsException() {
    }

    public IdAlreadyExistsException(String message) {
        super(message);
    }
}
