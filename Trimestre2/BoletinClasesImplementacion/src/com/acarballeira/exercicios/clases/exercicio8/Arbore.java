package com.acarballeira.exercicios.clases.exercicio8;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter.

public class Arbore {

    private double altura;
    private int anoNac;
    private String concello;
    private String nomeComun;
    private String nomeLatino;
    private TipoFolla hojas;
    private static int numArbores;
    private Coordenada posicion;
    
    
    
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
    

    public double getAltura() {
        return altura;
    }




    public void setAltura(double altura) {
        this.altura = altura;
    }




    public int getAnoNac() {
        return anoNac;
    }




    public void setAnoNac(int anoNac) {
        this.anoNac = anoNac;
    }




    public String getConcello() {
        return concello;
    }




    public void setConcello(String concello) {
        this.concello = concello;
    }




    public String getNomeComun() {
        return nomeComun;
    }




    public void setNomeComun(String nomeComun) {
        this.nomeComun = nomeComun;
    }




    public String getNomeLatino() {
        return nomeLatino;
    }




    public void setNomeLatino(String nomeLatino) {
        this.nomeLatino = nomeLatino;
    }




    public TipoFolla getHojas() {
        return hojas;
    }




    public void setHojas(TipoFolla hojas) {
        this.hojas = hojas;
    }



    public static int getNumArbores() {
        return numArbores;
    }
    
    
    public Coordenada getPosicion() {
        return posicion;
    }


    public void setPosicion(Coordenada posicion) {
        this.posicion = posicion;
    }


    public void transplantar (Coordenada fin) {
        setPosicion(fin);
        System.out.println("A nova posición da árbore é: " + fin);
    }


    public void transplantar (Coordenada fin, LocalDate ahora) {
        setPosicion(fin);
        System.out.println("A nova posición da árbore é: " + fin + " e a data de transplantado é: " + ahora);
    }
    

    public String toString() {
        return String.format("------------------------------%n|Nome: %s%n|Nome latino: %s%n|Tipo folla: %s%n|Altura: %f%n|Concello: %s%n|Ano nacemento: %d%n------------------------------", this.nomeComun, this.nomeLatino, this.hojas, this.altura, this.concello, this.anoNac);
    }
}
