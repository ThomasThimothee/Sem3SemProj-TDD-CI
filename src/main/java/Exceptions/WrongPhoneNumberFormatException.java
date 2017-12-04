/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Lovro
 */
public class WrongPhoneNumberFormatException extends Exception {

    /**
     * Creates a new instance of <code>WrongPhoneNumberFormatException</code> without detail message.
     */
    public WrongPhoneNumberFormatException() {
    }

    /**
     * Constructs an instance of <code>WrongPhoneNumberFormatException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public WrongPhoneNumberFormatException(String msg) {
        super(msg);
    }
}
