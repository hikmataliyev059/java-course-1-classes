package az.classes.Exception;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
