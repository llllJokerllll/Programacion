package com.acarballeira.exercicios.clases.exercicio5;

// TODO: Auto-generated Javadoc
/**
 * The Class Triangulo.
 */
public class Triangulo extends Figura {

    /** The base. */
    public double base;
    
    /** The altura. */
    public double altura;
   
    /**
     * Instantiates a new triangulo.
     *
     * @param nome the nome
     * @param unidades the unidades
     * @param base the base
     * @param altura the altura
     */
    public Triangulo(String nome, Unidades unidades, double base, double altura) {
        super(nome, unidades);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtener area.
     *
     * @return the double
     */
    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    /**
     * Obtener volumen.
     *
     * @return the double
     */
    @Override
    public double obtenerVolumen() {
        return 0;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Triangulo [obtenerArea()=%s %s cadrados, obtenerVolumen()=%s %s cúbicos]", obtenerArea(), this.getUnidades(), obtenerVolumen(), this.getUnidades());
    }
    
    
}
