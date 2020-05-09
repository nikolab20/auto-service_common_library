package events;

import java.util.EventObject;

/**
 * Custom event class for button click.
 *
 * @author nikol
 */
public class ClickButtonEvent extends EventObject {

    /**
     * Parameterized constructor for this event.
     *
     * @param source an object which generate this event.
     */
    public ClickButtonEvent(Object source) {
        super(source);
    }

}
