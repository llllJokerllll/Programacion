//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio Seg�n 1
Proceso diaSemana
	
	//Aqu� vamos a pedir un n�mero del 1 al 7
	Definir dia Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduce un n�mero v�lido de la semana";
	Leer dia;
	
	Segun (dia) Hacer
		1: Escribir "Corresponde al Lunes";
		2: Escribir "Corresponde al Martes";
		3: Escribir "Corresponde al Mi�rcoles";
		4: Escribir "Corresponde al Jueves";
		5: Escribir "Corresponde al Viernes";
		6: Escribir "Corresponde al S�bado";
		7: Escribir "Corresponde al Domingo";
		De Otro Modo: Escribir "N�mero introducido no v�lido";
	FinSegun;
	
	Escribir "Hasta otra";
	
FinProceso
