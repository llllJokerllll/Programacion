//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 4
Proceso maximoHastaCero
	
	//Aquí vamos a pedir una lista de número hasta que uno de ellos sea 0 y mostraremos el valor máximo.
	Definir num1 Como Real;
	Definir nMaximo Como Real;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un número";
	Leer num1;
	nMaximo <- num1;
	
	Mientras num1 <> 0 Hacer
		
		Si nMaximo < num1 Entonces
			nMaximo <- num1;
		FinSi
		
		Escribir "Por favor, introduzca un número";
		Leer num1;
	FinMientras
	
	Escribir "El número mínimo de la lista es: ", nMaximo;
	Escribir "Hasta otra";
	
FinProceso
