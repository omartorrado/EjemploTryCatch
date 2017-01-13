/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodividir;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class EjercicioDividir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dividir n = new dividir();
        //System.out.println(n.divideFloat(Float.parseFloat(JOptionPane.showInputDialog(null, "Indica el dividendo")), Float.parseFloat(JOptionPane.showInputDialog(null, "Indica el divisor"))));
        //System.out.println(n.divideInt(Integer.parseInt(JOptionPane.showInputDialog(null, "Indica el dividendo")), Integer.parseInt(JOptionPane.showInputDialog(null, "Indica el divisor"))));
//        try{
//            System.out.println(dividir.divideFloat(6, -561455445));
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        try{
//            dividir.dividirPersExcep(10, 0);
//        }
//        catch(PersonalException e){
//            System.out.println(e.getMessage());
//        } 
//        System.out.println("El programa no se detiene");
//    }
        try{
            dividir.dividirRangoExcep(1000, 0);//Por que lanza la ArithmeticException en lugar de la prsonalException?
            //dividir.dividirRangoExcep(Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero")),Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero")));
        }
        catch(RangoException|PersonalException e){
            System.out.println("Error por: "+e.getMessage());
            System.out.println(e.toString());
        }
//        catch(Exception e){
//            System.out.println("Error por: "+e.getMessage()+". Introduce un numero entero");
//        }
        
        System.out.println("El programa no se detiene");
    }

}
