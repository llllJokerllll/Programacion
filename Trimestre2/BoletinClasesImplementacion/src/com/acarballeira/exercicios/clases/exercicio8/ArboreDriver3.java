package com.acarballeira.exercicios.clases.exercicio8;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter.

// TODO: Auto-generated Javadoc
/**
 * The Class ArboreDriver3.
 */
public class ArboreDriver3 {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        Arbore pino = new Arbore(23.00,2000,"Ramirás","Piñeiro","Pinus Pinaster",TipoFolla.PERENNE);

        Arbore casti = new Arbore(23.00,1990,"Ramirás","Piñeiro","Castanae Sativa",TipoFolla.CADUCO);
        
        Arbore ami = new Arbore(23.00,2003,"Ramirás","Celanova","Alnus Glutinosa",TipoFolla.PERENNE);

        
        System.out.println(pino);
        System.out.println(casti);
        System.out.println(ami);
        System.out.println("El número total de arboles es: " + Arbore.getNumArbores());

        pino.transplantar(new Coordenada(5,4));
        casti.transplantar(new Coordenada(15,9), LocalDate.now());
        
    }

}
