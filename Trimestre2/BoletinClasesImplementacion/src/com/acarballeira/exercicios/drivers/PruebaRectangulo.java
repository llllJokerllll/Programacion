package com.acarballeira.exercicios.drivers;

import com.acarballeira.exercicios.clases.exercicio4.*;

// TODO: Auto-generated Javadoc
/**
 * The Class PruebaRectangulo.
 */
public class PruebaRectangulo {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        Rectangulo rect1 = new Rectangulo(10, 5);
        
        
        System.out.println("El area del rect�ngulo es: " + rect1.calArea());
        System.out.println("El per�metro del rect�ngulo es: " + rect1.calPeri());

        System.out.println(rect1);
    }

}
