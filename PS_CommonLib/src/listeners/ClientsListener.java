package listeners;

/**
 * Custom listener for listening new clients connection.
 *
 * @author nikol
 */
public interface ClientsListener {

    /**
     * Method for notifying all listeners which listening this listener that new
     * client connected.
     */
    void onClientConnected();
}
