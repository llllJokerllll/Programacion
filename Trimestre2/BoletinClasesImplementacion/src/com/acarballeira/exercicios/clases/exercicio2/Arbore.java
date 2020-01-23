package com.acarballeira.exercicios.clases.exercicio2;

public class Arbore {

    public double altura;
    public int anoNac;
    public String concello;
    public String nomeComun;
    public String nomeLatino;
    public TipoFolla hojas;
    private static int numArbores;
    
    
    
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




    public String toString() {
        return String.format("------------------------------%n|Nome: %s%n|Nome latino: %s%n|Tipo folla: %s%n|Altura: %f%n|Concello: %s%n|Ano nacemento: %d%n------------------------------", this.nomeComun, this.nomeLatino, this.hojas, this.altura, this.concello, this.anoNac);
    }
}
