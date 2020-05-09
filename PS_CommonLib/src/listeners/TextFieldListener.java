package listeners;

import events.TextEnterEvent;

/**
 * Custom listener for listening entering text in text field.
 *
 * @author nikol
 */
public interface TextFieldListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * user entered text into text field.
     *
     * @param evt custom event for text field.
     */
    void onInputText(TextEnterEvent evt);
}
