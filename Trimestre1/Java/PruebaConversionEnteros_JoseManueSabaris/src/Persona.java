public class Persona {
    
    int peso;
    String nome;
    
    Persona (String nome, int peso) {
        this.peso = peso;
        this.nome = nome;
    }
    
    public static void main(String[] args) {
        
        Persona p1, p2;
        
        p1 = new Persona("Juan", 90);
        p2 = new Persona("Pedro", 85);
        
        if (p1.equals(p2))
            System.out.println("Iguales");
        else
            System.out.println("Distintos");
        
        String s;
        
        s = "Chámome";
        s = s + 5 + " " + 4444 + "\n";
        
        System.out.println(s.toUpperCase().toLowerCase());
        
        
}
}
