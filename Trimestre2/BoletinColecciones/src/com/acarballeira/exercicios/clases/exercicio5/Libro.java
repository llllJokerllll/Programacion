/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio5;

// TODO: Auto-generated Javadoc
/**
 * The Class Libro.
 */
public class Libro {

    /** The titulo. */
    protected String titulo;
    
    /** The autor. */
    protected String autor;
    
    /** The num pax. */
    protected int numPax;
    
    /** The editorial. */
    protected String editorial;
    
    /** The codigo. */
    protected int codigo;
    
    /**
     * Instantiates a new libro.
     *
     * @param titulo the titulo
     * @param autor the autor
     * @param codigo the codigo
     */
    public Libro(String titulo, String autor, int codigo ) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
    }
    
    /**
     * Instantiates a new libro.
     *
     * @param titulo the titulo
     * @param autor the autor
     * @param numPax the num pax
     * @param editorial the editorial
     * @param codigo the codigo
     */
    public Libro(String titulo, String autor, int numPax, String editorial, int codigo) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.numPax = numPax;
        this.editorial = editorial;
        this.codigo = codigo;
    }

    /**
     * Gets the titulo.
     *
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the titulo.
     *
     * @param titulo the new titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Gets the autor.
     *
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Sets the autor.
     *
     * @param autor the new autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Gets the num pax.
     *
     * @return the num pax
     */
    public int getNumPax() {
        return numPax;
    }

    /**
     * Sets the num pax.
     *
     * @param numPax the new num pax
     */
    public void setNumPax(int numPax) {
        this.numPax = numPax;
    }

    /**
     * Gets the editorial.
     *
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Sets the editorial.
     *
     * @param editorial the new editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Gets the codigo.
     *
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Hash code.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((editorial == null) ? 0 : editorial.hashCode());
        result = prime * result + numPax;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        return result;
    }

    /**
     * Equals.
     *
     * @param obj the obj
     * @return true, if successful
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (editorial == null) {
            if (other.editorial != null)
                return false;
        } else if (!editorial.equals(other.editorial))
            return false;
        if (numPax != other.numPax)
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("------- Libro -------\n%s\n%s Ed.%s\n%d páxinas\nCódigo: %d\n---------------------\n", titulo, autor, (editorial == null) ? "" : editorial, numPax, codigo);
    }
    
    
    
}
