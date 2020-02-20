package com.acarballeira.exercicios.clases.exercicio5v2;

public class Libro {

    protected String titulo;
    protected String autor;
    protected int numPax;
    protected String editorial;
    protected int codigo = 0;
    protected final static byte INCREMENTO_CODIGO = 5;
    private static int ultimoCod = 0;
    
    public Libro(String titulo, String autor ) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        if (ultimoCod == 0) {
            this.codigo = 0;
        } else {
            this.codigo = ultimoCod + INCREMENTO_CODIGO;
            ultimoCod = this.codigo;
        }
        
    }
    
    public Libro(String titulo, String autor, int numPax, String editorial) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.numPax = numPax;
        this.editorial = editorial;
        if (ultimoCod == 1) {
            this.codigo = 0;
        } else {
            this.codigo = ultimoCod + INCREMENTO_CODIGO;
        }
        ultimoCod = this.codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPax() {
        return numPax;
    }

    public void setNumPax(int numPax) {
        this.numPax = numPax;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCodigo() {
        return codigo;
    }

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

    @Override
    public String toString() {
        return String.format("------- Libro -------\n%s\n%s Ed.%s\n%d páxinas\nCódigo: %d\n---------------------\n", titulo, autor, (editorial == null) ? "" : editorial, numPax, codigo);
    }
    
    
    
}
