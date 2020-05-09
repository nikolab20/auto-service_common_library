package listeners;

import domain.Klijent;

/**
 *
 * @author nikol
 */
public interface CustomerDialogListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on choose customer button.
     */
    public void chooseCustomer(Klijent klijent);
}
