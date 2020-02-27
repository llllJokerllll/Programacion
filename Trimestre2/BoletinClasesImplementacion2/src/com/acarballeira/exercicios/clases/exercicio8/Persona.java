package com.acarballeira.exercicios.clases.exercicio8;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public abstract class Persona {

    /** The nombre. */
    protected String nombre;
    
    /** The apellidos. */
    protected String apellidos;
    
    /**
     * Instantiates a new persona.
     *
     * @param nombre the nombre
     * @param apellidos the apellidos
     */
    public Persona(String nombre, String apellidos) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
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
     * Gets the apellidos.
     *
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Sets the apellidos.
     *
     * @param apellidos the new apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
