package com.acarballeira.exercicios.clases.exercicio5;

// TODO: Auto-generated Javadoc
/**
 * The Class Tiempo.
 */
public class Tiempo {

    /** The hora. */
    private int hora;
    
    /** The minuto. */
    private int minuto;
    
    /** The segundo. */
    private int segundo;
    
    /**
     * Instantiates a new tiempo.
     */
    public Tiempo() {
        
    }

    /**
     * Instantiates a new tiempo.
     *
     * @param hora the hora
     * @param minuto the minuto
     * @param segundo the segundo
     */
    public Tiempo(int hora, int minuto, int segundo) {
        super();
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     * Instantiates a new tiempo.
     *
     * @param hora the hora
     * @param minuto the minuto
     */
    public Tiempo(int hora, int minuto) {
        super();
        this.hora = hora;
        this.minuto = minuto;
    }

    /**
     * Instantiates a new tiempo.
     *
     * @param hora the hora
     */
    public Tiempo(int hora) {
        super();
        this.hora = hora;
    }

    /**
     * Gets the hora.
     *
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Sets the hora.
     *
     * @param hora the new hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Gets the minuto.
     *
     * @return the minuto
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Sets the minuto.
     *
     * @param minuto the new minuto
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    /**
     * Gets the segundo.
     *
     * @return the segundo
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Sets the segundo.
     *
     * @param segundo the new segundo
     */
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    /**
     * Amosa tiempo.
     *
     * @return the string
     */
    public String amosaTiempo() {
        String res = "";
        
        if ( this.hora < 10 ) {
            res += "0" + this.hora + ":";
        } else {
            res += this.hora + ":";
        }
        if ( this.minuto < 10 ) {
            res += "0" + this.minuto + ":";
        } else {
            res += this.minuto + ":";
        }
        if ( this.segundo < 10 ) {
            res += "0" + this.segundo;
        } else {
            res += this.segundo;
        }
        
        return res;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return amosaTiempo();
    }
    
    
}
