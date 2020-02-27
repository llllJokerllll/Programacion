package com.acarballeira.exercicios.clases.exercicio4;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangulo.
 */
public class Rectangulo {

    /** The base. */
    private double base;
    
    /** The altura. */
    private double altura;
    
    /**
     * Instantiates a new rectangulo.
     *
     * @param base the base
     * @param altura the altura
     */
    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    /**
     * Gets the base.
     *
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * Sets the base.
     *
     * @param base the new base
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Gets the altura.
     *
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Sets the altura.
     *
     * @param altura the new altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**
     * Cal area.
     *
     * @return the double
     */
    public double calArea() {
        return this.altura * this.base;
    }
    
    /**
     * Cal peri.
     *
     * @return the double
     */
    public double calPeri() {
        return 2*( this.altura + this.base );
    }
    
    /**
     * Pinta rect.
     *
     * @return the string
     */
    public String pintaRect() {
        String res = "";
        
        for (int i = 0; i <= this.altura; i++ ) {
            for (int j = 0; j < this.base * 2; j++ ) {
                if ( i == 0 ) {
                    if ( j == 0 || j == this.base * 2 - 1 ) {
                        res += " ";
                    } else {
                        res += "_";
                    } 
                } else if ( i == this.altura ) {
                    if ( j == 0 || j == this.base * 2  - 1 ) {
                        res += "|";
                    } else {
                        res += "_";
                    }
                } else {
                    if ( j == 0 || j == this.base * 2  - 1 ) {
                        res += "|";
                    } else {
                        res += " ";
                    }
                }   
            }
            res += "\n";
        }
        return res;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return pintaRect();
    }
    
    
    
}
