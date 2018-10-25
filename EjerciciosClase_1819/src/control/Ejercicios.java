package control;

import java.time.LocalDate;
import java.util.Random;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import modelo.Persona;

public class Ejercicios {

	// --------------- 04/10/2018 ACTIVIDAD: BUSCAR EN LA API
	// -------------------------------

	public void pruebasAPI() {
		/*
		 * 1. imprime por consola el valor de 2^3 - Usa la clase estática Math y su
		 * método pow (Cuando es estático no hace falta el new)
		 * 
		 * 2. Imprime un valor aleatorio entre 1 y 100 - Usa la clase java.util.Random y
		 * el método rnd 3. En la cadena "LAS PALMAS DE GRAN CANARIA", imprime "GRAN"
		 * -Usa el método substring de la clase java.lang.String
		 */

		// 1.
		System.out.println("1. " + Math.pow(2, 3));

		// 2.
		Random rnd = new Random();
		System.out.println("2. " + rnd.nextInt(100));

		// 3.
		System.out.println("3. " + "LAS PALMAS DE GRAN CANARIA".substring(14, 18));
	}

	// ACTIVIDAD: Mostrar por consola los números comprendidos entre dos
	// enteros, a y b

	// 1Parte método:. prototipo o cabecera
	public void listaIntervaloEnteros(int primero, int ultimo) {
		// 2Parte método: cuerpo o implementación del método
		/*
		 * int i=primero; while(i < ultimo) System.out.println(++i); i++; i=i+1;
		 */
		for (int j = primero; j <= ultimo; j++)
			System.out.println(j++);

		// true /false
		boolean condicion = true;
		if (condicion) {
			// en caso de verdadero
		} else {
			// la otra opción, falso
		}

	}

	// ---------------------- ACTIVIDAD
	// ----------------------------------------------------- 10/10/2018
	/*
	 * Dado una “cadena” (String) devolver el valor en forma de número entero
	 * correspondiente. Ejempo String: “ab95f1”
	 */

	// String cadena ="ab95f1";
	/*
	 * public static int converString(String cadena) { int numeros =
	 * Integer.parseInt(cadena); return numeros; }
	 */

	// ---------------------- ACTIVIDAD : Serie Fibonacci
	// --------------------------------------- 11/10/2018

	public static void serieFibonacci(int cuantos) {
		int num1 = 0;
		int num2 = 1;
		int total = 1;

		System.out.print(num1 + " ," + num2);
		for (int i = 1; i < cuantos; i++) {
			total = num1 + num2;
			System.out.print(" ," + total);
			num1 = num2;
			num2 = total;
		}
	}

	// ---------------------- ACTIVIDAD : Factorial (1.-Deberes
	// Casa)-------------------------------- 11/10/2018

	public static void factorial(int numFact) {
		int num1 = 1;
		if (numFact == 0 | numFact == 1) {
			System.out.println("El factorial de " + "'" + numFact + "'" + " es :  1");
		} else {
			for (int i = 2; i <= numFact; i++) {
				num1 = num1 * i;
			}
			System.out.println("El factorial de " + "'" + numFact + "'" + " es :" + num1);
		}
	}

	// ---------------------- ACTIVIDAD : Devolver el número menor de tres
	// (2.-Deberes Casa)----------- 11/10/2018

	public int calNumMenor(int x, int y, int z) {
		if (x < y)
			if (x < z)
				return x;
			else
				return z;
		else if (y < z)
			return y;
		else
			return z;

	}

	public static int calNumMenor(int x, int y, int z, int w) {
		if (x < y)
			if (x < z)
				if (x < w)
					return x;
				else
					return w;

			else if (z < w)
				return z;
			else
				return w;

		else if (y < z)
			if (y < w)
				return y;

			else if (z < w)
				return z;
		return w;

	}

	// ------------------------17-10-2018
	// Imprime por consola los n números enteros aleatorios
	// entre q y 100.

