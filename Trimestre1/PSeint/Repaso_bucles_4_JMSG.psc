//Autor: Jose Manuel Sabar�s
//T�tulo: Repaso de bucles 4
Proceso maximoHastaCero
	
	//Aqu� vamos a pedir una lista de n�mero hasta que uno de ellos sea 0 y mostraremos el valor m�ximo.
	Definir num1 Como Real;
	Definir nMaximo Como Real;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un n�mero";
	Leer num1;
	nMaximo <- num1;
	
	Mientras num1 <> 0 Hacer
		
		Si nMaximo < num1 Entonces
			nMaximo <- num1;
		FinSi
		
		Escribir "Por favor, introduzca un n�mero";
		Leer num1;
	FinMientras
	
	Escribir "El n�mero m�nimo de la lista es: ", nMaximo;
	Escribir "Hasta otra";
	
FinProceso
