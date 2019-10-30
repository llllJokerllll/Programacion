//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 3
Proceso minimoHastaCero
	
	//Aquí vamos a pedir una lista de número hasta que uno de ellos sea 0 y mostraremos el valor mínimo.
	Definir num1 Como Real;
	Definir nMinimo Como Real;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un número";
	Leer num1;
	nMinimo <- num1;
	
	Mientras num1 <> 0 Hacer
		
		Si nMinimo > num1 Entonces
			nMinimo <- num1;
		FinSi
		
		Escribir "Por favor, introduzca un número";
		Leer num1;
	FinMientras
	
	Escribir "El número mínimo de la lista es: ", nMinimo;
	Escribir "Hasta otra";
	
FinProceso
