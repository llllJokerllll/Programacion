Algoritmo sin_titulo
	
	//Declaraci�n de variables
	Definir n1, n2, n3, ordenado1, ordenado2, ordenado3 como entero;
	
	//Petici�n de datos
	Escribir "Introduzca el primer n�mero";
	Leer n1;
	Escribir "Introduzca el segundo n�mero";
	Leer n2;
	Escribir "Introduzca el tercer n�mero";
	Leer n3;
	
	//Operaci�ns
	//Comprobo que non haxa ning�n igual
	Si n1 = n2 | n1 = n3 | n2 = n3 Entonces
		Escribir "Error: hai dous n�meros iguais";
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
