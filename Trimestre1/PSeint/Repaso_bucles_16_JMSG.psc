//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 16
Proceso multiplosNueve
	
	//Aquí vamos a realizar la comprobaciíon de si un numero es divisible entre 9.
	//Definición de variables
	Definir num1, dividendo, digitos, resto Como Entero;
	Definir numeroSuelto, sumaResto Como Entero;
	
	//Inicialización de variables
	digitos <- 0;
	
	//Entrada de datos
	Escribir "Hola";
	Escribir "Por favor, introduzca un número";
	Leer num1;
	
	//Comprobación y proceso
	dividendo <- num1;
	Repetir
		sumaResto <- 0;
		Mientras dividendo > 0 Hacer
		resto <- dividendo % 10;
		dividendo <- trunc(dividendo / 10);
		numeroSuelto <- resto;
		sumaResto <- numeroSuelto + sumaResto;
		digitos <- digitos + 1;
	FinMientras
	dividendo <- sumaResto;
	Hasta Que sumaResto <= 9;
	
	//Salida Resultado
	Si sumaResto == 9 Entonces
		Escribir "Como ", sumaResto, " es divisible por 9, ", num1, " es divisible por 9";
	SiNo
		Escribir "Como ", sumaResto, " no es divisible por 9, ", num1, " no es divisible por 9";
	FinSi
	Escribir "Hasta otra";
	
FinProceso
