/*
 * 
 */
package com.acarballeira.exame.jose_manuel_sabaris.exercicio1.datos;

import java.util.Comparator;
import java.util.Objects;

// TODO: Auto-generated Javadoc
/**
 * The Class Tarxeta.
 */
public class Tarxeta extends ContaBancaria {

    /** The numero. */
    private String numero;
    
    /** The nome. */
    private String nome;
    
    /** The tipo. */
    private TipoTarxeta tipo;
    
    /**
     * Instantiates a new tarxeta.
     */
    public Tarxeta() {
        super();
    }

    /**
     * Instantiates a new tarxeta.
     *
     * @param numero the numero
     * @param nome the nome
     * @param tipo the tipo
     * @param nomeCliente the nome cliente
     * @param numeroConta the numero conta
     * @param tipoInterese the tipo interese
     * @param saldo the saldo
     */
    public Tarxeta(String numero, String nome, TipoTarxeta tipo, String nomeCliente, String numeroConta, double tipoInterese, double saldo) {
        super(nomeCliente, numeroConta, tipoInterese, saldo);
        this.numero = numero;
        this.nome = nome;
        this.tipo = tipo;
    }

    /**
     * Gets the numero.
     *
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the numero.
     *
     * @param numero the new numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the nome.
     *
     * @param nome the new nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets the tipo.
     *
     * @return the tipo
     */
    public TipoTarxeta getTipo() {
        return tipo;
    }

    /**
     * Sets the tipo.
     *
     * @param tipo the new tipo
     */
    public void setTipo(TipoTarxeta tipo) {
        this.tipo = tipo;
    }

    /**
     * Equals.
     *
     * @param obj the obj
     * @return true, if successful
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarxeta other = (Tarxeta) obj;
        return Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero) && tipo == other.tipo;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Tarxeta: %s%nTipo: %s%nNúmero de conta: %s%nSaldo: %.2f%nCliente: %s%n", numero, tipo, numeroConta, saldo, nomeCliente);
    }
    
}

