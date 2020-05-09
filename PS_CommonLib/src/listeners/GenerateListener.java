package listeners;

import domain.DomainObject;

/**
 * Custom listener for listening generating domain object.
 *
 * @author nikol
 */
public interface GenerateListener {

    /**
     * Method for notifying all listeners which listening this listener that
     * form request to generate domain object.
     *
     * @param domainObject is object that form need to generate.
     * @return generated domain object.
     */
    public DomainObject generateOdo(DomainObject domainObject);
}
