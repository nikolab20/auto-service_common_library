package listeners;

import domain.StavkaRacuna;

/**
 * Custom listener for listening adding bill item.
 *
 * @author nikol
 */
public interface ObjectOfSaleDialogListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * form request to add bill item.
     *
     * @param stavkaRacuna a bill item to add.
     */
    public void addBillItem(StavkaRacuna stavkaRacuna);
}
