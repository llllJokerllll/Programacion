package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;

public abstract class Via {

    protected String codigo;
    protected TipoTitularidade titular = TipoTitularidade.local;
    protected double numKm;
    protected double numKmDeficientes;
    protected int ancho;
    
    public Via() {
        super();
    }

    public Via(String codigo, TipoTitularidade titular, double numKm, double numKmDeficientes, int ancho) {
        super();
        this.codigo = codigo;
        this.titular = titular;
        
        if ( numKm <= 0 ) {
            System.out.println("Dato introducido no válido");
            this.numKm = 0.1;
        } else {
            this.numKm = numKm;
        }
        
        if ( numKmDeficientes < 0 ) {
            System.out.println("Dato introducido no válido");
            this.numKmDeficientes = 0;
        } else if ( numKmDeficientes > numKm ) {
            System.out.println("Dato introducido no válido");
            this.numKmDeficientes = numKm;
        } else {
            this.numKmDeficientes = numKmDeficientes;
        }
        
        if ( ancho <= 0 ) {
            System.out.println("Dato introducido no válido");
            this.ancho = 1;
        } else {
            this.ancho = ancho;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoTitularidade getTitular() {
        return titular;
    }

    public void setTitular(TipoTitularidade titular) {
        this.titular = titular;
    }

    public double getNumKm() {
        return numKm;
    }

    public void setNumKm(double numKm) {
        if ( numKm <= 0 ) {
            System.out.println("Dato introducido no válido");
            this.numKm = 0.1;
        } else {
            this.numKm = numKm;
        }
    }

    public double getNumKmDeficientes() {
        return numKmDeficientes;
    }

    public void setNumKmDeficientes(double numKmDeficientes) {
        if ( numKmDeficientes < 0 ) {
            System.out.println("Dato introducido no válido");
            this.numKmDeficientes = 0;
        } else if ( numKmDeficientes > numKm ) {
            System.out.println("Dato introducido no válido");
            this.numKmDeficientes = numKm;
        } else {
            this.numKmDeficientes = numKmDeficientes;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if ( ancho <= 0 ) {
            System.out.println("Dato introducido no válido");
            this.ancho = 1;
        } else {
            this.ancho = ancho;
        }
    }
    
    public abstract double costeMantemento();
    
    public double arranxar (double repararKm) {
        if ( repararKm > numKmDeficientes || repararKm <= 0 ) {
            System.out.println("Dato introducido no válido");
            numKmDeficientes = 0;
        } else {
            numKmDeficientes -= repararKm;
        }
        
        return numKmDeficientes;
    }
    
    public double comunicarDeficiencia (double kmAreparar) {
        if ( kmAreparar > numKm || kmAreparar + numKmDeficientes > numKm ) {
            System.out.println("Dato introducido no válido");
            numKmDeficientes = numKm;
        } else if ( kmAreparar < 0 ) {
            numKmDeficientes = 0;
        } else {
            numKmDeficientes -= kmAreparar;
        }
        
        return numKmDeficientes;
    }

    @Override
    public String toString() {
        return String.format("Codigo: %s%nTipo de vía: %s%nNúmero de kilometros: %s km%nNúmero de kilometros deficientes: %s km%nAncho: %s metros", codigo, titular,
                numKm, numKmDeficientes, ancho);
    }
    
    
}
