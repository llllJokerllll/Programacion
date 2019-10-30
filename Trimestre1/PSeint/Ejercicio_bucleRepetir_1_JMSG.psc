//Autor: Jose Manuel Sabarís
//Título: Ejercicio bucle repetir 1
Algoritmo loguearse
	
	//Aquí vamos a pedir un código de usuario y una contraseña que deberán coincidir con "1" y "1234".
	Definir logCliente, passCliente Como Caracter;
	Definir codigo, contrasena Como Caracter;
	
	codigo = "1";
	contrasena = "1234";
	
	Escribir "Hola";
	Repetir
		Escribir "Por favor, introduzca su código de usuario";
		Leer logCliente;
		Escribir "Por favor, introduzca su contraseña";
		Leer passCliente;
		Si logCliente <> codigo | passCliente <> contrasena Entonces
			Escribir "Error, por favor, introduzca los datos correctamente";
		FinSi;
	Hasta Que logCliente == codigo & passCliente == contrasena;
	
	Escribir "Bienvenido";
	
FinAlgoritmo
