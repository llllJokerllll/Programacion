package com.acarballeira.exercicios.clases.exercicio2;

// TODO: Auto-generated Javadoc
/**
 * The Class Empleado.
 */
public class Empleado extends Persona {

    /** The ano inc. */
    private int anoInc;
    
    /** The num desp. */
    private int numDesp;
    
    /**
     * Instantiates a new empleado.
     *
     * @param nombre the nombre
     * @param apellidos the apellidos
     * @param dni the dni
     * @param estadoCivil the estado civil
     * @param anoInc the ano inc
     * @param numDesp the num desp
     */
    public Empleado(String nombre, String apellidos, String dni, String estadoCivil, int anoInc, int numDesp) {
        super(nombre, apellidos, dni, estadoCivil);
        this.anoInc = anoInc;
        this.numDesp = numDesp;
    }

    /**
     * Gets the ano inc.
     *
     * @return the ano inc
     */
    public int getAnoInc() {
        return anoInc;
    }

    /**
     * Sets the ano inc.
     *
     * @param anoInc the new ano inc
     */
    public void setAnoInc(int anoInc) {
        this.anoInc = anoInc;
    }

    /**
     * Gets the num desp.
     *
     * @return the num desp
     */
    public int getNumDesp() {
        return numDesp;
    }

    /**
     * Sets the num desp.
     *
     * @param numDesp the new num desp
     */
    public void setNumDesp(int numDesp) {
        this.numDesp = numDesp;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Empleado\nAño de Incorporación: %s\nNúmero de despacho: %s\n%s", anoInc, numDesp, super.toString() );
    }
    
    
}
