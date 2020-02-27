package com.acarballeira.exercicios.clases.exercicio8;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter.

// TODO: Auto-generated Javadoc
/**
 * The Class Arbore.
 */
public class Arbore {

    /** The altura. */
    private double altura;
    
    /** The ano nac. */
    private int anoNac;
    
    /** The concello. */
    private String concello;
    
    /** The nome comun. */
    private String nomeComun;
    
    /** The nome latino. */
    private String nomeLatino;
    
    /** The hojas. */
    private TipoFolla hojas;
    
    /** The num arbores. */
    private static int numArbores;
    
    /** The posicion. */
    private Coordenada posicion;
    
    
    
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
     * Gets the posicion.
     *
     * @return the posicion
     */
    public Coordenada getPosicion() {
        return posicion;
    }


    /**
     * Sets the posicion.
     *
     * @param posicion the new posicion
     */
    public void setPosicion(Coordenada posicion) {
        this.posicion = posicion;
    }


    /**
     * Transplantar.
     *
     * @param fin the fin
     */
    public void transplantar (Coordenada fin) {
        setPosicion(fin);
        System.out.println("A nova posición da árbore é: " + fin);
    }


    /**
     * Transplantar.
     *
     * @param fin the fin
     * @param ahora the ahora
     */
    public void transplantar (Coordenada fin, LocalDate ahora) {
        setPosicion(fin);
        System.out.println("A nova posición da árbore é: " + fin + " e a data de transplantado é: " + ahora);
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
