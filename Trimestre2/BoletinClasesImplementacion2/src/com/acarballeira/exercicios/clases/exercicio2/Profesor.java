package com.acarballeira.exercicios.clases.exercicio2;

// TODO: Auto-generated Javadoc
/**
 * The Class Profesor.
 */
public class Profesor extends Empleado {

    /** The departamento. */
    private String departamento;

    /**
     * Instantiates a new profesor.
     *
     * @param nombre the nombre
     * @param apellidos the apellidos
     * @param dni the dni
     * @param estadoCivil the estado civil
     * @param anoInc the ano inc
     * @param numDesp the num desp
     * @param departamento the departamento
     */
    public Profesor(String nombre, String apellidos, String dni, String estadoCivil, int anoInc, int numDesp,
            String departamento) {
        super(nombre, apellidos, dni, estadoCivil, anoInc, numDesp);
        this.departamento = departamento;
    }

    /**
     * Gets the departamento.
     *
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Sets the departamento.
     *
     * @param departamento the new departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Profesor de: %s\n%s", departamento, super.toString());
    }
    
    
}
