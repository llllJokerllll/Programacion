package com.acarballeira.exercicios.clases.exercicio5;

public abstract class Figura {

    String nome;
    private Unidades unidades = Unidades.CM;

    
    public Figura() {
        
    }

    public Figura(String nome, Unidades unidades) {
        super();
        this.nome = nome;
        this.unidades = unidades;
    }

    public abstract String getNome();
    
    
    public Unidades getUnidades() {
        return unidades;
    }

    public abstract double obtenerArea();
    public abstract double obtenerVolumen();
    
}
