/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio4;

// TODO: Auto-generated Javadoc
/**
 * The Class Preso.
 */
public class Preso extends Persona {
    
    /** The num presos. */
    public static int numPresos = 0; 
    
    /** The apodo. */
    private String apodo;
    
    /** The codigo. */
    private String codigo;
    
    /** The anos sentencia. */
    private int anosSentencia;

    /**
     * Instantiates a new preso.
     */
    public Preso() {
        super();
        this.nombre= "";
        numPresos++;
    }

    /**
     * Instantiates a new preso.
     *
     * @param nombre the nombre
     * @param apodo the apodo
     */
    public Preso(String nombre, String apodo) {
        super(nombre);
        this.apodo = apodo;
    }

    /**
     * Instantiates a new preso.
     *
     * @param nombre the nombre
     * @param apodo the apodo
     * @param codigo the codigo
     * @param anosSentencia the anos sentencia
     */
    public Preso(String nombre, String apodo, String codigo, int anosSentencia) {
        super(nombre);
        this.apodo = apodo;
        this.codigo = codigo;
        this.anosSentencia = anosSentencia;
    }

    /**
     * Ano.
     */
    public void ano() {
        anosSentencia--;
        System.out.println("Años restantes: " +  anosSentencia);    
    }


    /**
     * Gets the apodo.
     *
     * @return the apodo
     */
    public String getApodo() {
        return apodo;
    }

    /**
     * Sets the apodo.
     *
     * @param apodo the new apodo
     */
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    /**
     * Gets the codigo.
     *
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the codigo.
     *
     * @param codigo the new codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Gets the anos sentencia.
     *
     * @return the anos sentencia
     */
    public int getAnosSentencia() {
        return anosSentencia;
    }

    /**
     * Sets the anos sentencia.
     *
     * @param anosSentencia the new anos sentencia
     */
    public void setAnosSentencia(int anosSentencia) {
        this.anosSentencia = anosSentencia;
    }
    
    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Nombre: %s%nApodo: %s%nCodigo: %s%nAños de sentencia: %d%n",nombre, apodo,codigo, anosSentencia);
    }
}