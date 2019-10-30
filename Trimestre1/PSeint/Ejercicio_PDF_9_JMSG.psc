//Autor: Jose Manuel Sabarís
//Título: Ejercicio 9
Algoritmo maxminsuma
	
	//Aqui vamos a pedir 4 números y sumaremos el de máximo valor con el de mínimo valor.
	Definir A, B, C, D Como Entero;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 4 números y le daremos la suma del mayor y menor valor";
	Escribir "Introduzca el primer números";
	Leer A;
	Escribir "Introduzca el segundo números";
	Leer B;
	Escribir "Introduzca el tercero números";
	Leer C;
	Escribir "Introduzca el cuarto números";
	Leer D;
	
	Si A >= B y A >= C y A >= D Entonces
		Si B >= C y B >= D Entonces
			Si C >= D Entonces
				Escribir "El resultado es ", A + D;
			SiNo
				Escribir "El resultado es ", A + C; 
			FinSi;
		SiNo Si C >= B y C >= D Entonces
				Si B >= D Entonces
					Escribir "El resultado es ", A + D;
				SiNo
					Escribir "El resultado es ", A + B;
				FinSi;
			SiNo Si D >= B y D >= C Entonces
					Si C >= B Entonces
						Escribir "El resultado es ", A + B;
					SiNo
						Escribir "El resultado es ", A + C;
					FinSi;
				FinSi;
			FinSi;
		FinSi;
	Sino Si B >= A y B >= C y B >= D Entonces
			Si A >= C y A >= D Entonces
				Si C >= D Entonces
					Escribir "El resultado es ", B + D;
				SiNo
					Escribir "El resultado es ", B + C;
				FinSi;
			SiNo Si	C >= A y C >= D Entonces
					Si A >= D Entonces
						Escribir "El resultado es ", B + D;
					SiNo
						Escribir "El resultado es ", B + A;
					FinSi;
				SiNo Si D >= A y D >= C Entonces
						Si A >= C Entonces
							Escribir "El resultado es ", B + C;
						SiNo
							Escribir "El resultado es ", B + A;
						FinSi;
					FinSi;					
				FinSi;
			FinSi;
		SiNo Si C >= A y C >= B y C >= D Entonces
				Si A >= B y A >= D Entonces
					Si B >= D Entonces
						Escribir "El resutado es ", C + D;
					SiNo
						Escribir "El resultado es ", C + B;
					FinSi;
				SiNo Si B >= A y B >= D Entonces
						Si A >= D Entonces
							Escribir "El resultado es ", C+D;
						SiNo
							Escribir "El resultado es ", C+A;
						FinSi;
					SiNo Si D >= A y D >= B Entonces
							Si A >= B Entonces
								Escribir "El resultado es ", C + B;
							SiNo
								Escribir "El resultado es ", C + A;
							FinSi;
						FinSi;
					FinSi;
				FinSi;
			Sino Si D >= A y D >= B y D >= C Entonces
					Si A >= B y A >= C Entonces
						Si B >= C Entonces
							Escribir "El resultado es ", D + C;
						SiNo
							Escribir "El resultado es ", D + B;
						FinSi;
					SiNo Si B >= A y B >= C Entonces
							Si A >= C Entonces
								Escribir "El resultado es ", D + C;
							SiNo
								Escribir "El resultado es ", D + A;
							FinSi;
						SiNo Si C >= B y C >= A Entonces
								Si B >= A Entonces
									Escribir "El resultado es ", D + A;
								SiNo
									Escribir "El resultado es ", D + B;
								FinSi;
							FinSi;
						FinSi;
					FinSi;
				FinSi;
			FinSi;
		FinSi;
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
