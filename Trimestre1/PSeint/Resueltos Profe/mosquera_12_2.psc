Algoritmo sin_titulo
	
	//Declaraci�n de variables de entrada
	Definir hora, minuto, segs como Entero;	
	//Variables para sa�da de datos
	Definir segundosSolucion, minutosSolucion, horasSolucion como Entero;
	//Constantes
	Definir HORALIMITE, MINUTOLIMITE Como Entero;	
	
	//Petici�n de datos	
	Escribir "Introduza hora ";
	Leer hora;
	Escribir "Introduzca minutos ";
	Leer minuto;
	Escribir "Introduzca segundos ";
	Leer segs;
	
	Escribir "La hora introducida es: ", hora, ":", minuto, ": ", segs;
	
	//Inicializaci�n das constantes
	HORALIMITE = 23;
	MINUTOLIMITE = 59;
	
	//Efect�o os c�lculos			
	Si hora >= 24 | minuto >= 60 | segs >= 60 Entonces
		Escribir "Error en los datos";
	SiNo
		horasSolucion = HORALIMITE- hora;
		minutosSolucion = MINUTOLIMITE - minuto;
		
		//Agora comeza o escabroso
		Si segs > 0 Entonces
			segundosSolucion = 60 - segs;
			Si minutosSolucion == 0 Entonces
				minutosSolucion = 59;
				horasSolucion = horasSolucion - 1;
			SiNo
				minutosSolucion = minutosSolucion - 1;
			FinSi
		FinSi		
		
		Escribir "Restan " horasSolucion, ":", minutosSolucion, ":", segundosSolucion;
	Fin Si
	
FinAlgoritmo
