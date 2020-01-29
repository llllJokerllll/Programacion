package com.acarballeira.exercicios.clases.exercicio3;

public class Pisos extends Inmueble {

    private int piso; 

    public Pisos(String direccion, int metrosC, Estado estado, int piso) {
        super(direccion, metrosC, estado);
        this.piso = piso;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
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

    @Override
    public String toString() {
        return String.format("Pisos [piso=%s]\n%s", piso, super.toString());
    }
    
    
}
