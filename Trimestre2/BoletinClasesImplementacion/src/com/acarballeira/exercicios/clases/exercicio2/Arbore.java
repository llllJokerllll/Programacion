package com.acarballeira.exercicios.clases.exercicio2;

// TODO: Auto-generated Javadoc
/**
 * The Class Arbore.
 */
public class Arbore {

    /** The altura. */
    public double altura;
    
    /** The ano nac. */
    public int anoNac;
    
    /** The concello. */
    public String concello;
    
    /** The nome comun. */
    public String nomeComun;
    
    /** The nome latino. */
    public String nomeLatino;
    
    /** The hojas. */
    public TipoFolla hojas;
    
    /** The num arbores. */
    private static int numArbores;
    
    
    
    /**
     * Instantiates a new arbore.
     *
     * @param altura the altura
     * @param anoNac the ano nac
     * @param concello the concello
     * @param nomeComun the nome comun
     * @param nomeLatino the nome latino
     * @param hojas the hojas
     */
    public Arbore(double altura, int anoNac, String concello, String nomeComun, String nomeLatino, TipoFolla hojas) {
        super();
        this.altura = altura;
        this.anoNac = anoNac;
        this.concello = concello;
        this.nomeComun = nomeComun;
        this.nomeLatino = nomeLatino;
        this.hojas = hojas;
        numArbores++;
    }
    



    /**
     * Gets the altura.
     *
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }




    /**
     * Sets the altura.
     *
     * @param altura the new altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }




    /**
     * Gets the ano nac.
     *
     * @return the ano nac
     */
    public int getAnoNac() {
        return anoNac;
    }




    /**
     * Sets the ano nac.
     *
     * @param anoNac the new ano nac
     */
    public void setAnoNac(int anoNac) {
        this.anoNac = anoNac;
    }




    /**
     * Gets the concello.
     *
     * @return the concello
     */
    public String getConcello() {
        return concello;
    }




    /**
     * Sets the concello.
     *
     * @param concello the new concello
     */
    public void setConcello(String concello) {
        this.concello = concello;
    }




    /**
     * Gets the nome comun.
     *
     * @return the nome comun
     */
    public String getNomeComun() {
        return nomeComun;
    }




    /**
     * Sets the nome comun.
     *
     * @param nomeComun the new nome comun
     */
    public void setNomeComun(String nomeComun) {
        this.nomeComun = nomeComun;
    }




    /**
     * Gets the nome latino.
     *
     * @return the nome latino
     */
    public String getNomeLatino() {
        return nomeLatino;
    }




    /**
     * Sets the nome latino.
     *
     * @param nomeLatino the new nome latino
     */
    public void setNomeLatino(String nomeLatino) {
        this.nomeLatino = nomeLatino;
    }




    /**
     * Gets the hojas.
     *
     * @return the hojas
     */
    public TipoFolla getHojas() {
        return hojas;
    }




    /**
     * Sets the hojas.
     *
     * @param hojas the new hojas
     */
    public void setHojas(TipoFolla hojas) {
        this.hojas = hojas;
    }




    /**
     * Gets the num arbores.
     *
     * @return the num arbores
     */
    public static int getNumArbores() {
        return numArbores;
    }




    /**
     * To string.
     *
     * @return the string
     */
    public String toString() {
        return String.format("------------------------------%n|Nome: %s%n|Nome latino: %s%n|Tipo folla: %s%n|Altura: %f%n|Concello: %s%n|Ano nacemento: %d%n------------------------------", this.nomeComun, this.nomeLatino, this.hojas, this.altura, this.concello, this.anoNac);
    }
}