	public void imprimeAleatorios(int n) { // n, Cuantos números
		int numero = 0;
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			numero = 1 + rnd.nextInt(6); // Números aleatorios del 1 al 6
			System.out.println(i + ".-" + numero);
		}
	}

	public void imprimeAleatorios(int n, int inferior, int superior) { // n, Cuantos números
		int numero = 0;
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			numero = 1 + rnd.nextInt(6); // Números aleatorios del 1 al 6
			System.out.println(i + 1 + ".-" + numero);
		}
	}

	// Devolver un array con números aleatorios entre "inferior y superior"

	public int[] generaListaAleatorios(int n, int inferior, int superior) {

		int[] resultado; // DECLARACION EN LA TABLA DE SIMBOLOS
		resultado = new int[n]; // INICIALIAZACION
		Random rnd = new Random();
		int numero = 0;
		for (int i = 0; i < n; i++)

			resultado[i] = inferior + rnd.nextInt(superior - inferior + 1); // Números entre inferior y superior.

		return resultado;

	}

	// Devuelve un array de números enteros aleatorios, basandome en el método
	// anterior
	/*
	 * public int[] generaListaAleatorios2(int n, int inferior, int superior) {
	 * 
	 * int[] resultado; resultado = new int[n]; Random rnd = new Random(); for (int
	 * i = 0; i < resultado.length; i++) {
	 * 
	 * resultado[i] = inferior + rnd.nextInt(superior - inferior + 1); // Números
	 * entre inferior y superior } return resultado;
	 * 
	 * }
	 */
	public int[] generaEstadisticaAparicion(int n, int inferior, int superior) {
		int[] resultado = new int[superior - inferior + 1];
		Random rnd = new Random();
		int numero = 0;
		for (int i = 0; i < n; i++) {

			numero = inferior + rnd.nextInt(superior - inferior + 1); // Números entre inferior y superior.
			resultado[numero - 1]++;
			System.out.println(
					+i + ".- Ejer1. El número " + numero + " lleva " + resultado[numero - 1] + " repeticiones");

		}
		return resultado;
	}

	public int[] generaEstadisticaAparicion1(int n, int inferior, int superior) {
		int[] resultado = new int[superior - inferior + 1];
		int[] numero = this.generaListaAleatorios(n, inferior, superior);
		for (int i = 0; i < n; i++) {

			resultado[numero[i] - 1]++;
			System.out.println(
					i + ".- Ejer2. El número " + numero[i] + ": lleva " + resultado[numero[i] - 1] + " apariciones");
		}

		return resultado;
	}

	// ------------------------24-10-2018--
	// 1.- Crear el prototipo, 2.- Crear nombreMetodo, 3.- Implementación, 4.-
	// Ejecucion
	public Persona[] ListaPersonas(int n) {
		Persona[] lista = new Persona[n];
		for (int i = 0; i < n; i++)
			lista[i] = new Persona();

		return lista;
	}
	// Crea un método que devuelva el saldo de una cuenta, partiendo de una lista de
	// movimientos y del saldo inicial.

	public float calculaSaldo(float[] movimientos, float SaldoInicial) {

		float saldoFinal = SaldoInicial;
		for (int i = 0; i < movimientos.length; i++)

			saldoFinal += movimientos[i];

		// System.out.println((i+".- "+saldoFinal+"+"+movimientos[i]+"= "+(saldoFinal +=
		// movimientos[i]))+", ");

		return saldoFinal;
	}

	// ------------------------25-10-2018--
	// --------------------Prueba cadenas--

	public void pruebaCadena() {
		String nombre = "Las Palmas de Gran Canaria";// declaramos el objeto tipo String
		// iterar en la cadena mostrando todos sus caracteres
		for (int i = 0; i < nombre.length(); i++) {
			System.out.print(nombre.charAt(i));
		}
	}

	// ------ El mismo ejercicio pasando parametros

	public String pruebaCadena(String cadena) {
		String nombre = cadena;
		for (int i = 0; i < nombre.length(); i++) {
			nombre.charAt(i);
		}
		return nombre;
	}

	// -------------------compara cadenas--
	public void compararCadenas() {
		String cad1 = "abcd";
		String cad2 = "abcddddddd";
		// System.out.println(cad1.compareTo(cad2));
		System.out.println("No coinciden " + (cad2.compareToIgnoreCase(cad1)) + " caracteres");

	}
	// ------ El mismo ejercicio pasando parametros

	public int compararCadenas(String cad1, String cad2) {

		return cad2.compareToIgnoreCase(cad1);
	}

	// ***************************** main **********************
	public static void main(String[] args) {
		Ejercicios ejercicios = new Ejercicios();

		// ------25-10-2018
		System.out.println("No coincidencias: "+(ejercicios.compararCadenas("abcd", "abcdddddddd")));
		ejercicios.compararCadenas();
		
		System.out.println(ejercicios.pruebaCadena("Las Palmas de Gran Canariasssss"));
		ejercicios.pruebaCadena();
		
		

		// ------24-10-2018
		float[] movimientos = { 85.5f, 60.4f, -25.8f, -70.6f, 52.20f };
		float saldo = 200f;
		// System.out.println("El saldo final es: "+ejercicios.calculaSaldo(movimientos,
		// saldo));

		// Persona[] lista = ejercicios.ListaPersonas(3);
		// int[] listaAleatorios= ejercicios.generaListaAleatorios(20, 1, 5000);
		// int[] listaAleatorios1= ejercicios.generaEstadisticaAparicion1(6, 1, 6);

		// ejercicios.generaListaAleatorios(16, 1, 6);
		// ejercicios.imprimeAleatorios(6, 1, 6);
		// int[] estadisticaDado= ejercicios.generaEstadisticaAparicion(10, 1, 6);

		// ejercicios.imprimeAleatorios(500); // Cincuenta números.

		// int a = 1, b = 10, c = 4, d = 12;
		// int menor = Ejercicios.calNumMenor(a, b, c, d);
		// int menor = ejercicios.calNumMenor(a, b, c, d);
		// System.out.println("el menor es : " + ejercicios.calNumMenor(a, b, c));
		// System.out.println("el menor es : " + ejercicios.calNumMenor(x, y, z, w));

		// factorial(5);

		// serieFibonacci(8);

		// Act: 10/10/2018
		// System.out.println(converString("8fgf"));

		/*
		 * Ejercicios ejercicios = new Ejercicios(); int x=10; int y= 30;
		 * ejercicios.listaIntervaloEnteros(x, y);
		 */

		// Ejercicios.pruebasAPI();
		// new Ejercicios().pruebasAPI();

		// Persona juan = new Persona();
		// int pasos = juan.caminar(20);

		// Persona juan;
		// juan = new Persona("4545455X", "Juan Luis", 47,null);
		// Persona persona1 = new Persona();
		System.out.println();
		System.out.println("Fin del programa");
	}
}
