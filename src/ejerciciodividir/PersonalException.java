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
public class PersonalException extends ArithmeticException{
    public PersonalException(){
        super("Texto de esta excepción");
        
    }
    public PersonalException(String s){
        super(s);
    }
}
