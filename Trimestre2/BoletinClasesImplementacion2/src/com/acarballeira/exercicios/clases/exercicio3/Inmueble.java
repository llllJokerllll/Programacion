package com.acarballeira.exercicios.clases.exercicio3;

// TODO: Auto-generated Javadoc
/**
 * The Class Inmueble.
 */
public class Inmueble {

    /** The direccion. */
    private String direccion;
    
    /** The metros C. */
    private int metrosC;
    
    /** The estado. */
    private Estado estado;
    
    /**
     * Instantiates a new inmueble.
     *
     * @param direccion the direccion
     * @param metrosC the metros C
     * @param estado the estado
     */
    public Inmueble(String direccion, int metrosC, Estado estado) {
        super();
        this.direccion = direccion;
        this.metrosC = metrosC;
        this.estado = estado;
    }

    /**
     * Gets the direccion.
     *
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the direccion.
     *
     * @param direccion the new direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Gets the metros C.
     *
     * @return the metros C
     */
    public int getMetrosC() {
        return metrosC;
    }

    /**
     * Sets the metros C.
     *
     * @param metrosC the new metros C
     */
    public void setMetrosC(int metrosC) {
        this.metrosC = metrosC;
    }

    /**
     * Gets the estado.
     *
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Sets the estado.
     *
     * @param estado the new estado
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    /**
     * Calc precio total.
     *
     * @param precioBase the precio base
     * @param edad the edad
     * @return the double
     */
    public final double calcPrecioTotal( double precioBase, int edad ) {
        double precioTotal = precioBase;
        if ( edad < 15 ) {
            precioTotal *= 0.9;
        } else {
            precioTotal *= 0.8;
        }
        
        return precioTotal;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Inmueble [direccion=%s, metrosC=%s, estado=%s]", direccion, metrosC, estado);
    }
    
    
    
    
}
