//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 20
Algoritmo anguloCuadrante
	
	//Aqu� vamos a descubrir en que cuadrante o eje est� una l�nea seg�n su �ngulo respecto al eje positivo X.
	Definir angulo Como Entero;
	Definir cuadrante Como Caracter;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca el �ngulo que forma la l�nea respecto al eje postivo X";
	Leer angulo;
	
	Si angulo < 0 || angulo > 360 Entonces
		Escribir "El valor introducido es incorrecto";
	SiNo Si angulo == 0 || angulo == 180 || angulos == 360 Entonces
			cuadrante <- "el eje de las X";
		SiNo Si angulo == 90 || angulo == 270 Entonces
				cuadrante <- "el eje de las Y";
			SiNo Si angulo > 0 && angulo < 90 Entonces
					cuadrante <- "el cuadrante: I";
				SiNo Si angulo > 90 && angulo < 180 Entonces
						cuadrante <- "el cuadrante: II";
					SiNo Si angulo > 180 || angulo < 270 Entonces
							cuadrante <- "el cuadrante: III";
						SiNo
							cuadrante <- "el cuadrante: IV";
						FinSi;	
					FinSi;
				FinSi;	
			FinSi;
		FinSi;
	FinSi;
	
	Escribir "La l�nea que se forma seg�n su �ngulo est� en ", cuadrante;
	Escribir "Hasta otra";
	
FinAlgoritmo
