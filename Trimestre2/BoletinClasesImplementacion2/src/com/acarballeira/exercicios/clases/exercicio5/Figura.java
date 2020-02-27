package com.acarballeira.exercicios.clases.exercicio5;

// TODO: Auto-generated Javadoc
/**
 * The Class Figura.
 */
public abstract class Figura {

    /** The nome. */
    String nome;
    
    /** The unidades. */
    private Unidades unidades = Unidades.CM;

    
    /**
     * Instantiates a new figura.
     */
    public Figura() {
        
    }

    /**
     * Instantiates a new figura.
     *
     * @param nome the nome
     * @param unidades the unidades
     */
    public Figura(String nome, Unidades unidades) {
        super();
        this.nome = nome;
        this.unidades = unidades;
    }

    /**
     * Gets the nome.
     *
     * @return the nome
     */
    public abstract String getNome();
    
    
    /**
     * Gets the unidades.
     *
     * @return the unidades
     */
    public Unidades getUnidades() {
        return unidades;
    }

    /**
     * Obtener area.
     *
     * @return the double
     */
    public abstract double obtenerArea();
    
    /**
     * Obtener volumen.
     *
     * @return the double
     */
    public abstract double obtenerVolumen();
    
}
