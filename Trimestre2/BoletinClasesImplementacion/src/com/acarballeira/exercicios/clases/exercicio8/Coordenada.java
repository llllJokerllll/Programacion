package com.acarballeira.exercicios.clases.exercicio8;

// TODO: Auto-generated Javadoc
/**
 * The Class Coordenada.
 *
 * @author Jose Manuel Sabaris Garcia
 * @version 1.0
 * @title 
 * @date 24 ene. 2020
 */

public class Coordenada {

    /** The x. */
    private int x;
    
    /** The y. */
    private int y;
    
    /**
     * Instantiates a new coordenada.
     */
    public Coordenada() {
        
    }
    
    /**
     * Instantiates a new coordenada.
     *
     * @param x the x
     * @param y the y
     */
    public Coordenada(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x.
     *
     * @param x the new x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the y.
     *
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y.
     *
     * @param y the new y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Coordenadas [x=" + x + ", y=" + y + "]";
    }
    
    
    
}
