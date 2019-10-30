//Autor: Jose Manuel Sabar�s
//T�tulo: Xogo dos Penaltis
Proceso xogoPenaltis
	
	//Aqu� vamos a realizar un juego sobre el tiro de penaltis.
	//Definici�n de variables
	Definir tiro, portero, contador Como Entero;
	Definir numGoles, golesDerecha, golesCentro, golesIzquierda, tiroFallado Como Entero;
	
	//Inicializaci�n de variables
	contador <- 0;
	numGoles <- 0;
	golesIzquierda <- 0;
	golesCentro <- 0;
	golesDerecha <- 0;
	tiroFallado <- 0;
	
	//Entrada de datos, Comprobaci�n y proceso
	Escribir "Hola";
	
	Repetir
		Escribir Sin Saltar "Por favor, introduzca la direcci�n de su tiro entre las ubicaciones 1 - 6: ";
		Leer tiro;
		Mientras tiro < 1 | tiro > 6 Hacer
			Escribir Sin Saltar "Por favor, introduzca la direcci�n de su tiro entre las ubicaciones 1 - 6: ";
			Leer tiro;
		FinMientras
		portero <- Azar(6) + 1;
		
		Si tiro <> portero Entonces
			numGoles <- numGoles + 1;
			Escribir "GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOL!!!";
			Si tiro == 3 || tiro == 4 Entonces
				golesIzquierda <- golesIzquierda + 1;
			SiNo Si tiro == 2 || tiro == 5 Entonces
					golesCentro <- golesCentro + 1;
				SiNo
					golesDerecha <- golesDerecha + 1;
				FinSi
			FinSi
		SiNo
			Escribir "Que mal, el portero ha parado su tiro";
			tiroFallado <- tiroFallado + 1;
		FinSi
		contador <- contador + 1;
	Hasta Que contador == 5
	
	//Salida Resultado
	Escribir "Usted ha metido un total de: ", numGoles, " goles en esta partida";
	Escribir "Usted ha fallado un total de: ", tiroFallado, " tiros en esta partida";
	Si golesIzquierda > golesCentro || golesIzquierda > golesDerecha Entonces
		Si golesIzquierda == golesCentro || golesIzquierda == golesDerecha Entonces
			Escribir "No hay una mayor�a de goles en una parte espec�fica de la porter�a";
		SiNo
			Escribir "La mayor�a de goles fueron marcados por la parte Izquierda de la porter�a";
		FinSi
	SiNo Si golesCentro > golesDerecha Entonces
			Si golesCentro == golesIzquierda || golesCentro == golesDerecha Entonces
				Escribir "No hay una mayor�a de goles en una parte espec�fica de la porter�a";
			SiNo
				Escribir "La mayor�a de goles fueron marcados por la parte Central de la porter�a";
			FinSi
		SiNo
			Si golesDerecha == golesCentro || golesDerecha == golesIzquierda Entonces
				Escribir "No hay una mayor�a de goles en una parte espec�fica de la porter�a";
			SiNo
				Escribir "La mayor�a de goles fueron marcados por la parte Derecha de la porter�a";
			FinSi
		FinSi
	FinSi
	Si golesIzquierda == 0 Entonces
		Escribir "No se han marcado goles por la parte Izquierda de la porter�a";
	FinSi
	Si golesCentro == 0 Entonces
		Escribir "No se han marcado goles por la parte Central de la porter�a";
	FinSi
	Si golesDerecha == 0 Entonces
		Escribir "No se han marcado goles por la parte Derecha de la porter�a";
	FinSi
	Escribir "Hasta otra";
	
FinProceso
