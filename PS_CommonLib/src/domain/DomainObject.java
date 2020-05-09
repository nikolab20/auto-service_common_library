package domain;

/**
 *
 * @author nikol
 */
public interface DomainObject {

    /**
     * Method for getting table name in database.
     *
     * @return an String value as table name of current class object in
     * database.
     */
    public String getTableName();

    /**
     * Method for getting attribute names for insert in database.
     *
     * @return an String value as sequence of attribute names for insert of
     * current class object in database.
     */
    public String getAttributeNamesForInsert();

    /**
     * Method for getting attribute values for insert in database.
     *
     * @return an String value as sequence of attribute values for insert of
     * current class object in database.
     */
    public String getAttributeValuesForInsert();

    /**
     * Method for getting sequence of pairs attribute name and attribute value
     * for update in database.
     *
     * @return an String value as sequence of pairs attribute names and
     * attribute values for update of current class object in database.
     */
    public String getAttributesForUpdate();

    /**
     * Method for getting identifier name of this object in database.
     *
     * @return an String value as identifier name of this object.
     */
    public String getIdentifierName();

    /**
     * Method for checking if object is auto-increment in database.
     *
     * @return boolean value of checking if object is auto-increment or not.
     */
    public boolean isAutoincrement();

    /**
     * Method for setting the id of this object.
     *
     * @param id id Long value for id of object.
     */
    public void setObjectId(Long id);

    /**
     * Method for getting a id of object.
     *
     * @return Long value as object id.
     */
    public Long getObjectId();
}
