//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 23
Proceso estadoDelAgua
	
	//Aqu� vamos a pedir una temperatura en grados celsius y mostrar en que estado se enmcontrar�a el agua en dicha temperatura.
	Definir temperatura Como Real;
	Definir estado Como Caracter;
	
	Escribir "Hola";
	Escribir "Por favor introduzca una temperatura en grados Celsius";
	Leer temperatura;
	
	Si temperatura <= 0 Entonces
		estado <- "s�lido";
	SiNo Si temperatura > 0 && temperatura <= 100 Entonces
			estado <- "l�quido";
		SiNo
			estado <- "gaseoso";
		FinSi;
	FinSi;
	
	Escribir "El estado del agua en la temperatura dada es: ", estado;
	Escribir "Hasta otra";
	
FinProceso
