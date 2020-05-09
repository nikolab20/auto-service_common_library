package listeners;

/**
 * Custom listener for listening requests for password generating.
 *
 * @author nikol
 */
public interface PasswordListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * form request to generate password.
     *
     * @return generated password as String.
     */
    String generatePassword();
}
