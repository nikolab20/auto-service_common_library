/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;

/**
 * @author nikol
 */

/**
 * Represents the numbered operations.
 */
public class Operation implements Serializable {
    public static final int OPERATION_CHOOSE_LANGUAGE = 1;
    public static final int OPERATION_LOGIN_WORKER = 2;
    public static final int OPERATION_GENERATE_CUSTOMER = 3;
    public static final int OPERATION_ADD_CUSTOMER = 4;
    public static final int OPERATION_SEARCH_CUSTOMER = 5;
    public static final int OPERATION_UPDATE_CUSTOMER = 6;
}
