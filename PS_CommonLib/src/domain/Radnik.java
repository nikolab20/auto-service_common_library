/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import lombok.*;

import java.io.Serializable;

/*
  @author nikol
 */

/**
 * Represents a car service worker.
 */
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(includeFieldNames = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Radnik implements Serializable, DomainObject {

    /**
     * The unique number of the worker.
     *
     * @param sifraRadnika New value for this worker attribute.
     * @return The current value of this attribute.
     */
    @EqualsAndHashCode.Include
    private Long sifraRadnika;

    /**
     * The first name of the worker.
     *
     * @param imeRadnika New value for this worker's first name.
     * @return The current value of this worker's first name.
     */
    @NonNull
    @ToString.Include
    private String imeRadnika;

    /**
     * The last name of the worker.
     *
     * @param prezimeRadnika New value for this worker's last name.
     * @return The current value of this worker's last name.
     */
    @NonNull
    @ToString.Include
    private String prezimeRadnika;

    /**
     * The address of the worker.
     *
     * @param adresa New value for this worker's address.
     * @return The current value of this worker's address.
     */
    @NonNull
    private String adresa;

    /**
     * The phone number of the worker.
     *
     * @param telefon New value for this worker's phone number.
     * @return The current value of this worker's phone number.
     */
    @NonNull
    private String telefon;

    /**
     * The unique personal identity number of the worker.
     *
     * @param JMBG New value for this worker's personal identity number.
     * @return The current value of this worker's personal identity number.
     */
    @NonNull
    @EqualsAndHashCode.Include
    private String JMBG;

    /**
     * Checks whether the worker is an administrator.
     *
     * @param storniran New value for this worker attribute.
     * @return The current value of this worker attribute.
     */
    @NonNull
    private boolean administrator;

    /**
     * The username of the worker.
     *
     * @param username New value for this worker's username.
     * @return The current value of this worker's username.
     */
    @NonNull
    private String username;

    /**
     * The password of the worker.
     *
     * @param username New value for this worker's password.
     * @return The current value of this worker's password.
     */
    @NonNull
    private String password;


    @Override
    public String getTableName() {
        return "radnik";
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "imeRadnika, prezimeRadnika, adresa, telefon, JMBG, administrator, username, password";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return imeRadnika + "', '" + prezimeRadnika + "', '" + adresa + "', '" + telefon +
                "', '" + JMBG + "', " + administrator + ", '" + username + "', '" + password + "'";
    }

    @Override
    public String getAttributesForUpdate() {
        return "imeRadnika = '" + imeRadnika + "', prezimeRadnika = '" + prezimeRadnika + "', adresa = '" + adresa +
                "', telefon = '" + telefon + "', JMBG = '" + JMBG + "', administrator = " + administrator +
                ", username = '" + username + "', password = '" + password + "'";
    }

    @Override
    public String getIdentifierName() {
        return "sifraRadnika";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(Long id) {
        setSifraRadnika(id);
    }

    @Override
    public Long getObjectId() {
        return sifraRadnika;
    }
}
