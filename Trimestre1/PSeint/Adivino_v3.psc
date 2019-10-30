//Autor: Jose Manuel Sabarís
//Título: Ejercicio Encerado Adivinar v3
Algoritmo adivino_v3
	
	Definir adivina Como Entero;
	Definir num_adivinar, n_voltas Como Entero;
	
	n_voltas <- 0;
	num_adivinar <- 1;
	
	Mientras n_voltas < 2 Hacer
		num_adivinar <- num_adivinar * azar(101);
		n_voltas <- n_voltas + 1;
	FinMientras
	
	Escribir "El número anterior al correcto es: ", num_adivinar;
	Leer adivina;
	
	Repetir
		Escribir "Número incorrecto";
		Leer adivina;
	Hasta Que adivina == num_adivinar;
	
	Escribir "Felicidaes crack, has acertado";
	
FinAlgoritmo
