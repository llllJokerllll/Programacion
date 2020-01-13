package com.acarballeira;

public class Preso {

    // Propiedades de la clase
    private String nome = ""; // Aquí usamos el igual para dejar un valor default que nosotros escojamos.
    private String apodo;
    private String codigo;
    private int anosSentencia;
    private static int numPresos = 0;

    // Constructores de la clase
    public Preso() {
        numPresos++;
        Preso.numPresos++;
    }
    
    public Preso( String apodo, String codigo ) {
        this();
        this.apodo = apodo;
        this.codigo = codigo;
    }

    public Preso( String nome, String apodo, String codigo, int anosSentencia ) {
        this(apodo, codigo);
        this.nome = nome;
        this.anosSentencia = anosSentencia;
    }
    
    // Métodos get & set de cada propiedad de la clase
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnosSentencia() {
        return anosSentencia;
    }

    public void setAnosSentencia(int anosSentencia) {
        this.anosSentencia = anosSentencia;
    }
    
    public int getNumPresos() {
        return numPresos;
    }
    
    // Método toString para imprimir las propiedades de la clase
    @Override
    public String toString() {
        String res = "";
        
        res += "Nome: " + this.nome + "\n";
        res += "Apodo: " + this.apodo + "\n";
        res += "Código: " + this.codigo + "\n";
        res += "Sentencia: " + this.anosSentencia + "\n";
        res += "Nº de preso: " + numPresos + "\n";
        
        return res;
    }

}
