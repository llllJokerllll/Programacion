package com.acarballeira.exercicios.clases.exercicio4;

import java.util.LinkedList;

public class Celda {
    
    String nombre;
    boolean abierta;
    int capacidad = 5;
    LinkedList<Preso> presos = new LinkedList<Preso>();

    public Celda() {
    }

    public Celda(String nombre, boolean abierta, int capacidad) {
        this.nombre = nombre;
        this.abierta = abierta;
        this.capacidad = capacidad;
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

    public void abrir(String cod) {
        if (cod.equals("1234")) {
            this.abierta = true;
        } else {
            System.out.println("Código Incorrecto");
        }
    }

    public void cerrar(String cod) {
        if (cod.equals("1234")) {
            this.abierta = false;
        } else {
            System.out.println("Código Incorrecto");
        }
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s%nAbierta: %s%n", nombre, abierta ? "Si" : "No");
    }

    public String getPresos() {
        String salida = "Celda " + nombre + "\n";
        for (Preso preso : presos) {
            salida += (preso != null) ? preso.getCodigo() + "\n" : "";

        }
        return salida;
    }
    
    public int getNumPresos() {
        return presos.size();
    }

    public void engadirPreso(Preso p) {
        if (getNumPresos()==capacidad) {
            System.out.println("Celda llena");
        } else {
            presos.add(p);
        }
    }

    public void quitarPreso(Preso p) {
        for (int i = 0; i < presos.size() - 1; i++) {
            if (presos.get(i).equals(p)) {
                presos.remove(i);
            } else {
                System.out.println("");
            }
        }
    }

}