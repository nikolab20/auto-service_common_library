package domain;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author nikol
 */
/**
 * Represent the tax rate.
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class PoreskaStopa implements Serializable, DomainObject {

    /**
     * The unique number of the tax rate.
     *
     * @param id New value for this tax rate attribute.
     * @return The current value of this attribute.
     */
    @EqualsAndHashCode.Include
    private Long id;

    /**
     * The tag of the tax rate.
     *
     * @param oznaka New value for the tag of this tax rate.
     * @return The current value of the tag of this tax rate.
     */
    private String oznaka;

    /**
     * The value of the tax rate.
     *
     * @param vrednost New value for the value of this tax rate.
     * @return The current value of the value of this tax rate.
     */
    private BigDecimal vrednost;

    @Override
    public String getTableName() {
        return "poreskastopa";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "id, oznaka, vrednost";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return id + ", '" + oznaka + "', " + vrednost;
    }

    @Override
    public String getAttributesForUpdate() {
        return "id = " + id + ", oznaka = '" + oznaka + "', vrednost = " + vrednost;
    }

    @Override
    public String getIdentifierName() {
        return "id";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setId(id);
    }

    @Override
    public Long getObjectId() {
        return id;
    }

    @Override
    public String toString() {
        return oznaka + " (" + vrednost + ")";
    }

}
