//Autor: Jose Manuel Sabarís
//Título: Ejercicios Bucles For 5
Proceso tablaMultiplicarCinco
	
	//Aquí vamos a realizar un algoritmo que escriba la tabla de multiplicar del 5: desde "5 x 0 = 0" hasta "5 x 10 = 50".	Definir contador Como Entero;
	Definir resultado Como Entero;
	
	Escribir "Hola";
	Escribir "Vamos a crear un algoritmo que te muestre la tabla de multiplicar del 5";
	
	Para contador <- 0 Hasta 10 Con Paso 1 Hacer
		resultado <- 5 * contador;
		Escribir "5 x ", contador, " = ", resultado;
	FinPara
	
	Escribir "Hasta otra";
	
FinProceso
