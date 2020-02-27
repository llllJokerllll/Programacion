package com.acarballeira.exercicios.clases.exercicio7;

// TODO: Auto-generated Javadoc
/**
 * The Class Parcela.
 */
public class Parcela {

    /** The punto ref 1. */
    private Coordenada puntoRef1;
    
    /** The punto ref 2. */
    private Coordenada puntoRef2;
    
    /** The metros. */
    private double metros;
    
    /**
     * Instantiates a new parcela.
     *
     * @param puntoRef1 the punto ref 1
     * @param puntoRef2 the punto ref 2
     * @param metros the metros
     */
    public Parcela(Coordenada puntoRef1, Coordenada puntoRef2, double metros) {
        super();
        this.puntoRef1 = puntoRef1;
        this.puntoRef2 = puntoRef2;
        this.metros = metros;
    }

    /**
     * Gets the punto ref 1.
     *
     * @return the punto ref 1
     */
    public Coordenada getPuntoRef1() {
        return puntoRef1;
    }

    /**
     * Sets the punto ref 1.
     *
     * @param puntoRef1 the new punto ref 1
     */
    public void setPuntoRef1(Coordenada puntoRef1) {
        this.puntoRef1 = puntoRef1;
    }

    /**
     * Gets the punto ref 2.
     *
     * @return the punto ref 2
     */
    public Coordenada getPuntoRef2() {
        return puntoRef2;
    }

    /**
     * Sets the punto ref 2.
     *
     * @param puntoRef2 the new punto ref 2
     */
    public void setPuntoRef2(Coordenada puntoRef2) {
        this.puntoRef2 = puntoRef2;
    }

    /**
     * Gets the metros.
     *
     * @return the metros
     */
    public double getMetros() {
        return metros;
    }

    /**
     * Sets the metros.
     *
     * @param metros the new metros
     */
    public void setMetros(double metros) {
        this.metros = metros;
    }
    
    
}
