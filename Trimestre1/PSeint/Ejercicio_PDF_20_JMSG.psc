//Autor: Jose Manuel Sabarís
//Título: Ejercicio 20
Algoritmo anguloCuadrante
	
	//Aquí vamos a descubrir en que cuadrante o eje está una línea según su ángulo respecto al eje positivo X.
	Definir angulo Como Entero;
	Definir cuadrante Como Caracter;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca el ángulo que forma la línea respecto al eje postivo X";
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
	
	Escribir "La línea que se forma según su ángulo está en ", cuadrante;
	Escribir "Hasta otra";
	
FinAlgoritmo
