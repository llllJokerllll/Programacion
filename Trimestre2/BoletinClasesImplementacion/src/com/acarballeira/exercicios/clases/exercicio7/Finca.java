package com.acarballeira.exercicios.clases.exercicio7;

public class Finca {

    private Parcela parcela;
    private String toponimo;
    private TipoCultivo cultivo;
    private boolean regadio;
    private double metrosLimpios;
    
    public Finca() {
        
    }
    
    public Finca(Parcela parcela, String toponimo, TipoCultivo cultivo, boolean regadio, double metrosLimpios) {
        super();
        this.parcela = parcela;
        this.toponimo = toponimo;
        this.cultivo = cultivo;
        this.regadio = regadio;
        this.metrosLimpios = metrosLimpios;
    }

    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }
    
    public String getToponimo() {
        return toponimo;
    }

    public void setToponimo(String toponimo) {
        this.toponimo = toponimo;
    }

    public TipoCultivo getCultivo() {
        return cultivo;
    }

    public void setCultivo(TipoCultivo cultivo) {
        this.cultivo = cultivo;
    }

    public boolean isRegadio() {
        return regadio;
    }

    public void setRegadio(boolean regadio) {
        this.regadio = regadio;
    }

    public double getMetrosLimpios() {
        return metrosLimpios;
    }

    public void setMetrosLimpios(double metrosLimpios) {
        this.metrosLimpios = metrosLimpios;
    }

    public double incrementarSupALimpar(double metrosAlimpar) {     
        if (metrosAlimpar > parcela.getMetros()) {
            metrosLimpios = 0;
        } else {
            metrosLimpios -= metrosAlimpar;
        }
        
        return metrosLimpios;
    }
    
    public double decrementarSupALimpar(double maisMetrosLimpos) {     
        if ((maisMetrosLimpos + metrosLimpios) > parcela.getMetros()) {
            metrosLimpios = parcela.getMetros();
        } else {
            metrosLimpios += maisMetrosLimpos;
        }
        
        return metrosLimpios;
    }
    
    @Override
    public String toString() {
        return String.format("*** FINCA *** %s%nTipo de cultivo: %s%nRegadío: %b%nCoordenadas de referencia: %d,%d - %d,%d%n"
                + "Metros totais: %.3f%nMetrosLimpos: %.3f%n", this.toponimo, this.cultivo, this.regadio, parcela.getPuntoRef1().getX(), parcela.getPuntoRef1().getY(),
                parcela.getPuntoRef2().getX(), parcela.getPuntoRef2().getY(), parcela.getMetros(), this.metrosLimpios);
        
    }
    
    
}
