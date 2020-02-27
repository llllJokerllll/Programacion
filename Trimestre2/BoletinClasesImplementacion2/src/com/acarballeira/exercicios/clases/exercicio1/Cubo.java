package com.acarballeira.exercicios.clases.exercicio1;

// TODO: Auto-generated Javadoc
/**
 * The Class Cubo.
 */
public class Cubo {

    // atributos
    
    /** The capacidad. */
    int capacidad; // capacidad m�xima en litros
    
    /** The contenido. */
    int contenido; // contenido actual en litros
    
    // m�todos
    
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
    // m�todos getter
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
    // m�todo setter
    void setContenido(int litros) {
        this.contenido = litros;
    }
    
    /**
     * Vacia.
     */
    // otros m�todos
    void vacia() {
        this.contenido = 0;
    }
    
    /**
     * Llena el cubo al m�ximo de su capacidad.
     */
    public void llena() {
        this.contenido = this.capacidad;
    }
    
    /**
     * Pinta el cubo en la pantalla.
     * Se muestran los bordes del cubo con el caracter # y el
     * agua que contiene con el car�cter ~.
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
     * Antes de echar el agua se comprueba cu�nto le cabe al
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
