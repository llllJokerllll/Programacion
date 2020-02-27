package com.acarballeira.exercicios.clases.drivers;

import com.acarballeira.exercicios.clases.exercicio8.Espanol;
import com.acarballeira.exercicios.clases.exercicio8.Gato;

// TODO: Auto-generated Javadoc
/**
 * The Class PruebaHablante.
 */
public class PruebaHablante {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        Espanol pepe = new Espanol("Pepe", "Un Purito");
        
        Gato gardfield = new Gato();
        
        pepe.saluda();
        
        gardfield.saluda();

    }

}
