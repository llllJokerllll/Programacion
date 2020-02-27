package com.acarballeira.exercicios.clases.exercicio3;

// TODO: Auto-generated Javadoc
/**
 * The Class Exercicio3.
 */
public class Exercicio3 {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
       
        try {
            throw new ExcepcionPropia("Fallo propio");
        } catch (ExcepcionPropia e) {
            System.out.println(e.getMessage() + " " + e.getMensaxe());
        }
    }

}
