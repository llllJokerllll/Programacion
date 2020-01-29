package com.acarballeira.exercicios.clases.exercicio2;

public class Empleado extends Persona {

    private int anoInc;
    private int numDesp;
    
    public Empleado(String nombre, String apellidos, String dni, String estadoCivil, int anoInc, int numDesp) {
        super(nombre, apellidos, dni, estadoCivil);
        this.anoInc = anoInc;
        this.numDesp = numDesp;
    }

    public int getAnoInc() {
        return anoInc;
    }

    public void setAnoInc(int anoInc) {
        this.anoInc = anoInc;
    }

    public int getNumDesp() {
        return numDesp;
    }

    public void setNumDesp(int numDesp) {
        this.numDesp = numDesp;
    }

    @Override
    public String toString() {
        return String.format("Empleado\nAño de Incorporación: %s\nNúmero de despacho: %s\n%s", anoInc, numDesp, super.toString() );
    }
    
    
}
