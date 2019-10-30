Algoritmo sin_titulo
	
	//Declaración de variables de entrada
	Definir hora, minuto, segs como Entero;
	Definir segundosTotales, segundosARestar, segundosResultado como Entero;
	//Variables de saída
	Definir segundosSolucion, minutosSolucion, horasSolucion como Entero;
	
	//Petición de datos	
	Escribir "Introduza hora ";
	Leer hora;
	Escribir "Introduzca minutos ";
	Leer minuto;
	Escribir "Introduzca segundos ";
	Leer segs;
	
	Escribir "La hora introducida es: ", hora, ":", minuto, ": ", segs;
	
	//Efectúo os cálculos			
	Si hora >= 24 | minuto >= 60 | segs >= 60 Entonces
		Escribir "Error en los datos";
	SiNo
		segundosTotales = 23* 60 * 60 + 59 *60;
		segundosARestar = hora *60 * 60 + minuto * 60 + segs;
		segundosResultado = segundosTotales - segundosARestar;
		
		segundosSolucion = segundosResultado % 60;
		minutosSolucion = trunc ( segundosResultado / 60 );
		horasSolucion =  trunc ( minutosSolucion / 60 );
		minutosSolucion = minutosSolucion % 60;
		
		Escribir "Restan " horasSolucion, ":", minutosSolucion, ":", segundosSolucion;
	Fin Si
	
FinAlgoritmo
