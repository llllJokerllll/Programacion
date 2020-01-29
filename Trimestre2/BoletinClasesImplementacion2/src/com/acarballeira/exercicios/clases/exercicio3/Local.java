package com.acarballeira.exercicios.clases.exercicio3;

public class Local extends Inmueble {

    private int ventanas;

    public Local(String direccion, int metrosC, Estado estado, int ventanas) {
        super(direccion, metrosC, estado);
        this.ventanas = ventanas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }
    
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

    @Override
    public String toString() {
        return String.format("Local [ventanas=%s]\n%s", ventanas, super.toString());
    }
    
    
}
