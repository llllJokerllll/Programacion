//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 9
Proceso numerosAscendentes
	
	//Aquí vamos a realizar un algoritmo que determine si una serie de números son ascendentes.
	Definir num1, num2 Como Entero;
	Definir ascendente Como Logico;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un número";
	Leer num1;
	Escribir "Por favor, introduzca otro número";
	Leer num2;
	
	Mientras num2 >= 0 Hacer
		
		Si num1 < num2 Entonces
			ascendente <- Verdadero;
			num1 <- num2;
		SiNo
			ascendente <- Falso;
			num1 <- num2;
		FinSi
		
		Escribir "Por favor, introduzca otro número";
		Leer num2;
		
	FinMientras
	
	Escribir "¿La serie de números es ascendente? ", ascendente;
	Escribir "Hasta otra";
	
FinProceso
