package listeners;

import events.ClickButtonEvent;

/**
 * Custom listener for listening press button event of an element.
 *
 * @author nikol
 */
public interface CustomComponentListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * button pressed.
     *
     * @param evt custom event of an custom element.
     */
    void pressButton(ClickButtonEvent evt);
}
