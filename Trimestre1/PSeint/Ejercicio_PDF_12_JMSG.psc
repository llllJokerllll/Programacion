//Autor: Jose Manuel Sabarís
//Título: Ejercicio 12
Algoritmo fechaResta
	
	//Aqui vamos a pedir la hora actual y determinar cuanto tiempo falta para media noche.
	Definir hora, min, seg Como Entero;
	Definir limHora, limMin, limSeg Como Entero;
	Definir resHora, resMin, resSeg Como Entero;
	
	Escribir "Hola";
	Escribir "Tiene que introducir la hora actual";
	Escribir "Por favor, introduzca la hora";
	Leer hora;
	Escribir "Por favor, introduzca los minutos";
	Leer min;
	Escribir "Por favor, introduzca los segundos";
	Leer seg;
	
	limHora = 23;
	limMin = 59;
	
	Si hora >= 24 | min >= 60 | seg >= 60 Entonces
		Escribir "Error en los datos introducidos";
	SiNo
		resHora = limHora - hora;
		resMin = limMin - min;
		
		Si seg > 0 Entonces
			resSeg = 60 - seg;
			Si resMin == 0 Entonces
				resMin = 59;
				resHora = resHora - 1;
			SiNo
				resMin = resMin - 1;
			FinSi;
		FinSi;
		
		Escribir "Le faltan: ", resHora, ":", resMin, ":", resSeg, " para las 23:59:00";
		Escribir "Hasta otra";
	FinSi;
	
FinAlgoritmo
