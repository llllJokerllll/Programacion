package com.acarballeira.exercicios.clases.exercicio1;

// TODO: Auto-generated Javadoc
/**
 * The Class Cubo.
 */
public class Cubo {

    // atributos
    
    /** The capacidad. */
    int capacidad; // capacidad máxima en litros
    
    /** The contenido. */
    int contenido; // contenido actual en litros
    
    // métodos
    
    // constructor
    
    /**
     * Instantiates a new cubo.
     *
     * @param c the c
     */
    public Cubo(int c) {
        this.capacidad = c;
    }
    
    /**
     * Gets the capacidad.
     *
     * @return the capacidad
     */
    // métodos getter
    int getCapacidad() {
        return this.capacidad;
    }
    
    /**
     * Gets the contenido.
     *
     * @return the contenido
     */
    int getContenido() {
        return this.contenido;
    }
    
    /**
     * Sets the contenido.
     *
     * @param litros the new contenido
     */
    // método setter
    void setContenido(int litros) {
        this.contenido = litros;
    }
    
    /**
     * Vacia.
     */
    // otros métodos
    void vacia() {
        this.contenido = 0;
    }
    
    /**
     * Llena el cubo al máximo de su capacidad.
     */
    public void llena() {
        this.contenido = this.capacidad;
    }
    
    /**
     * Pinta el cubo en la pantalla.
     * Se muestran los bordes del cubo con el caracter # y el
     * agua que contiene con el carácter ~.
     */
    public void pinta() {
        for ( int nivel = this.capacidad; nivel > 0; nivel-- ) {
            if (this.contenido >= nivel) {
                System.out.println("#~~~~#");
            } else {
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }
    
    /**
     * Vuelca el contenido de un cubo sobre otro
     * Antes de echar el agua se comprueba cuánto le cabe al
     * cubo destino.
     *
     * @param destino the destino
     */
    public void vuelcaEn(Cubo destino) {
        int libres = destino.getCapacidad() - destino.getContenido();
        
        if (libres != 0) {
            if (this.contenido <= libres) {
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            } else {
                this.contenido -= libres;
                destino.llena();
            }
        }
    }
    
    
}
