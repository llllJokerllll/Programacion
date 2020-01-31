package prueba2;

public class Configuracion {

    private static Configuracion config = null;
    
    private Configuracion() {
        
    }
    
    public static Configuracion getInstance() {
        if (config == null ) {
            config = new Configuracion();
        }
        return config;
    }
    
}
