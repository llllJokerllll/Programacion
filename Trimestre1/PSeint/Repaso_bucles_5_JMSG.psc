//Autor: Jose Manuel Sabar�s
//T�tulo: Repaso de bucles 5
Proceso maximoHastaCero
	
	//Aqu� vamos a pedir una lista de n�mero hasta que uno de ellos sea 0 y mostraremos el valor m�ximo y su posici�n.
	Definir num1 Como Real;
	Definir contador, posicion Como Entero;
	Definir nMaximo Como Real;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un n�mero";
	Leer num1;
	nMaximo <- num1;
	contador <- 1;
	posicion <- 1;
	
	Mientras num1 <> 0 Hacer
		
		Si nMaximo < num1 Entonces
			nMaximo <- num1;
			posicion <- contador;
		FinSi
		
		Escribir "Por favor, introduzca un n�mero";
		Leer num1;
		contador <- contador + 1;
	FinMientras
	
	Escribir "El n�mero m�nimo de la lista es: ", nMaximo, " y ocupa la posici�n: ", posicion;
	Escribir "Hasta otra";
	
FinProceso
