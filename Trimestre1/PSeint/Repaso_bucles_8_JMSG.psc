//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 8
Proceso nacimientos
	
	//Aquí nos van a ingresar los datos de nacimientos Niño o Niña con "F" o "M", día y mes. Finaliza al dejar sexo en blanco.
	Definir dia, mes Como Entero;
	Definir sexo Como Caracter;
	Definir numVarones, numMujeres, nacidosPrimerSemestre, nacidosSegundoSemestre Como Entero;
	
	numVarones <- 0;
	numMujeres <- 0;
	nacidosPrimerSemestre <- 0;
	nacidosSegundoSemestre <- 0;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca el sexo. F/M";
	Leer sexo;
	
	Mientras sexo <> "" Hacer
		
		Escribir "Por favor, introduzca el día de nacimiento";
		Leer dia;
		Escribir "Por favor, introduzca el mes de nacimiento";
		Leer mes;
		
		Si sexo == "F" || sexo == "f" Entonces
			numMujeres <- numMujeres + 1;
		SiNo Si sexo == "M" || sexo == "m" Entonces
				numVarones <- numVarones + 1;
			SiNo
				Escribir "Caracter introducido no válido";
			FinSi
		FinSi
		
		Si mes == 1 || mes == 2 || mes == 3 || mes == 4 || mes == 5 || mes == 6 Entonces
			nacidosPrimerSemestre <- nacidosPrimerSemestre + 1;
		SiNo Si mes == 7 || mes == 8 || mes == 9 || mes == 10 || mes == 11 || mes == 12 Entonces
				nacidosSegundoSemestre <- nacidosSegundoSemestre + 1;
			SiNo
				Escribir "Mes introducido incorrecto";
			FinSi	
		FinSi
		
		Escribir "Por favor introduzca el sexo. F/M";
		Leer sexo;
		
	FinMientras
	
	Escribir "La cantidad de Varones registrada es: ", numVarones, " y la cantidad de Mujeres registrada es: ", numMujeres;
	Escribir "La cantidad de nacimientos en el primer semestre es: ", nacidosPrimerSemestre, " y en el segundo semestre es: ", nacidosSegundoSemestre;
 	Escribir "Hasta otra";
	
FinProceso
