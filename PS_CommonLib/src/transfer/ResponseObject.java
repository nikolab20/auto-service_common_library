/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author nikol
 */
/**
 * Represents an object as response to the required operation execution which
 * contains data or exception as result of operation execution.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseObject implements Serializable {

    /**
     * The data as result of operation execution.
     *
     * @param data New value for data.
     * @return The current value of data.
     */
    private Object data;

    /**
     * The exception as result od operation execution.
     *
     * @param execution New value for exception.
     * @return The current value of exception.
     */
    private Exception exception;

}
