package com.acarballeira.exercicios.clases.exercicio3;

// TODO: Auto-generated Javadoc
/**
 * The Class Local.
 */
public class Local extends Inmueble {

    /** The ventanas. */
    private int ventanas;

    /**
     * Instantiates a new local.
     *
     * @param direccion the direccion
     * @param metrosC the metros C
     * @param estado the estado
     * @param ventanas the ventanas
     */
    public Local(String direccion, int metrosC, Estado estado, int ventanas) {
        super(direccion, metrosC, estado);
        this.ventanas = ventanas;
    }

    /**
     * Gets the ventanas.
     *
     * @return the ventanas
     */
    public int getVentanas() {
        return ventanas;
    }

    /**
     * Sets the ventanas.
     *
     * @param ventanas the new ventanas
     */
    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }
    
    /**
     * Calc precio total.
     *
     * @param precioBase the precio base
     * @param edad the edad
     * @param metrosC the metros C
     * @param ventanas the ventanas
     * @return the double
     */
    public double calcPrecioTotal( double precioBase, int edad, int metrosC, int ventanas ) {
        double precioTotal = precioBase;
        if ( edad < 15 ) {
            precioTotal *= 0.9;
        } else {
            precioTotal *= 0.8;
        }
        
        if ( metrosC > 50 ) {
            precioTotal *= 1.1;
        }
        
        if ( ventanas <= 1 ) {
            precioTotal *= 0.8;
        } else if (ventanas > 4 ) {
            precioTotal *= 1.2;
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
        return String.format("Local [ventanas=%s]\n%s", ventanas, super.toString());
    }
    
    
}
