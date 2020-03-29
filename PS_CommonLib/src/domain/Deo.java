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
     * The object of sale which represented by this car part.
     *
     * @param sifraPredmetaProdaje New value for the id of object of sale. 
     * @return The current value of id of the object of sale.
     */
    @NonNull
    private long sifraPredmetaProdaje;

    @Override
    public String getTableName() {
        return "deo";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "serijskiBroj, nazivDela, proizvodjac, opis, sifraPredmetaProdaje";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return serijskiBroj + ", '" + nazivDela + "', '" + proizvodjac + "', '" + opis + "'," + sifraPredmetaProdaje;
    }

    @Override
    public String getAttributesForUpdate() {
        return "serijskiBroj = " + serijskiBroj + ", nazivDela = '" + nazivDela
                + "', proizvodjac = '" + proizvodjac + "', opis = '" + opis
                + "', sifraPredmetaProdaje = " + sifraPredmetaProdaje;
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
