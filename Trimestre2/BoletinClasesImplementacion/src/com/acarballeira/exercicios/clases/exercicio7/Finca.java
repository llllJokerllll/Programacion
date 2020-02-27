package com.acarballeira.exercicios.clases.exercicio7;

// TODO: Auto-generated Javadoc
/**
 * The Class Finca.
 */
public class Finca {

    /** The parcela. */
    private Parcela parcela;
    
    /** The toponimo. */
    private String toponimo;
    
    /** The cultivo. */
    private TipoCultivo cultivo;
    
    /** The regadio. */
    private boolean regadio;
    
    /** The metros limpios. */
    private double metrosLimpios;
    
    /**
     * Instantiates a new finca.
     */
    public Finca() {
        
    }
    
    /**
     * Instantiates a new finca.
     *
     * @param parcela the parcela
     * @param toponimo the toponimo
     * @param cultivo the cultivo
     * @param regadio the regadio
     * @param metrosLimpios the metros limpios
     */
    public Finca(Parcela parcela, String toponimo, TipoCultivo cultivo, boolean regadio, double metrosLimpios) {
        super();
        this.parcela = parcela;
        this.toponimo = toponimo;
        this.cultivo = cultivo;
        this.regadio = regadio;
        this.metrosLimpios = metrosLimpios;
    }

    /**
     * Gets the parcela.
     *
     * @return the parcela
     */
    public Parcela getParcela() {
        return parcela;
    }

    /**
     * Sets the parcela.
     *
     * @param parcela the new parcela
     */
    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }
    
    /**
     * Gets the toponimo.
     *
     * @return the toponimo
     */
    public String getToponimo() {
        return toponimo;
    }

    /**
     * Sets the toponimo.
     *
     * @param toponimo the new toponimo
     */
    public void setToponimo(String toponimo) {
        this.toponimo = toponimo;
    }

    /**
     * Gets the cultivo.
     *
     * @return the cultivo
     */
    public TipoCultivo getCultivo() {
        return cultivo;
    }

    /**
     * Sets the cultivo.
     *
     * @param cultivo the new cultivo
     */
    public void setCultivo(TipoCultivo cultivo) {
        this.cultivo = cultivo;
    }

    /**
     * Checks if is regadio.
     *
     * @return true, if is regadio
     */
    public boolean isRegadio() {
        return regadio;
    }

    /**
     * Sets the regadio.
     *
     * @param regadio the new regadio
     */
    public void setRegadio(boolean regadio) {
        this.regadio = regadio;
    }

    /**
     * Gets the metros limpios.
     *
     * @return the metros limpios
     */
    public double getMetrosLimpios() {
        return metrosLimpios;
    }

    /**
     * Sets the metros limpios.
     *
     * @param metrosLimpios the new metros limpios
     */
    public void setMetrosLimpios(double metrosLimpios) {
        this.metrosLimpios = metrosLimpios;
    }

    /**
     * Incrementar sup A limpar.
     *
     * @param metrosAlimpar the metros alimpar
     * @return the double
     */
    public double incrementarSupALimpar(double metrosAlimpar) {     
        if (metrosAlimpar > parcela.getMetros()) {
            metrosLimpios = 0;
        } else {
            metrosLimpios -= metrosAlimpar;
        }
        
        return metrosLimpios;
    }
    
    /**
     * Decrementar sup A limpar.
     *
     * @param maisMetrosLimpos the mais metros limpos
     * @return the double
     */
    public double decrementarSupALimpar(double maisMetrosLimpos) {     
        if ((maisMetrosLimpos + metrosLimpios) > parcela.getMetros()) {
            metrosLimpios = parcela.getMetros();
        } else {
            metrosLimpios += maisMetrosLimpos;
        }
        
        return metrosLimpios;
    }
    
    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("*** FINCA *** %s%nTipo de cultivo: %s%nRegadío: %b%nCoordenadas de referencia: %d,%d - %d,%d%n"
                + "Metros totais: %.3f%nMetrosLimpos: %.3f%n", this.toponimo, this.cultivo, this.regadio, parcela.getPuntoRef1().getX(), parcela.getPuntoRef1().getY(),
                parcela.getPuntoRef2().getX(), parcela.getPuntoRef2().getY(), parcela.getMetros(), this.metrosLimpios);
        
    }
    
    
}
