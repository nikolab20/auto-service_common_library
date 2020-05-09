package listeners;

import javax.swing.table.AbstractTableModel;

/**
 * Custom listener for listening search requests from user.
 *
 * @author nikol
 */
public interface SearchListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * user request to search object from table.
     *
     * @param criteria is String that represents criteria for search.
     * @return
     */
    public AbstractTableModel searchOdo(String criteria);
}
