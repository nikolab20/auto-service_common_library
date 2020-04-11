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
    public static final int OPERATION_GENERATE = 3;
    public static final int OPERATION_INSERT = 4;
    public static final int OPERATION_SEARCH_CUSTOMER = 5;
    public static final int OPERATION_UPDATE = 6;
    public static final int OPERATION_SEARCH_EMPLOYEE = 7;
    public static final int OPERATION_DELETE = 8;
    public static final int OPERATION_SELECT_ALL_TAX = 9;
    public static final int OPERATION_SEARCH_CAR_PART = 10;
    public static final int OPERATION_SEARCH_SERVICE = 11;
    public static final int OPERATION_SEARCH_OBJECT_OF_SALE = 12;
    public static final int OPERATION_GET_ALL_OBJECT_OF_SALES = 13;
    public static final int OPERATION_INSERT_LIST = 14;
}
