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
 * Represents the car part.
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Deo implements Serializable, DomainObject {

    /**
     * The unique serial number number of the car part.
     *
     * @param serijskiBroj New value for the serial number of this car part.
     * @return The current value of the serial number of this car part.
     */
    @EqualsAndHashCode.Include
    private Long serijskiBroj;

    /**
     * The name of the car part.
     *
     * @param nazivDela New value for the name of this car part.
     * @return The current value of the name of this car part.
     */
    @ToString.Include
    @NonNull
    private String nazivDela;

    /**
     * The name of car part manufacturer.
     *
     * @param proizvodjac New value for the name of the manufacturer of this car
     * part.
     * @return The current value of the name of the manufacturer of this car
     * part.
     */
    @NonNull
    private String proizvodjac;

    /**
     * Description of car part.
     *
     * @param opis New value for the description of this car part.
     * @return The current value of the description of this car part.
     */
    @NonNull
    private String opis;

    /**
     * The price of a car part.
     *
     * @param cena New value for the price of this car part.
     * @return The current value of the price of this car part.
     */
    @NonNull
    private BigDecimal cena;

    /**
     * The object of sale which represented by this car part.
     *
     * @param predmetProdaje New value for the object of sale. This is an object
     * of {@link PredmetProdaje} class.
     * @return The current value of the object of sale.
     */
    @NonNull
    private PredmetProdaje predmetProdaje;

    @Override
    public String getTableName() {
        return "deo";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "serijskiBroj, nazivDela, proizvodjac, opis, cena, sifraPredmetaProdaje";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return serijskiBroj + ", '" + nazivDela + "', '" + proizvodjac + "', '" + opis + "',"
                + cena + ", " + predmetProdaje.getSifraPredmetaProdaje();
    }

    @Override
    public String getAttributesForUpdate() {
        return "serijskiBroj = " + serijskiBroj + ", nazivDela = '" + nazivDela
                + "', proizvodjac = '" + proizvodjac + "', opis = '" + opis
                + "', cena = " + cena + ", sifraPredmetaProdaje = " + predmetProdaje.getSifraPredmetaProdaje();
    }

    @Override
    public String getIdentifierName() {
        return "serijskiBroj";
    }

    @Override
    public boolean isAutoincrement() {
        return false;
    }

    @Override
    public void setObjectId(Long id) {
        setSerijskiBroj(id);
    }

    @Override
    public Long getObjectId() {
        return serijskiBroj;
    }
}
