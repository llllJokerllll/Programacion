package com.acarballeira.exercicios.drivers;

import com.acarballeira.exercicios.clases.exercicio2.Arbore;
import com.acarballeira.exercicios.clases.exercicio2.TipoFolla;

// TODO: Auto-generated Javadoc
/**
 * The Class ArboreDriver2.
 */
public class ArboreDriver2 {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        Arbore pino = new Arbore(23.00,2000,"Ramir�s","Pi�eiro","Pinus Pinaster",TipoFolla.PERENNE);

        Arbore casti = new Arbore(23.00,1990,"Ramir�s","Pi�eiro","Castanae Sativa",TipoFolla.CADUCO);
        
        Arbore ami = new Arbore(23.00,2003,"Ramir�s","Celanova","Alnus Glutinosa",TipoFolla.PERENNE);

        
        System.out.println(pino);
        System.out.println(casti);
        System.out.println(ami);
        System.out.println("El n�mero total de arboles es: " + Arbore.getNumArbores());

    }

}
