package student;

public class IllegalGPAException extends Exception {
    public IllegalGPAException() {
    }

    public IllegalGPAException(String message) {
        super(message);
    }

    public IllegalGPAException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalGPAException(Throwable cause) {
        super(cause);
    }
}
