/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author nikol
 */
public interface DomainObject {

    public String getTableName();

    public String getAttributeNamesForInsert();

    public String getAttributeValuesForInsert();

    public String getAttributesForUpdate();

    public String getIdentifierName();

    public boolean isAutoincrement();

    public void setObjectId(Long id);

    public Long getObjectId();
}
