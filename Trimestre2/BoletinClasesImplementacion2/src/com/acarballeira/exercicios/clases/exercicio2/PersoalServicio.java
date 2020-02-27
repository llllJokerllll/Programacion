package com.acarballeira.exercicios.clases.exercicio2;

// TODO: Auto-generated Javadoc
/**
 * The Class PersoalServicio.
 */
public class PersoalServicio extends Empleado {

    /** The seccion. */
    private int seccion;

    /**
     * Instantiates a new persoal servicio.
     *
     * @param nombre the nombre
     * @param apellidos the apellidos
     * @param dni the dni
     * @param estadoCivil the estado civil
     * @param anoInc the ano inc
     * @param numDesp the num desp
     * @param seccion the seccion
     */
    public PersoalServicio(String nombre, String apellidos, String dni, String estadoCivil, int anoInc, int numDesp,
            int seccion) {
        super(nombre, apellidos, dni, estadoCivil, anoInc, numDesp);
        this.seccion = seccion;
    }

    /**
     * Gets the seccion.
     *
     * @return the seccion
     */
    public int getSeccion() {
        return seccion;
    }

    /**
     * Sets the seccion.
     *
     * @param seccion the new seccion
     */
    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Personal de servicio: %s\n%s", seccion, super.toString());
    }
    
    
}
