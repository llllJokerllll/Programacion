package com.acarballeira.exercicios.clases.exercicio5;

public class Circulo extends Figura {

    public double radio;

    public Circulo(String nome, Unidades unidades, double radio) {
        super(nome, unidades);
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double obtenerVolumen() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Circulo [obtenerArea()=%s %s cadrados, obtenerVolumen()=%s %s cúbicos]", obtenerArea(), this.getUnidades(), obtenerVolumen(), this.getUnidades());
    }
    
    
}
