package events;

import java.util.EventObject;

/**
 * Custom event class for button click.
 *
 * @author nikol
 */
public class SelectionChangeEvent extends EventObject {

    /**
     * Parameterized constructor for this event.
     *
     * @param source an object which generate this event.
     */
    public SelectionChangeEvent(Object source) {
        super(source);
    }
}
