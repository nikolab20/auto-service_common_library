package listeners;

import java.math.BigDecimal;

/**
 *
 * @author nikol
 */
public interface PayBillDialogListener {
    public void confirmBill();
    
    public void addDebt(BigDecimal debt);
}
