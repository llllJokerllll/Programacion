//Autor: Jose Manuel Sabar�s
//T�tulo: Xogo tirada de dados
Proceso xogoDados
	
	//Aqu� vamos a realizar un juego sobre la tirada de dados.
	//Definici�n de variables
	Definir tiradas, dado, contador Como Entero;
	
	//Inicializaci�n de variables
	
	//Entrada de datos
	Escribir "Hola";
	Escribir Sin Saltar "Por favor, introduzca la cantidad de tiradas a calcular: ";
	Leer tiradas;
	Escribir "Tiradas:";
	
	//Comprobaci�n y Proceso y Salida Resultado
	Para contador <- 1 Hasta tiradas Con Paso 1 Hacer
		dado <- Azar(6) + 1;
		Escribir Sin Saltar dado, ", ";
	FinPara
	
	Escribir "Hasta otra";
	
FinProceso
