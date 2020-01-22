package com.acarballeira.exercicios.clases.exercicio1;

public class Arbore {

    public double altura;
    public int anoNac;
    public String concello;
    public String nomeComun;
    public String nomeLatino;
    public TipoFolla hojas;
    
    public String toString() {
        return "------------------------------\n" + "|Nome: " + nomeComun + "\n|Nome latino: " + nomeLatino + "\n|Tipo folla: " + hojas + "\n|Altura: " + altura + "\n|Concello: " + concello + "\n|Ano nacemento: " + anoNac + "\n------------------------------";
    }
}
