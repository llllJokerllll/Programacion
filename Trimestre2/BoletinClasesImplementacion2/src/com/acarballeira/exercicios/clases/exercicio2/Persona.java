package com.acarballeira.exercicios.clases.exercicio2;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public class Persona {

    /** The nombre. */
    private String nombre;
    
    /** The apellidos. */
    private String apellidos;
    
    /** The dni. */
    private String dni;
    
    /** The estado civil. */
    private String estadoCivil;
    
    /**
     * Instantiates a new persona.
     *
     * @param nombre the nombre
     * @param apellidos the apellidos
     * @param dni the dni
     * @param estadoCivil the estado civil
     */
    public Persona(String nombre, String apellidos, String dni, String estadoCivil) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
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

    /**
     * Gets the dni.
     *
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Sets the dni.
     *
     * @param dni the new dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Gets the estado civil.
     *
     * @return the estado civil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Sets the estado civil.
     *
     * @param estadoCivil the new estado civil
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Datos personales\nNombre: %s\nApellidos: %s\nDni: %s\nEstadoCivil: %s\n", nombre, apellidos, dni,
                estadoCivil);
    }
    
    
}
