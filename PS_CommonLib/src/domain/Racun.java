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
 * Represents a customer invoice.
 */
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(includeFieldNames = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Racun implements Serializable, DomainObject {

    /**
     * The unique number of the invoice.
     *
     * @param brojRacuna New value for this invoice attribute.
     * @return The current value of this attribute.
     */
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long brojRacuna;

    /**
     * The total value of the invoice.
     *
     * @param ukupnaVrednost New value for the total value of this invoice.
     * @return The current value of the total value of this invoice.
     */
    @NonNull
    private BigDecimal ukupnaVrednost;

    /**
     * The total value of the invoice with tax.
     *
     * @param ukupnaVrednostSaPorezom New value for the total value with tax of this invoice.
     * @return The current value of the total value with tax of this invoice.
     */
    @NonNull
    private BigDecimal ukupnaVrednostSaPorezom;

    /**
     * Indicates whether the invoice has been processed.
     *
     * @param obradjen New value for this invoice attribute.
     * @return The current value of this invoice attribute.
     */
    @NonNull
    private boolean obradjen;

    /**
     * Indicates whether the invoice has been canceled.
     *
     * @param storniran New value for this invoice attribute.
     * @return The current value of this invoice attribute.
     */
    @NonNull
    private boolean storniran;

    /**
     * Represent the worker who create the invoice.
     *
     * @param radnik New value for the worker who created this account. This is an object
     * of {@link Radnik} class.
     * @return The current value of the worker who created this account.
     */
    @NonNull
    private Radnik radnik;

    /**
     * Representing the customer for who the worker creates the invoice.
     *
     * @param klijent New value the customer for who the worker creates the invoice. This is an object
     * of {@link Klijent} class.
     * @return The current value of the customer for who the worker creates the invoice.
     */
    @NonNull
    private Klijent klijent;

    @Override
    public String getTableName() {
        return "racun";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "ukupnaVrednost, ukupnaVrednostSaPorezom, obradjen, storniran, sifraRadnika, sifraKlijenta";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return ukupnaVrednost + ", " + ukupnaVrednostSaPorezom + ", " + obradjen + ", " +
                storniran + ", " + radnik.getSifraRadnika() + ", " + klijent.getSifraKlijenta();
    }

    @Override
    public String getAttributesForUpdate() {
        return "ukupnaVrednost = " + ukupnaVrednost + ", ukupnaVrednostSaPorezom = " + ukupnaVrednostSaPorezom +
                ", obradjen = " + obradjen + ", storniran = " + storniran + ", sifraRadnika = " +
                radnik.getSifraRadnika() + ", sifraKlijenta = " + klijent.getSifraKlijenta();
    }

    @Override
    public String getIdentifierName() {
        return "brojRacuna";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setBrojRacuna(id);
    }

    @Override
    public Long getObjectId() {
        return brojRacuna;
    }
}
