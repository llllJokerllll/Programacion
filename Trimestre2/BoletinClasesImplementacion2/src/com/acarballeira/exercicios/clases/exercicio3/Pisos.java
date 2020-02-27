package com.acarballeira.exercicios.clases.exercicio3;

// TODO: Auto-generated Javadoc
/**
 * The Class Pisos.
 */
public class Pisos extends Inmueble {

    /** The piso. */
    private int piso; 

    /**
     * Instantiates a new pisos.
     *
     * @param direccion the direccion
     * @param metrosC the metros C
     * @param estado the estado
     * @param piso the piso
     */
    public Pisos(String direccion, int metrosC, Estado estado, int piso) {
        super(direccion, metrosC, estado);
        this.piso = piso;
    }

    /**
     * Gets the piso.
     *
     * @return the piso
     */
    public int getPiso() {
        return piso;
    }

    /**
     * Sets the piso.
     *
     * @param piso the new piso
     */
    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    /**
     * Calc precio total.
     *
     * @param precioBase the precio base
     * @param edad the edad
     * @param piso the piso
     * @return the double
     */
    public double calcPrecioTotal( double precioBase, int edad, int piso ) {
        double precioTotal = precioBase;
        if ( edad < 15 ) {
            precioTotal *= 0.9;
        } else {
            precioTotal *= 0.8;
        }
        
        if ( piso >= 3 ) {
            precioTotal *= 1.3;
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
        return String.format("Pisos [piso=%s]\n%s", piso, super.toString());
    }
    
    
}
