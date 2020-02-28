/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;

// TODO: Auto-generated Javadoc
/**
 * The Class Intolerante.
 */
public class Intolerante extends Participante {

    /** The intolerancia. */
    private String intolerancia;

    /**
     * Instantiates a new intolerante.
     *
     * @param nome the nome
     * @param apelidos the apelidos
     * @param nick the nick
     * @param categoria the categoria
     * @param intolerancia the intolerancia
     */
    public Intolerante(String nome, String apelidos, String nick, char categoria, String intolerancia) {
        super(nome, apelidos, nick, categoria);
        this.intolerancia = intolerancia;
    }

    /**
     * Instantiates a new intolerante.
     *
     * @param nome the nome
     * @param apelidos the apelidos
     * @param nick the nick
     * @param idade the idade
     * @param intolerancia the intolerancia
     */
    public Intolerante(String nome, String apelidos, String nick, int idade, String intolerancia) {
        super(nome, apelidos, nick, idade);
        this.intolerancia = intolerancia;
    }

    /**
     * Gets the intolerancia.
     *
     * @return the intolerancia
     */
    public String getIntolerancia() {
        return intolerancia;
    }

    /**
     * Sets the intolerancia.
     *
     * @param intolerancia the new intolerancia
     */
    public void setIntolerancia(String intolerancia) {
        this.intolerancia = intolerancia;
    }
    
    
}
