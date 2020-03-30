import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		int caja;
		int arenaDepositada;
		int arenaPerdida;
		int tiempo;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			caja = s.nextInt();
			arenaDepositada = s.nextInt();
			arenaPerdida = s.nextInt();
			
			if(caja != 0 || arenaDepositada != 0 || arenaPerdida != 0) {
				if(arenaPerdida >= arenaDepositada) {
					System.out.println("You must work harder!");
				} else if (caja!=0){
					tiempo = (caja / (arenaDepositada - arenaPerdida));
					if(caja <= (arenaPerdida + (arenaDepositada - arenaPerdida) * (tiempo-1))) {
						System.out.println(tiempo);
					} else {
						System.out.println(tiempo);
					}
				} else {
					System.out.println(0);
				}
			} else {
				break;
			}
			
		}
		s.close();
	}
}
