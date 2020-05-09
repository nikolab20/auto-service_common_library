package listeners;

/**
 * Custom listener for listening open an form.
 *
 * @author nikol
 */
public interface FormListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on add customer button.
     */
    void openAddCustomer();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on update customer button.
     */
    void openUpdateCustomer();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on search customer button.
     */
    void openSearchCustomer();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on add employee button.
     */
    void openAddEmployee();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on update employee button.
     */
    void openUpdateEmployee();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on delete employee button.
     */
    void openDeleteEmployee();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on add car part button.
     */
    void openAddCarPart();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on update car part button.
     */
    void openUpdateCarPart();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on search car part button.
     */
    void openSearchCarPart();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on add service button.
     */
    void openAddService();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on update service button.
     */
    void openUpdateService();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on delete service button.
     */
    void openDeleteService();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on add bill button.
     */
    void openAddBill();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on invalidate bill button.
     */
    void openInvalidateBill();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on bills from date button.
     */
    void openBillsFromDate();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on new client button.
     */
    void openNewClientsFromDate();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on clients debt button.
     */
    void openClientsDebt();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on choose language button.
     */
    void openChooseLanguage();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on add tax button.
     */
    void openAddTax();

    /**
     * Method for notifying all listeners which listening this listener that
     * client clicked on delete tax button.
     */
    void openDeleteTax();
}
