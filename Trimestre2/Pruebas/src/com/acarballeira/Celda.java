package com.acarballeira;

public class Celda {
    String nombre;
    boolean abierta;
    int capacidad;
    Preso[] presos;
    int numPresos = 0;
    
    public Celda() {}
    public Celda(String nombre, boolean abierta, int capacidad) {
        this.nombre = nombre;
        this.abierta = abierta;
        this.capacidad = capacidad;
        presos = new Preso[capacidad];
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isAbierta() {
        return abierta;
    }
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
    public void abrir() {
        this.abierta = true;
    }
    public void cerrar() {
        this.abierta = false;
    }
    
    public String toString() {
        return String.format("Nombre: %s\nAbierta: %s\n", nombre, abierta ? "Si" : "No");
    }

    public void engadirPreso(Preso p) {
        for(int i = 0; i < capacidad;i++) {
            if (presos[i] == null) {
                presos[i] = p;
                break;
            } 
            if (i == capacidad - 1) {
                System.out.println("Celda llena");
            }
        }
        

    }
    
    public void quitarPreso(Preso p) {
        for (int i = 0; i < capacidad; i++) {
            if(presos[i] == p) {
                presos[i] = null;
            } else {
                System.out.println();
            }
        }
    }
    
    public String getPresos() {
        String salida = "Celda " + nombre + "\n";
        for (Preso preso : presos) {
            salida += (preso!=null) ? preso.getCodigo() + "\n" : "";

        }
        return salida;
    }
}
