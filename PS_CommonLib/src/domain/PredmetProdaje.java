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
 * Represents the object of the sale.
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class PredmetProdaje implements Serializable, DomainObject {

    /**
     * The unique number of the object of the sale.
     *
     * @param sifraPredmetaProdaje New value for this object of the sale
     * attribute.
     * @return The current value of this object of the sale attribute.
     */
    @EqualsAndHashCode.Include
    private Long sifraPredmetaProdaje;

    /**
     * The price of the object of the sale.
     *
     * @param cena New value for the price of this object of the sale.
     * @return The current value of the price of this object of the sale.
     */
    private BigDecimal cena;

    /**
     * The price of the object of the sale with tax.
     *
     * @param cenaSaPorezom New value for the price with tax of this object of
     * the sale.
     * @return The current value of the price with tax of this object of the
     * sale.
     */
    private BigDecimal cenaSaPorezom;

    /**
     * The tax rate of the object of the sale.
     *
     * @param poreskaStopa New value for the tax rate of this object of the
     * sale. This is an object of {@link PoreskaStopa} class.
     * @return The current value of the tax rate of this object of the sale.
     */
    private PoreskaStopa poreskaStopa;

    @Override
    public String getTableName() {
        return "predmetprodaje";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "cena, cenaSaPorezom, id";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return cena + "," + cenaSaPorezom + ", " + poreskaStopa.getId();
    }

    @Override
    public String getAttributesForUpdate() {
        return "cena =" + cena + ", cenaSaPorezom = " + cenaSaPorezom + ", id = " + poreskaStopa.getId();
    }

    @Override
    public String getIdentifierName() {
        return "sifraPredmetaProdaje";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setSifraPredmetaProdaje(id);
    }

    @Override
    public Long getObjectId() {
        return sifraPredmetaProdaje;
    }
}
