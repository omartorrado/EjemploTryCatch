/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodividir;

/**
 *
 * @author otorradomiguez
 */
public class RangoException extends Exception {

    public RangoException() {
        super("Fuera de sango");
    }
    public RangoException(String n){
        super(n);
    }
}
