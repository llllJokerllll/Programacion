//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 6
Proceso intervaloSuma
	
	//Aquí vamos a definir un intervalo entre A y B y sumar solo los siguientes valores que esten dentro, finaliza al ingresar el 99.
	Definir a, b Como Real;
	Definir num Como Real;
	Definir suma Como Real;
	
	num <- 1;
	suma <- 0;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un número";
	Leer a;
	Escribir "Por favor, introduzca otro número";
	Leer b;
	
	Mientras num <> 99 Hacer
		Escribir "Por favor, introduzca un valor dentro del intervalo";
		Leer num;
		Si num <= a && num >= b || num >= a && num <= b Entonces
			suma <- suma + num;
		FinSi
	FinMientras
	
	Escribir "La suma de los valores dentro del intervalo es: ", suma;
	Escribir "Hasta otra";
	
FinProceso
