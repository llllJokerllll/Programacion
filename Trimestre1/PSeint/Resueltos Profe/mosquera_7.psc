Algoritmo sin_titulo
	
	//Declaración de variables
	Definir n1, n2, n3, ordenado1, ordenado2, ordenado3 como entero;
	
	//Petición de datos
	Escribir "Introduzca el primer número";
	Leer n1;
	Escribir "Introduzca el segundo número";
	Leer n2;
	Escribir "Introduzca el tercer número";
	Leer n3;
	
	//Operacións
	//Comprobo que non haxa ningún igual
	Si n1 = n2 | n1 = n3 | n2 = n3 Entonces
		Escribir "Error: hai dous números iguais";
	SiNo
		Si n1 > n2 Entonces
			Si n2 > n3 Entonces
				ordenado1 = n1;
				ordenado2 = n2;
				ordenado3 = n3;
			SiNo
				Si n3 > n1 Entonces
					ordenado1 = n3;
					ordenado2 = n1;
					ordenado3 = n2;
				SiNo
					ordenado1 = n1;
					ordenado2 = n3;
					ordenado3 = n2;					
				FinSi
			FinSi			
		SiNo
			Si n1 > n3 Entonces
				ordenado1 = n2;
				ordenado2 = n1;
				ordenado3 = n3;
			SiNo
				Si n3 > n2 Entonces
					ordenado1 = n3;
					ordenado2 = n2;
					ordenado3 = n1;
				SiNo
					ordenado1 = n2;
					ordenado2 = n3;
					ordenado3 = n1;					
				FinSi
			FinSi
		Fin Si
	Fin Si
	
	
	//Resultado
	Escribir ordenado1, " ", ordenado2, " ", ordenado3;
	Escribir ordenado3, " ", ordenado2, " ", ordenado1;
	
FinAlgoritmo
