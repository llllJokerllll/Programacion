//Autor: Jose Manuel Sabar�s
//T�tulo: Repaso de bucles 3
Proceso minimoHastaCero
	
	//Aqu� vamos a pedir una lista de n�mero hasta que uno de ellos sea 0 y mostraremos el valor m�nimo.
	Definir num1 Como Real;
	Definir nMinimo Como Real;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un n�mero";
	Leer num1;
	nMinimo <- num1;
	
	Mientras num1 <> 0 Hacer
		
		Si nMinimo > num1 Entonces
			nMinimo <- num1;
		FinSi
		
		Escribir "Por favor, introduzca un n�mero";
		Leer num1;
	FinMientras
	
	Escribir "El n�mero m�nimo de la lista es: ", nMinimo;
	Escribir "Hasta otra";
	
FinProceso
