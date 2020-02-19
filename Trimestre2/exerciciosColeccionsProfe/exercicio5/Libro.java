package com.acarballeira.exercicios.clases.exercicio5;

public class Libro {

    protected String titulo;
    protected String autor;
    protected String editorial;
    protected int numPaxinas;
    protected int codigo = 0;
    private static int ultimoCodigo = -1;
    protected static final byte INCREMENTO_CODIGO = 5;
    
    
    
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = "";
        this.numPaxinas = 0;
        
        if (ultimoCodigo == -1)
            this.codigo = 0;
        else
            this.codigo = ultimoCodigo + INCREMENTO_CODIGO;
        
        ultimoCodigo = this.codigo;
    }
    
    public Libro(String titulo, String autor, String editorial) {
        this(titulo, autor);
        this.editorial = editorial;
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
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public int getNumPaxinas() {
        return numPaxinas;
    }
    public void setNumPaxinas(int numPaxinas) {
        this.numPaxinas = numPaxinas;
    }
    public int getCodigo() {
        return codigo;
    }
    
    @Override
    public String toString() {
        
        return String.format("······· LIBRO ······%n"
                + "%s%n%s Ed.%s%n%d páxinas%nCódigo: %d%n"
                + "···················%n", this.titulo, this.autor, this.editorial, this.numPaxinas, this.codigo);
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
        if (numPaxinas != other.numPaxinas)
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }
    
    
    
}
