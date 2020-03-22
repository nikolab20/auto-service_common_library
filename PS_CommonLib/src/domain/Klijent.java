/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author nikol
 */

/**
 * Represents the customer of the car service.
 */
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(includeFieldNames = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Klijent implements Serializable, DomainObject {

    /**
     * The unique number of the customer.
     *
     * @param sifraKlijenta New value for this customer attribute.
     * @return The current value of this attribute.
     */
    @EqualsAndHashCode.Include
    private Long sifraKlijenta;

    /**
     * The first name of the customer.
     *
     * @param imeKlijenta New value for this customer's first name.
     * @return The current value of this customer's first name.
     */
    @NonNull
    @ToString.Include
    private String imeKlijenta;

    /**
     * The last name of the customer.
     *
     * @param prezimeKlijenta New value for this customer's last name.
     * @return The current value of this customer's last name.
     */
    @NonNull
    @ToString.Include
    private String prezimeKlijenta;

    /**
     * The number of client visits.
     *
     * @param brojPoseta New value for this customer's visit count.
     * @return The current value of this customer's visit count.
     */
    @NonNull
    private int brojPoseta;

    /**
     * The amount of the customer's debt.
     *
     * @param dug New value for this customer's debt.
     * @return The current value of this customer's debt.
     */
    @NonNull
    private BigDecimal dug;

    @Override
    public String getTableName() {
        return "klijent";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "imeKlijenta, prezimeKlijenta, brojPoseta, dug";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return "'" + imeKlijenta + "', '" + prezimeKlijenta + "', " + brojPoseta + ", " + dug;
    }

    @Override
    public String getAttributesForUpdate() {
        return "imeKlijenta = '" + imeKlijenta + "', prezimeKlijenta = '" + prezimeKlijenta +
                "', brojPoseta = " + brojPoseta + ", dug = " + dug;
    }

    @Override
    public String getIdentifierName() {
        return "sifraKlijenta";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setSifraKlijenta(id);
    }

    @Override
    public Long getObjectId() {
        return sifraKlijenta;
    }
}
