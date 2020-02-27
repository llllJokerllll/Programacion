package com.acarballeira.exercicios.clases.exercicio1;

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
    
    /**
     * To string.
     *
     * @return the string
     */
    public String toString() {
        return "------------------------------\n" + "|Nome: " + nomeComun + "\n|Nome latino: " + nomeLatino + "\n|Tipo folla: " + hojas + "\n|Altura: " + altura + "\n|Concello: " + concello + "\n|Ano nacemento: " + anoNac + "\n------------------------------";
    }
}
