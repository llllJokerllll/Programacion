package acepta.el.reto;

import java.util.Scanner;

public class AceptaElReto_D {

	public static void main(String[] args) {
		
		int alto;
		int ancho;
		int presion;
		int altoGota;
		int anchoGota;
		int contador1;
		int contador2;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			alto = sc.nextInt();
			ancho = sc.nextInt();
			presion = sc.nextInt();
			if (alto == 0 && ancho == 0 && presion == 0) break;
			
			contador1 = 0;
			int[][] matriz = new int[alto][ancho];
			
			while (true) {
				altoGota = sc.nextInt();
				anchoGota = sc.nextInt();
				if (altoGota == -1 && anchoGota == -1) {
					break;
				} else {
					matriz[altoGota][anchoGota] = 8;
					while ( contador1 <= presion) {
						for ( contador2 = 0; contador2 < 8; contador2++ ) {
		                    if ( altoGota > 0 ) {
		                    	matriz[ altoGota - contador1 ][ anchoGota ] = 8;
		                        if ( anchoGota > 0 ) {
		                        	matriz[ altoGota - contador1 ][ anchoGota - contador1 ] = 8;
		                        }

		                        if ( anchoGota < ancho - contador1 ) {
		                        	matriz[ altoGota - contador1 ][ anchoGota + contador1 ] = 8;
		                        }
		                    }
		                    if ( anchoGota < ancho - contador1 ) {
		                    	matriz[ altoGota ][ anchoGota + contador1 ] = 8;
		                    }

		                    if ( anchoGota > 0 ) {
		                    	matriz[ altoGota ][ anchoGota - 1 ] = 8;
		                        if ( altoGota < alto - contador1 ) {
		                        	matriz[ altoGota + contador1 ][ anchoGota - contador1 ] = 8;
		                        }
		                    }
		                    if ( altoGota < alto - contador1 ) {
		                    	matriz[ altoGota + contador1 ][ anchoGota ] = 8;
		                    }
		                    if ( anchoGota < ancho - contador1 && altoGota < alto - contador1 ) {
		                    	matriz[ altoGota + contador1 ][ anchoGota + contador1 ] = 8;
		                    }

		                }
						contador1++;
					}
					
				}
				
			}
//			for (int i = 0; i < alto; i++) {
//				for (int j = 0; j < ancho; j++) {
//					if (matriz[i][j] == 8) {
//						
//					}
//				}
//			}
			for (int[] elemento : matriz) {
				for (int x : elemento) {
					System.out.print(x + " ");
				}
				System.out.println();
			}
			
		}

	}

}
