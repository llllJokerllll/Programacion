package com.acarballeira.exercicios.clases.exercicio1;

// TODO: Auto-generated Javadoc
/**
 * The Class Ejercicio1.
 */
public class Ejercicio1 {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        try {
            throw new Exception("Isto � unha Excepci�n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Esto finaliza, hasta otra");
        }

    }

}
