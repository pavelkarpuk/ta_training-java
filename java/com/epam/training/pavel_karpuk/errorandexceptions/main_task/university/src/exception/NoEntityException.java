package exception;

public class NoEntityException extends Exception {
    public NoEntityException(String message) {
        super(message);
    }

    public NoEntityException() {
    }
}
