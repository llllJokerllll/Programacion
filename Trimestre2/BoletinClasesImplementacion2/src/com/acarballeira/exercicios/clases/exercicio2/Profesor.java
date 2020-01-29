package com.acarballeira.exercicios.clases.exercicio2;

public class Profesor extends Empleado {

    private String departamento;

    public Profesor(String nombre, String apellidos, String dni, String estadoCivil, int anoInc, int numDesp,
            String departamento) {
        super(nombre, apellidos, dni, estadoCivil, anoInc, numDesp);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return String.format("Profesor de: %s\n%s", departamento, super.toString());
    }
    
    
}
