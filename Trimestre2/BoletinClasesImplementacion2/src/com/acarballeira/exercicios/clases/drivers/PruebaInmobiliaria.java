package com.acarballeira.exercicios.clases.drivers;

import com.acarballeira.exercicios.clases.exercicio3.Estado;
import com.acarballeira.exercicios.clases.exercicio3.Local;
import com.acarballeira.exercicios.clases.exercicio3.Pisos;

// TODO: Auto-generated Javadoc
/**
 * The Class PruebaInmobiliaria.
 */
public class PruebaInmobiliaria {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        Pisos p1 = new Pisos("Martin Codax", 49, Estado.NUEVO, 5);
        
        Local l1 = new Local("A barca", 100, Estado.SEGUNDAMANO, 5);
        
        System.out.println(p1);
        
        System.out.println(l1);

        System.out.println(p1.calcPrecioTotal(150000, 0, p1.getPiso()));
        
        System.out.println(l1.calcPrecioTotal(200000, 20, 150, l1.getVentanas()));
    }

}
