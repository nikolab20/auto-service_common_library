package listeners;

import events.SelectionChangeEvent;

/**
 * Custom listener for listening change selected item of an combo box.
 *
 * @author nikol
 */
public interface ComboBoxListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * selected item of combo box changed.
     *
     * @param evt custom event of combo box.
     */
    void onChangeSelected(SelectionChangeEvent evt);
}
