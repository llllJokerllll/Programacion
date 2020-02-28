/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;

// TODO: Auto-generated Javadoc
/**
 * The Class Discapacitado.
 */
public class Discapacitado extends Participante {

    /** The discapacidade. */
    private String discapacidade;

    /**
     * Instantiates a new discapacitado.
     *
     * @param nome the nome
     * @param apelidos the apelidos
     * @param nick the nick
     * @param categoria the categoria
     * @param discapacidade the discapacidade
     */
    public Discapacitado(String nome, String apelidos, String nick, char categoria, String discapacidade) {
        super(nome, apelidos, nick, categoria);
        this.discapacidade = discapacidade;
    }

    /**
     * Instantiates a new discapacitado.
     *
     * @param nome the nome
     * @param apelidos the apelidos
     * @param nick the nick
     * @param idade the idade
     * @param discapacidade the discapacidade
     */
    public Discapacitado(String nome, String apelidos, String nick, int idade, String discapacidade) {
        super(nome, apelidos, nick, idade);
        this.discapacidade = discapacidade;
    }

    /**
     * Gets the discapacidade.
     *
     * @return the discapacidade
     */
    public String getDiscapacidade() {
        return discapacidade;
    }

    /**
     * Sets the discapacidade.
     *
     * @param discapacidade the new discapacidade
     */
    public void setDiscapacidade(String discapacidade) {
        this.discapacidade = discapacidade;
    }
    
    
}
