package domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author nikol
 */
/**
 * Represent the service.
 */
@NoArgsConstructor
@AllArgsConstructor
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
    @ToString.Include
    private String nazivUsluge;

    /**
     * The description of the service.
     *
     * @param opisUsluge New value for the description of this service.
     * @return The current value of the description of this service.
     */
    private String opisUsluge;

    /**
     * The object of sale which represented by this car part.
     *
     * @param predmetProdaje New value for the object of sale.
     * @return The current value of the object of sale.
     */
    private PredmetProdaje predmetProdaje;

    @Override
    public String getTableName() {
        return "usluga";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "nazivUsluge, opisUsluge, sifraPredmetaProdaje";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return "'" + nazivUsluge + "', '" + opisUsluge + "', "
                + predmetProdaje.getSifraPredmetaProdaje();
    }

    @Override
    public String getAttributesForUpdate() {
        return "nazivUsluge = '" + nazivUsluge + "', opisUsluge = '" + opisUsluge
                + "', sifraPredmetaProdaje = " + predmetProdaje.getSifraPredmetaProdaje();
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
