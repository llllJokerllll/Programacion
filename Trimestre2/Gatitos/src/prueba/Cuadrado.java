package prueba;

public class Cuadrado {

    int lado;
    public Cuadrado(int l) {
        this.lado = l;
    }
    
    public String toString() {
        int i, espacios;
        String resultado = "";
        
        for (i = 0; i < this.lado; i++) {
            resultado += "00";
        }
        resultado += "\n";
        
        for(i = 1; i < this.lado - 1; i++) {
            resultado += "00";
            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += "  ";
            }
            resultado += "00\n";
        }
        
        for (i = 0; i < this.lado; i++) {
            resultado += "00";
        }
        resultado += "\n";
        
        return resultado;
    }
}
