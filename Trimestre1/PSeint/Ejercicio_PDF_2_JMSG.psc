//Autor: Jose Manuel Sabarís
//Título: Ejercicio 2
Algoritmo calcular
	
	//Aqui vamos a realizar una suma o una multiplicación segun el valor de los 2 numero dados.
	Definir a Como Entero;
	Definir b Como Entero;
	Definir suma Como Entero;
	Definir producto como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un numero";
	Leer a;
	Escribir "Por favor, introduzca un segundo numero";
	Leer b;
	
	Si a > b Entonces
		suma <- a + b;
		Escribir "El resultado de la suma de sus números es: ", suma;
	SiNo
		producto <- a * b;
		Escribir "El resultado de la multiplicación de sus números es: ", producto;
	FinSi
	
	Escribir "Hasta otra";
	
FinAlgoritmo
