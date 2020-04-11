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
 * Represents a invoice item.
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class StavkaRacuna implements Serializable, DomainObject {

    /**
     * The invoice which contains a current item.
     *
     * @param racun New value for the invoice which contains a current item.
     * This is an object of {@link Racun} class.
     * @return The current value of the invoice which contains a current item.
     */
    private Racun racun;

    /**
     * The number of the invoice item.
     *
     * @param RB New value for this invoice item number.
     * @return The current value of this invoice item number.
     */
    @EqualsAndHashCode.Include
    private Long RB;

    /**
     * The quantity of the products which represent the invoice item.
     *
     * @param kolicina New value for the quantity of this invoice item.
     * @return The current value of the quantity of this invoice item.
     */
    private BigDecimal kolicina;

    /**
     * The total price of the invoice item.
     *
     * @param ukupnaCena New value for the total price of this invoice item.
     * @return The current value of the total price of this invoice item.
     */
    private BigDecimal ukupnaCena;

    /**
     * The total price with tax of the invoice item.
     *
     * @param ukupnaCenaSaPorezom New value for the total price with tax of this
     * invoice item.
     * @return The current value of the total price with tax of this invoice
     * item.
     */
    private BigDecimal ukupnaCenaSaPorezom;

    /**
     * The string that represent the measurement unit.
     *
     * @param jedinicaMere New value for the measurement unit of this invoice
     * item.
     * @return The current value of the measurement unit of this invoice item.
     */
    private String jedinicaMere;

    /**
     * The object of sale which represent as invoice item.
     *
     * @param predmetProdaje New value for the object of sale. This is an object
     * of {@link PredmetProdaje} class.
     * @return The current value of the object of sale.
     */
    private PredmetProdaje predmetProdaje;

    @Override
    public String getTableName() {
        return "stavkaracuna";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "brojRacuna, RB, kolicina, ukupnaCena, ukupnaCenaSaPorezom, jedinicaMere, sifraPredmetaProdaje";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return racun.getBrojRacuna() + ", " + RB + ", " + kolicina + ", " + ukupnaCena + ", "
                + ukupnaCenaSaPorezom + ", '" + jedinicaMere + "', " + predmetProdaje.getSifraPredmetaProdaje();
    }

    @Override
    public String getAttributesForUpdate() {
        return "brojRacuna = " + racun.getBrojRacuna() + ", RB = " + RB + ", kolicina = " + kolicina
                + ", ukupnaCena = " + ukupnaCena + ", ukupnaCenaSaPorezom = " + ukupnaCenaSaPorezom
                + ", jedinicaMere = '" + jedinicaMere + "', sifraPredmetaProdaje = " + predmetProdaje.getSifraPredmetaProdaje();
    }

    @Override
    public String getIdentifierName() {
        return "RB";
    }

    @Override
    public boolean isAutoincrement() {
        return false;
    }

    @Override
    public void setObjectId(Long id) {
        setRB(id);
    }

    @Override
    public Long getObjectId() {
        return getRB();
    }
}
