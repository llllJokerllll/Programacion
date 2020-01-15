package com.acarballeira;

public class Preso extends Persona {
    public static int numPresos = 0; 
    private String apodo;
    private String codigo;
    private int anosSentencia;

    public Preso() {
        super();
        this.nombre= "";
        numPresos++;
    }

    public Preso(String nombre, String apodo) {
        super(nombre);
        this.apodo = apodo;
    }

    public Preso(String nombre, String apodo, String codigo, int anosSentencia) {
        super(nombre);
        this.apodo = apodo;
        this.codigo = codigo;
        this.anosSentencia = anosSentencia;
    }

    public void ano() {
        anosSentencia--;
        System.out.println("Años restantes: " +  anosSentencia);    
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
    
    @Override
    public String toString() {
        return String.format("Nombre: %s\nApodo: %s\nCodigo: %s\nAños de sentencia: %d\n",nombre, apodo,codigo, anosSentencia);
    }
}