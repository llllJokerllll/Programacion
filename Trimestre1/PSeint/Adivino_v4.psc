//Autor: Jose Manuel Sabarís
//Título: Ejercicio Encerado Adivinar v4
Algoritmo adivino_v4
	
	Definir adivina Como Entero;
	Definir num_adivinar, n_voltas Como Entero;
	
	//n_voltas <- 0;
	num_adivinar <- 1;
	
	Para n_voltas <- 1 Hasta 2 Con Paso 1 Hacer
		num_adivinar <- num_adivinar * azar(101);
	FinPara
	
	Escribir "El número anterior al correcto es: ", num_adivinar - 1;
	Leer adivina;
	
	Repetir
		Escribir "Número incorrecto";
		Leer adivina;
	Hasta Que adivina == num_adivinar;
	
	Escribir "Felicidaes crack, has acertado";
	
FinAlgoritmo
