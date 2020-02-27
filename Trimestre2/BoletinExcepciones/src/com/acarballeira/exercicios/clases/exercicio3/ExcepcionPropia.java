package com.acarballeira.exercicios.clases.exercicio3;

// TODO: Auto-generated Javadoc
/**
 * The Class ExcepcionPropia.
 */
public class ExcepcionPropia extends Exception {

    /** The mensaxe. */
    private String mensaxe;
    
    /**
     * Instantiates a new excepcion propia.
     *
     * @param mensaxe the mensaxe
     */
    public ExcepcionPropia(String mensaxe) {
        super(mensaxe);
        this.mensaxe = mensaxe;
    }

    /**
     * Gets the mensaxe.
     *
     * @return the mensaxe
     */
    public String getMensaxe() {
        return mensaxe;
    }
    
    
}
