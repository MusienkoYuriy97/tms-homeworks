package exercise2.exceptions;

public class ListIsEmptyException extends Exception {
    public ListIsEmptyException() {
    }

    public ListIsEmptyException(String message) {
        super(message);
    }

}
