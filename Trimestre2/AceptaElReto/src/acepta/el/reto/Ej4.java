import java.util.Scanner;

public class Ej4{
	public static void main(String[] args) {
		int[][] lienzo;
		int ancho;
		int alto;
		int presion;
		int contador;
		
		int gotax;
		int gotay;
		Scanner s = new Scanner(System.in);
		while(true) {
			contador = 0;
			alto = s.nextInt();
			ancho = s.nextInt();
			lienzo = new int[alto][ancho];
			presion = s.nextInt();
			if(alto == 0 && ancho == 0 && presion == 0) {
				break;
			}
			
			//gotas
			while(true) {
				
			gotay = s.nextInt();
			gotax = s.nextInt();
			if(gotay == -1 && gotax==-1) {
				break;
		}
			for(int pintarY = gotay - presion; pintarY <= gotay + presion; pintarY++) {
				for(int pintarX = gotax - presion; pintarX <= gotax + presion; pintarX++) {
						if(pintarX >= 0 && pintarY>=0 && pintarX < ancho && pintarY < alto) {
							lienzo[pintarY][pintarX] = 1;	
						}
				}
			}
			}
			for (int[] fila : lienzo) {
				for (int gota : fila) {
					if(gota != 1) {
						contador++;
					}
				}
			}
			System.out.println(contador);
		}

		
	}
}

