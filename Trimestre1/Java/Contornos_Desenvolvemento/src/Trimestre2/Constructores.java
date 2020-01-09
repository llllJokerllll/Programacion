package Trimestre2;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */
//

// Importación de librerías

public class Constructores {
        
        int hora;
        int minuto;
        int segundo;
        
        public Constructores() {
            this.cambiarHora(0, 0, 0);
        }
        
        public void cambiarHora( int valorHora, int valorMinuto, int valorSegundo ) {
            hora = ( valorHora >= 0 && valorHora < 24 ) ? valorHora : 0;
            minuto = ( valorMinuto >= 0 && valorMinuto < 60 ) ? valorMinuto : 0;
            segundo = ( valorMinuto >= 0 && valorHora < 60 ) ? valorSegundo : 0;
        }
        
        public String horaUniversal() {
            return String.format( "%02d:%02d:%02d", hora, minuto, segundo );
        }
        
        public String horaEstandar() {
            return String.format( "%02d:%02d:%02d", ( ( hora == 12 || hora == 0 ) ? 12 : ( hora % 12 ) ), minuto, segundo, ( hora < 12 ? "AM" : "PM" ) );
        }

    public int getHora() {
        return hora;
    }

    public void setHora( int hora ) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto( int minuto ) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo( int segundo ) {
        this.segundo = segundo;
    }

    
} // fin de la clase Constructores

