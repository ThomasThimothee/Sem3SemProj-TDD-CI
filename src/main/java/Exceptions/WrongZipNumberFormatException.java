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
public class WrongZipNumberFormatException extends Exception {

    /**
     * Creates a new instance of <code>WrongZipFormatException</code> without detail message.
     */
    public WrongZipNumberFormatException() {
    }

    /**
     * Constructs an instance of <code>WrongZipFormatException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public WrongZipNumberFormatException(String msg) {
        super(msg);
    }
}
