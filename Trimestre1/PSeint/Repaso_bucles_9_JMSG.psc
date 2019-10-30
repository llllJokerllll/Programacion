//Autor: Jose Manuel Sabar�s
//T�tulo: Repaso de bucles 9
Proceso numerosAscendentes
	
	//Aqu� vamos a realizar un algoritmo que determine si una serie de n�meros son ascendentes.
	Definir num1, num2 Como Entero;
	Definir ascendente Como Logico;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un n�mero";
	Leer num1;
	Escribir "Por favor, introduzca otro n�mero";
	Leer num2;
	
	Mientras num2 >= 0 Hacer
		
		Si num1 < num2 Entonces
			ascendente <- Verdadero;
			num1 <- num2;
		SiNo
			ascendente <- Falso;
			num1 <- num2;
		FinSi
		
		Escribir "Por favor, introduzca otro n�mero";
		Leer num2;
		
	FinMientras
	
	Escribir "�La serie de n�meros es ascendente? ", ascendente;
	Escribir "Hasta otra";
	
FinProceso
