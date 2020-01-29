package com.acarballeira.exercicios.clases.exercicio2;

public class PersoalServicio extends Empleado {

    private int seccion;

    public PersoalServicio(String nombre, String apellidos, String dni, String estadoCivil, int anoInc, int numDesp,
            int seccion) {
        super(nombre, apellidos, dni, estadoCivil, anoInc, numDesp);
        this.seccion = seccion;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return String.format("Personal de servicio: %s\n%s", seccion, super.toString());
    }
    
    
}
