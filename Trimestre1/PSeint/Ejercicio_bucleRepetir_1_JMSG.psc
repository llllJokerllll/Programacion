//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio bucle repetir 1
Algoritmo loguearse
	
	//Aqu� vamos a pedir un c�digo de usuario y una contrase�a que deber�n coincidir con "1" y "1234".
	Definir logCliente, passCliente Como Caracter;
	Definir codigo, contrasena Como Caracter;
	
	codigo = "1";
	contrasena = "1234";
	
	Escribir "Hola";
	Repetir
		Escribir "Por favor, introduzca su c�digo de usuario";
		Leer logCliente;
		Escribir "Por favor, introduzca su contrase�a";
		Leer passCliente;
		Si logCliente <> codigo | passCliente <> contrasena Entonces
			Escribir "Error, por favor, introduzca los datos correctamente";
		FinSi;
	Hasta Que logCliente == codigo & passCliente == contrasena;
	
	Escribir "Bienvenido";
	
FinAlgoritmo
