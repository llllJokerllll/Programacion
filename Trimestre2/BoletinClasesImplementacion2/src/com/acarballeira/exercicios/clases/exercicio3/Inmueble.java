package com.acarballeira.exercicios.clases.exercicio3;

public class Inmueble {

    private String direccion;
    private int metrosC;
    private Estado estado;
    
    public Inmueble(String direccion, int metrosC, Estado estado) {
        super();
        this.direccion = direccion;
        this.metrosC = metrosC;
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMetrosC() {
        return metrosC;
    }

    public void setMetrosC(int metrosC) {
        this.metrosC = metrosC;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public final double calcPrecioTotal( double precioBase, int edad ) {
        double precioTotal = precioBase;
        if ( edad < 15 ) {
            precioTotal *= 0.9;
        } else {
            precioTotal *= 0.8;
        }
        
        return precioTotal;
    }

    @Override
    public String toString() {
        return String.format("Inmueble [direccion=%s, metrosC=%s, estado=%s]", direccion, metrosC, estado);
    }
    
    
    
    
}
