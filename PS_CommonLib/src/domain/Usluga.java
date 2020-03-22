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
 * Represent the service.
 */
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(includeFieldNames = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Usluga implements Serializable, DomainObject {

    /**
     * The unique number of the service.
     *
     * @param sifraUsluge New value for this service attribute.
     * @return The current value of this service attribute.
     */
    @EqualsAndHashCode.Include
    private Long sifraUsluge;

    /**
     * The name of the service.
     *
     * @param nazivUsluge New value for the name of this service.
     * @return The current value of the name of this service.
     */
    @NonNull
    @ToString.Include
    private String nazivUsluge;

    /**
     * The description of the service.
     *
     * @param opisUsluge New value for the description of this service.
     * @return The current value of the description of this service.
     */
    @NonNull
    private String opisUsluge;

    /**
     * The price of the service.
     *
     * @param cena New value for the price of this service.
     * @return The current value of the price of this service.
     */
    @NonNull
    private BigDecimal cena;

    /**
     * The object of sale which represented by this service.
     *
     * @param predmetProdaje New value for the object of sale. This is an object
     * of {@link PredmetProdaje} class.
     * @return The current value of the object of sale.
     */
    @NonNull
    private PredmetProdaje predmetProdaje;


    @Override
    public String getTableName() {
        return "usluga";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "nazivUsluge, opisUsluge, cena, sifraPredmetaProdaje";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return "'" + nazivUsluge + "', '" + opisUsluge + "', " + cena + ", " +
                predmetProdaje.getSifraPredmetaProdaje();
    }

    @Override
    public String getAttributesForUpdate() {
        return "nazivUsluge = '" + nazivUsluge + "', opisUsluge '" + opisUsluge + "', cena = " + cena +
                ", sifraPredmetaProdaje = " + predmetProdaje.getSifraPredmetaProdaje();
    }

    @Override
    public String getIdentifierName() {
        return "sifraUsluge";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setSifraUsluge(id);
    }

    @Override
    public Long getObjectId() {
        return sifraUsluge;
    }
}
