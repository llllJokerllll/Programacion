//Autor: Jose Manuel Sabarís
//Título: Ejercicio Según 1
Proceso diaSemana
	
	//Aquí vamos a pedir un número del 1 al 7
	Definir dia Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduce un número válido de la semana";
	Leer dia;
	
	Segun (dia) Hacer
		1: Escribir "Corresponde al Lunes";
		2: Escribir "Corresponde al Martes";
		3: Escribir "Corresponde al Miércoles";
		4: Escribir "Corresponde al Jueves";
		5: Escribir "Corresponde al Viernes";
		6: Escribir "Corresponde al Sábado";
		7: Escribir "Corresponde al Domingo";
		De Otro Modo: Escribir "Número introducido no válido";
	FinSegun;
	
	Escribir "Hasta otra";
	
FinProceso
