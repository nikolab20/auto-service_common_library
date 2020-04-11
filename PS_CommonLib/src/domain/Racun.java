/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author nikol
 */
/**
 * Represents a customer invoice.
 */
@NoArgsConstructor
@AllArgsConstructor
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
    
    @EqualsAndHashCode.Include
    private Date datumIzdavanja;

    /**
     * The total value of the invoice.
     *
     * @param ukupnaVrednost New value for the total value of this invoice.
     * @return The current value of the total value of this invoice.
     */
    private BigDecimal ukupnaVrednost;

    /**
     * The total value of the invoice with tax.
     *
     * @param ukupnaVrednostSaPorezom New value for the total value with tax of
     * this invoice.
     * @return The current value of the total value with tax of this invoice.
     */
    private BigDecimal ukupnaVrednostSaPorezom;

    /**
     * Indicates whether the invoice has been processed.
     *
     * @param obradjen New value for this invoice attribute.
     * @return The current value of this invoice attribute.
     */
    private boolean obradjen;

    /**
     * Indicates whether the invoice has been canceled.
     *
     * @param storniran New value for this invoice attribute.
     * @return The current value of this invoice attribute.
     */
    private boolean storniran;

    /**
     * Represent the worker who create the invoice.
     *
     * @param radnik New value for the worker who created this account. This is
     * an object of {@link Radnik} class.
     * @return The current value of the worker who created this account.
     */
    private Radnik radnik;

    /**
     * Representing the customer for who the worker creates the invoice.
     *
     * @param klijent New value the customer for who the worker creates the
     * invoice. This is an object of {@link Klijent} class.
     * @return The current value of the customer for who the worker creates the
     * invoice.
     */
    private Klijent klijent;
    
    @Override
    public String getTableName() {
        return "racun";
    }
    
    @Override
    public String getAttributeNamesForInsert() {
        return "datumIzdavanja, ukupnaVrednost, ukupnaVrednostSaPorezom, obradjen, storniran, sifraRadnika, sifraKlijenta";
    }
    
    @Override
    public String getAttributeValuesForInsert() {
        return new java.sql.Date(datumIzdavanja.getTime()) + ", " + ukupnaVrednost + ", " + ukupnaVrednostSaPorezom + ", " + obradjen + ", "
                + storniran + ", " + radnik.getSifraRadnika() + ", " + klijent.getSifraKlijenta();
    }
    
    @Override
    public String getAttributesForUpdate() {
        return "datumIzdavanja = '" + new java.sql.Date(datumIzdavanja.getTime()) + "', ukupnaVrednost = " + ukupnaVrednost
                + ", ukupnaVrednostSaPorezom = " + ukupnaVrednostSaPorezom
                + ", obradjen = " + obradjen + ", storniran = " + storniran + ", sifraRadnika = "
                + radnik.getSifraRadnika() + ", sifraKlijenta = " + klijent.getSifraKlijenta();
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
