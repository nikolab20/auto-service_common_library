package listeners;

/**
 * Custom listener for listening table events.
 *
 * @author nikol
 */
public interface TableListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * user clicked on an row in table.
     *
     * @param row is index of row which user clicked on it.
     */
    public void clickRow(int row);
}
