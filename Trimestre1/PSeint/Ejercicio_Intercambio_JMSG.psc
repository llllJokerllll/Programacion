//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio secuencial B
Algoritmo intercambio
	
	//Aqui vamos a intercambiar los valores de n1 y n2 a traves de una variable temporal.
	Definir n1 Como Entero;
	Definir n2 Como Entero;
	Definir temporal Como Entero;
	
	Escribir "Bienvendo";
	Escribir "Vamos a realizar un intercambio de valores de 2 n�meros de su elecci�n";
	Escribir "Por favor, introduzca el primer n�mero";
	Leer n1;
	Escribir "Por favor, introduzca el segundo n�mero";
	Leer n2;
	
	temporal <- n1;
	n1 <- n2;
	n2 <- temporal;
	
	Escribir "El valor del primer n�mero ahora es = ", n1;
	Escribir "El valor del segundo n�mero ahora es = ", n2;
	Escribir "Hasta otra";
	
	
	
FinAlgoritmo
