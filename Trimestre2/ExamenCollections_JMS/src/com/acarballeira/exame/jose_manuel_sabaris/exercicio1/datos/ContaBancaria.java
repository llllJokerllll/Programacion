/*
 * 
 */
package com.acarballeira.exame.jose_manuel_sabaris.exercicio1.datos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Objects;

// TODO: Auto-generated Javadoc
/**
 * The Class ContaBancaria.
 */
public class ContaBancaria implements Comparator<ContaBancaria>{

    /** The nome cliente. */
    protected String nomeCliente;
    
    /** The numero conta. */
    protected String numeroConta;
    
    /** The tipo interese. */
    private double tipoInterese;
    
    /** The saldo. */
    protected double saldo;
    
    /** The conta contas. */
    private static int contaContas = 0;
    
    /**
     * Instantiates a new conta bancaria.
     */
    public ContaBancaria() {
        super();
        contaContas++;
    }

    /**
     * Instantiates a new conta bancaria.
     *
     * @param nomeCliente the nome cliente
     * @param numeroConta the numero conta
     * @param tipoInterese the tipo interese
     * @param saldo the saldo
     */
    public ContaBancaria(String nomeCliente, String numeroConta, double tipoInterese, double saldo) {
        super();
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.tipoInterese = tipoInterese;
        this.saldo = saldo;
        contaContas++;
    }

    /**
     * Gets the nome cliente.
     *
     * @return the nome cliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Sets the nome cliente.
     *
     * @param nomeCliente the new nome cliente
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Gets the numero conta.
     *
     * @return the numero conta
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * Sets the numero conta.
     *
     * @param numeroConta the new numero conta
     */
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * Gets the tipo interese.
     *
     * @return the tipo interese
     */
    public double getTipoInterese() {
        return tipoInterese;
    }

    /**
     * Sets the tipo interese.
     *
     * @param tipoInterese the new tipo interese
     */
    public void setTipoInterese(double tipoInterese) {
        this.tipoInterese = tipoInterese;
    }

    /**
     * Gets the saldo.
     *
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Sets the saldo.
     *
     * @param saldo the new saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Gets the conta contas.
     *
     * @return the conta contas
     */
    public static int getContaContas() {
        return contaContas;
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
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContaBancaria other = (ContaBancaria) obj;
        return Objects.equals(nomeCliente, other.nomeCliente) && Objects.equals(numeroConta, other.numeroConta)
                && Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
                && Double.doubleToLongBits(tipoInterese) == Double.doubleToLongBits(other.tipoInterese);
    }

    /**
     * Ingreso.
     *
     * @param saleDinero the sale dinero
     * @return true, if successful
     */
    public boolean ingreso(double saleDinero) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double entraDinero;
        System.out.println("Por favor introduzca la cantidad a ingresar");
            try {
                entraDinero = Double.parseDouble(br.readLine());
                if (entraDinero > 0) {
                    this.saldo += entraDinero; 
                    return true;
                } else {
                    return false;
                }
                
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error en la cantidad introducida a ingresar" + e.getMessage());
                return false;
            }
    }
    
    /**
     * Reintegro.
     *
     * @param saleDinero the sale dinero
     * @return true, if successful
     */
    public boolean reintegro(double saleDinero) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor introduzca la cantidad a retirar");
        try {
            saleDinero = Double.parseDouble(br.readLine());
            if (saleDinero <= this.saldo) {
                this.saldo -= saleDinero;
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("Error en la cantidad introducida a retirar" + e.getMessage());
            return false;
        }
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Número de conta: %s%nSaldo: %.2f%nCliente: %s%n", numeroConta, saldo, nomeCliente);
    }

    /**
     * Compare.
     *
     * @param o1 the o 1
     * @param o2 the o 2
     * @return the int
     */
    @Override
    public int compare(ContaBancaria o1, ContaBancaria o2) {
        
        return o1.getNomeCliente().compareToIgnoreCase(o2.nomeCliente);
    }
    
    
}
