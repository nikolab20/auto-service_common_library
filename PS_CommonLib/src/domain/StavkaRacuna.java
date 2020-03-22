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
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class StavkaRacuna implements Serializable, DomainObject {

    /**
     * The invoice which contains a current item.
     *
     * @param racun New value for the invoice which contains a current item. This is an object
     * of {@link Racun} class.
     * @return The current value of the invoice which contains a current item.
     */
    @NonNull
    private Racun racun;

    /**
     * The number of the invoice item.
     *
     * @param RB New value for this invoice item number.
     * @return The current value of this invoice item number.
     */
    @NonNull
    @EqualsAndHashCode.Include
    private Long RB;

    /**
     * The quantity of the products which represent the invoice item.
     *
     * @param kolicina New value for the quantity of this invoice item.
     * @return The current value of the quantity of this invoice item.
     */
    @NonNull
    private BigDecimal kolicina;

    /**
     * The price per unit of the current invoice item.
     *
     * @param cenaPoJedinici New value for the price per unit of this invoice item.
     * @return The current value of the price per unit of this invoice item.
     */
    @NonNull
    private BigDecimal cenaPoJedinici;

    /**
     * The price per unit with tax of the current invoice item.
     *
     * @param cenaPoJediniciSaPorezom New value for the price per unit with tax of this invoice item.
     * @return The current value of the price per unit with tax of this invoice item.
     */
    @NonNull
    private BigDecimal cenaPoJediniciSaPorezom;

    /**
     * The total price of the invoice item.
     *
     * @param ukupnaCena New value for the total price of this invoice item.
     * @return The current value of the total price of this invoice item.
     */
    @NonNull
    private BigDecimal ukupnaCena;

    /**
     * The total price with tax of the invoice item.
     *
     * @param ukupnaCenaSaPorezom New value for the total price with tax of this invoice item.
     * @return The current value of the total price with tax of this invoice item.
     */
    @NonNull
    private BigDecimal ukupnaCenaSaPorezom;

    /**
     * The string that represent the measurement unit.
     *
     * @param jedinicaMere New value for the measurement unit of this invoice item.
     * @return The current value of the measurement unit of this invoice item.
     */
    @NonNull
    private String jedinicaMere;

    /**
     * The object of sale which represent as invoice item.
     *
     * @param predmetProdaje New value for the object of sale. This is an object
     * of {@link PredmetProdaje} class.
     * @return The current value of the object of sale.
     */
    @NonNull
    private PredmetProdaje predmetProdaje;

    @Override
    public String getTableName() {
        return "stavkaracuna";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "brojRacuna, kolicina, cenaPoJedinici, cenaPoJediniciSaPorezom, ukupnaCena, " +
                "ukupnaCenaSaPorezom, jedinicaMere, sifraPredmetaProdaje";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return racun.getBrojRacuna() + ", " + kolicina + ", " + cenaPoJedinici + ", " +
                cenaPoJediniciSaPorezom + ", " + ukupnaCena + ", " + ukupnaCenaSaPorezom + ", '" +
                jedinicaMere + "', " + predmetProdaje.getSifraPredmetaProdaje();
    }

    @Override
    public String getAttributesForUpdate() {
        return "brojRacuna = " + racun.getBrojRacuna() + ", kolicina = " + kolicina +
                ", cenaPoJedinici = " + cenaPoJedinici + ", cenaPoJediniciSaPorezom = " + cenaPoJediniciSaPorezom +
                ", ukupnaCena = " + ukupnaCena + ", ukupnaCenaSaPorezom = " + ukupnaCenaSaPorezom +
                ", jedinicaMere = '" + jedinicaMere + "', sifraPredmetaProdaje = " + predmetProdaje.getSifraPredmetaProdaje();
    }

    @Override
    public String getIdentifierName() {
        return "RB";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
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
