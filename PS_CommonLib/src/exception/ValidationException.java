package exception;

/**
 * Custom exception class for validation.
 *
 * @author nikol
 */
public class ValidationException extends Exception {

    /**
     * Default non-parameterized constructor.
     */
    public ValidationException() {
    }

    /**
     * Parameterized constructor for this exception class.
     *
     * @param message an String which represents message for this custom
     * exception.
     */
    public ValidationException(String message) {
        super(message);
    }
}
