/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio4;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public class Persona {

    /** The nombre. */
    protected String nombre;
    
    /**
     * Instantiates a new persona.
     */
    public Persona() {
    }
    
    /**
     * Instantiates a new persona.
     *
     * @param nombre the nombre
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the nombre.
     *
     * @param nombre the new nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return("Nombre: " + nombre + "\n");
    }

}