package com.acarballeira.exercicios.clases.exercicio5;

// TODO: Auto-generated Javadoc
/**
 * The Class Cilindro.
 */
public class Cilindro extends Figura {

    /** The radio. */
    public double radio;
    
    /** The altura. */
    public double altura;
    
    /**
     * Instantiates a new cilindro.
     *
     * @param nome the nome
     * @param unidades the unidades
     * @param radio the radio
     * @param altura the altura
     */
    public Cilindro(String nome, Unidades unidades, double radio, double altura) {
        super(nome, unidades);
        this.radio = radio;
        this.altura = altura;
    }

    /**
     * Obtener area.
     *
     * @return the double
     */
    @Override
    public double obtenerArea() {
        return 2 * Math.PI * radio * (radio + altura);
    }

    /**
     * Obtener volumen.
     *
     * @return the double
     */
    @Override
    public double obtenerVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Cilindro [obtenerArea()=%s %s cadrados, obtenerVolumen()=%s %s cúbicos]", obtenerArea(), this.getUnidades(), obtenerVolumen(), this.getUnidades());
    }
    
    
}
