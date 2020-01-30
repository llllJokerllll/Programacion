package com.acarballeira.exercicios.clases.exercicio5;

public class Triangulo extends Figura {

    public double base;
    public double altura;
   
    public Triangulo(String nome, Unidades unidades, double base, double altura) {
        super(nome, unidades);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    @Override
    public double obtenerVolumen() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Triangulo [obtenerArea()=%s %s cadrados, obtenerVolumen()=%s %s cúbicos]", obtenerArea(), this.getUnidades(), obtenerVolumen(), this.getUnidades());
    }
    
    
}
