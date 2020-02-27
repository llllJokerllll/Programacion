package com.acarballeira.exercicios.clases.exercicio5;

// TODO: Auto-generated Javadoc
/**
 * The Class Circulo.
 */
public class Circulo extends Figura {

    /** The radio. */
    public double radio;

    /**
     * Instantiates a new circulo.
     *
     * @param nome the nome
     * @param unidades the unidades
     * @param radio the radio
     */
    public Circulo(String nome, Unidades unidades, double radio) {
        super(nome, unidades);
        this.radio = radio;
    }

    /**
     * Obtener area.
     *
     * @return the double
     */
    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
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
        return String.format("Circulo [obtenerArea()=%s %s cadrados, obtenerVolumen()=%s %s cúbicos]", obtenerArea(), this.getUnidades(), obtenerVolumen(), this.getUnidades());
    }
    
    
}
