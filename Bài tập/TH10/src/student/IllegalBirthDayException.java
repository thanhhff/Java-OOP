package student;

public class IllegalBirthDayException extends Exception {
    public IllegalBirthDayException() {
    }

    public IllegalBirthDayException(String message) {
        super(message);
    }

    public IllegalBirthDayException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalBirthDayException(Throwable cause) {
        super(cause);
    }
}
