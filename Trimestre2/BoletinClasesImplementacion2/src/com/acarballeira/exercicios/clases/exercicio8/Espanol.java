package com.acarballeira.exercicios.clases.exercicio8;

// TODO: Auto-generated Javadoc
/**
 * The Class Espanol.
 */
public class Espanol extends Persona implements Hablador {

    /**
     * Instantiates a new espanol.
     *
     * @param nombre the nombre
     * @param apellidos the apellidos
     */
    public Espanol(String nombre, String apellidos) {
        super(nombre, apellidos);
        // TODO Auto-generated constructor stub
    }

    /**
     * Saluda.
     */
    @Override
    public void saluda() {
        System.out.println("Hola");
    }
}
