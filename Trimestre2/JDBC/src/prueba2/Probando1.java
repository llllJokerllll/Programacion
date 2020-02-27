package prueba2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Persoa {
    
    private int idade;
    private String nomCompleto;
    
    public Persoa (String nomCompleto, int idade) {
        this.nomCompleto = nomCompleto;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("Persoa [idade=%s, nomCompleto=%s]%n", idade, nomCompleto);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idade;
        result = prime * result + ((nomCompleto == null) ? 0 : nomCompleto.hashCode());
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
        Persoa other = (Persoa) obj;
        if (idade != other.idade)
            return false;
        if (nomCompleto == null) {
            if (other.nomCompleto != null)
                return false;
        } else if (!nomCompleto.equals(other.nomCompleto))
            return false;
        return true;
    }
    
    
}

public class Probando1 {

    static Set<Persoa> lista;
    
    public static void main(String[] args) {

        lista = new HashSet<Persoa>();
        lista.add(new Persoa("Jose Manuel Sabaris", 31));
        lista.add(new Persoa("Carmen Mar�a Iglesias", 27));
        lista.add(new Persoa("Anxo Portela", 25));
        lista.add(new Persoa("Pablo Vazquez", 45));
        lista.add(new Persoa("Ronaldinho Gaucho", 40));
        lista.add(new Persoa("Romario da Silva", 18));
        lista.add(new Persoa("Alex Criville", 29));
        lista.add(new Persoa("Jose Manuel Sabaris", 31));
        
        Object[] p = devolverArray();
        
        for (Object o : p) {
            System.out.println(o);
        }
        
        System.out.println(lista);
        List<Persoa> lista2 = new ArrayList<>();
        lista2.addAll(lista);
    }

    public static Object[] devolverArray() {
        
        return lista.toArray();
    }
}
