//Autor: Jose Manuel Sabarís
//Título: Xogo tirada de dados
Proceso xogoDados
	
	//Aquí vamos a realizar un juego sobre la tirada de dados.
	//Definición de variables
	Definir tiradas, dado, contador Como Entero;
	
	//Inicialización de variables
	
	//Entrada de datos
	Escribir "Hola";
	Escribir Sin Saltar "Por favor, introduzca la cantidad de tiradas a calcular: ";
	Leer tiradas;
	Escribir "Tiradas:";
	
	//Comprobación y Proceso y Salida Resultado
	Para contador <- 1 Hasta tiradas Con Paso 1 Hacer
		dado <- Azar(6) + 1;
		Escribir Sin Saltar dado, ", ";
	FinPara
	
	Escribir "Hasta otra";
	
FinProceso
