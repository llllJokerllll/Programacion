
/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio
 * @version 1.0
 */
// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_108 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        String tipoVenta;
        double precioVenta;
        // Salida de datos
        String resMaxVenta, resMinVenta, resPromedio;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        double promedio;
        double maximoVenta, minimoVenta;
        double dDesayunos, aComidas, mMeriendas, iCenas, cCopas;
        // Constantes
        // Inicialización
        

        // Entrada de datos y comprobación
        while ( entrada.hasNext() ) {
            promedio = dDesayunos = aComidas = mMeriendas = iCenas = cCopas = 0;
            maximoVenta = -9999999.99;
            minimoVenta = 9999999.99;
            resMaxVenta = resMinVenta = "";
            while ( true ) {
                tipoVenta = entrada.next();
                precioVenta = entrada.nextDouble();
                if ( tipoVenta.equals( "N" ) && precioVenta == 0 ) {
                    break;
                }

                switch ( tipoVenta ) {
                    case "D":
                        dDesayunos = precioVenta;
                        if ( maximoVenta < precioVenta ) {
                            maximoVenta = precioVenta;
                            resMaxVenta = "DESAYUNOS";
                        } else if ( maximoVenta == precioVenta ) {
                            resMaxVenta = "EMPATE";
                        }
                        if ( minimoVenta > precioVenta ) {
                            minimoVenta = precioVenta;
                            resMinVenta = "DESAYUNOS";
                        } else if ( minimoVenta == precioVenta ) {
                            resMinVenta = "EMPATE";
                        }
                        break;
                    case "A":
                        aComidas = precioVenta;
                        if ( maximoVenta < precioVenta ) {
                            maximoVenta = precioVenta;
                            resMaxVenta = "COMIDAS";
                        } else if ( maximoVenta == precioVenta ) {
                            resMaxVenta = "EMPATE";
                        }
                        if ( minimoVenta > precioVenta ) {
                            minimoVenta = precioVenta;
                            resMinVenta = "COMIDAS";
                        } else if ( minimoVenta == precioVenta ) {
                            resMinVenta = "EMPATE";
                        }
                        break;
                    case "M":
                        mMeriendas = precioVenta;
                        if ( maximoVenta < precioVenta ) {
                            maximoVenta = precioVenta;
                            resMaxVenta = "MERIENDAS";
                        } else if ( maximoVenta == precioVenta ) {
                            resMaxVenta = "EMPATE";
                        }
                        if ( minimoVenta > precioVenta ) {
                            minimoVenta = precioVenta;
                            resMinVenta = "MERIENDAS";
                        } else if ( minimoVenta == precioVenta ) {
                            resMinVenta = "EMPATE";
                        }
                        break;
                    case "I":
                        iCenas = precioVenta;
                        if ( maximoVenta < precioVenta ) {
                            maximoVenta = precioVenta;
                            resMaxVenta = "CENAS";
                        } else if ( maximoVenta == precioVenta ) {
                            resMaxVenta = "EMPATE";
                        }
                        if ( minimoVenta > precioVenta ) {
                            minimoVenta = precioVenta;
                            resMinVenta = "CENAS";
                        } else if ( minimoVenta == precioVenta ) {
                            resMinVenta = "EMPATE";
                        }
                        break;
                    case "C":
                        cCopas = precioVenta;
                        if ( maximoVenta < precioVenta ) {
                            maximoVenta = precioVenta;
                            resMaxVenta = "COPAS";
                        } else if ( maximoVenta == precioVenta ) {
                            resMaxVenta = "EMPATE";
                        }
                        if ( minimoVenta > precioVenta ) {
                            minimoVenta = precioVenta;
                            resMinVenta = "COPAS";
                        } else if ( minimoVenta == precioVenta ) {
                            resMinVenta = "EMPATE";
                        }
                        break;
                }
                promedio += precioVenta;
            }
            promedio /= 5;
            if ( promedio < aComidas ) {
                resPromedio = "SI";
            } else {
                resPromedio = "NO";
            }

            if ( minimoVenta < dDesayunos || minimoVenta < aComidas || minimoVenta < mMeriendas || minimoVenta < iCenas || minimoVenta < cCopas ) {
                if ( dDesayunos == 0 && aComidas != 0 && mMeriendas != 0 && iCenas != 0 && cCopas != 0 ) {
                    resMinVenta = "DESAYUNOS";
                } else if ( aComidas == 0 && mMeriendas != 0 && iCenas != 0 && cCopas != 0 && dDesayunos != 0 ) {
                    resMinVenta = "COMIDAS";
                } else if ( mMeriendas == 0 && iCenas != 0 && cCopas != 0 && dDesayunos != 0 && aComidas != 0 ) {
                    resMinVenta = "MERIENDAS";
                } else if ( iCenas == 0 && cCopas != 0 && dDesayunos != 0 && aComidas != 0 && mMeriendas != 0 ) {
                    resMinVenta = "CENAS";
                } else if ( cCopas == 0 && dDesayunos != 0 && aComidas != 0 && mMeriendas != 0 && iCenas != 0 ) {
                    resMinVenta = "COPAS";
                } else {
                    resMinVenta = "EMPATE";
                }
            }

            System.out.println( resMaxVenta + "#" + resMinVenta + "#" + resPromedio );

        }
        entrada.close();

    } // fin de main

} // fin de la clase AceptaElReto_108
