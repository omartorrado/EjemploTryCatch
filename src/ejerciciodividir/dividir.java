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
public class dividir {

    public static float divideFloat(float dividendo, float divisor) {
        return (dividendo / divisor);
    }

    public static int divideInt(int dividendo, int divisor) {
        return (dividendo / divisor);
    }

    public static void dividirLanzarExcep(int nume, int deno) throws ArithmeticException {
        if (deno == 0) {
            throw new ArithmeticException("No dividas entre 0");
        } else {
            System.out.println("solucion: " + (nume / deno));
        }
    }

    public static void dividirPersExcep(int nume, int deno) throws PersonalException {
        if (deno == 0) {
            throw new PersonalException();
        } else {
            System.out.println("solucion: " + (nume / deno));
        }
    }

    public static void dividirRangoExcep(int nume, int deno) throws RangoException, PersonalException {
        int r = nume / deno;
        if (deno == 0) {
            throw new PersonalException();
        } else if (r < 60 || r > 200) {
            throw new RangoException();
        } else {
            System.out.println("Solucion: " + r);
        }
    }
}
