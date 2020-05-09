package transfer;

import lombok.*;

import java.io.Serializable;

/**
 * @author nikol
 */
/**
 * Represents an object that contains a request to execute an operation and the
 * data needed to execute that operation.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequestObject implements Serializable {

    /**
     * The number of the operation.
     *
     * @param operation New value for the operation.
     * @return The current value of the operation.
     */
    private int operation;

    /**
     * The data needed to execute the operation.
     *
     * @param data New value for data.
     * @return The current value of data.
     */
    private Object data;

}
