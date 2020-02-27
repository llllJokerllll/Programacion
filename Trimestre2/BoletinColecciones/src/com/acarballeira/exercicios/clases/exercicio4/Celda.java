/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio4;

import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Class Celda.
 */
public class Celda {
    
    /** The nombre. */
    String nombre;
    
    /** The abierta. */
    boolean abierta;
    
    /** The capacidad. */
    int capacidad = 5;
    
    /** The presos. */
    LinkedList<Preso> presos = new LinkedList<Preso>();

    /**
     * Instantiates a new celda.
     */
    public Celda() {
    }

    /**
     * Instantiates a new celda.
     *
     * @param nombre the nombre
     * @param abierta the abierta
     * @param capacidad the capacidad
     */
    public Celda(String nombre, boolean abierta, int capacidad) {
        this.nombre = nombre;
        this.abierta = abierta;
        this.capacidad = capacidad;
    }

    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the nombre.
     *
     * @param nombre the new nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Checks if is abierta.
     *
     * @return true, if is abierta
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Sets the abierta.
     *
     * @param abierta the new abierta
     */
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    /**
     * Abrir.
     *
     * @param cod the cod
     */
    public void abrir(String cod) {
        if (cod.equals("1234")) {
            this.abierta = true;
        } else {
            System.out.println("Código Incorrecto");
        }
    }

    /**
     * Cerrar.
     *
     * @param cod the cod
     */
    public void cerrar(String cod) {
        if (cod.equals("1234")) {
            this.abierta = false;
        } else {
            System.out.println("Código Incorrecto");
        }
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Nombre: %s%nAbierta: %s%n", nombre, abierta ? "Si" : "No");
    }

    /**
     * Gets the presos.
     *
     * @return the presos
     */
    public String getPresos() {
        String salida = "Celda " + nombre + "\n";
        for (Preso preso : presos) {
            salida += (preso != null) ? preso.getCodigo() + "\n" : "";

        }
        return salida;
    }
    
    /**
     * Gets the num presos.
     *
     * @return the num presos
     */
    public int getNumPresos() {
        return presos.size();
    }

    /**
     * Engadir preso.
     *
     * @param p the p
     */
    public void engadirPreso(Preso p) {
        if (getNumPresos()==capacidad) {
            System.out.println("Celda llena");
        } else {
            presos.add(p);
        }
    }

    /**
     * Quitar preso.
     *
     * @param p the p
     */
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