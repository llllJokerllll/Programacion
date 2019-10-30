//Autor: Jose Manuel Sabarís
//Título: Ejercicio 13
Algoritmo porcentajes
	
	//Aqui vamos a hallar el porcentaje que es x de y
	Definir i, j Como Entero;
	Definir resultado Como Real;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 2 números";
	Escribir "Por favor, introduzca el primer número";
	Leer i;
	Escribir "Por favor, introduzca el segundo número";
	Leer j;
	
	resultado <- (100 * i) / j;
	
	Escribir "El porcentaje de X de Y es: ", resultado, "%";
	Escribir "Hasta otra";
	
FinAlgoritmo
