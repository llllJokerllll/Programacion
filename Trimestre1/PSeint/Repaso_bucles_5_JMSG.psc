//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 5
Proceso maximoHastaCero
	
	//Aquí vamos a pedir una lista de número hasta que uno de ellos sea 0 y mostraremos el valor máximo y su posición.
	Definir num1 Como Real;
	Definir contador, posicion Como Entero;
	Definir nMaximo Como Real;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un número";
	Leer num1;
	nMaximo <- num1;
	contador <- 1;
	posicion <- 1;
	
	Mientras num1 <> 0 Hacer
		
		Si nMaximo < num1 Entonces
			nMaximo <- num1;
			posicion <- contador;
		FinSi
		
		Escribir "Por favor, introduzca un número";
		Leer num1;
		contador <- contador + 1;
	FinMientras
	
	Escribir "El número mínimo de la lista es: ", nMaximo, " y ocupa la posición: ", posicion;
	Escribir "Hasta otra";
	
FinProceso
