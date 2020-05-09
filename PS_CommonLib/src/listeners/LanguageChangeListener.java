package listeners;

/**
 * Custom listener for listening language changing.
 *
 * @author nikol
 */
public interface LanguageChangeListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * form request to change language.
     */
    void chooseLanguage();
}
