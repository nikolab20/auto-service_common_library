package listeners;

import java.math.BigDecimal;

/**
 * Custom listener for listening pay bill dialog events.
 *
 * @author nikol
 */
public interface PayBillDialogListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * user request to confirm bill.
     */
    public void confirmBill();

    /**
     * Method for notifying all listeners which listening this listener that
     * user request to add debt to current client.
     *
     * @param debt is BigDecimal value of client debt.
     */
    public void addDebt(BigDecimal debt);
}
