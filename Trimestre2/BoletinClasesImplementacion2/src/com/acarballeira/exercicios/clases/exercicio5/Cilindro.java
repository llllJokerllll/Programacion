package com.acarballeira.exercicios.clases.exercicio5;

public class Cilindro extends Figura {

    public double radio;
    public double altura;
    
    public Cilindro(String nome, Unidades unidades, double radio, double altura) {
        super(nome, unidades);
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return 2 * Math.PI * radio * (radio + altura);
    }

    @Override
    public double obtenerVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public String toString() {
        return String.format("Cilindro [obtenerArea()=%s %s cadrados, obtenerVolumen()=%s %s cúbicos]", obtenerArea(), this.getUnidades(), obtenerVolumen(), this.getUnidades());
    }
    
    
}
