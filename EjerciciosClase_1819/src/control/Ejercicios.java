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
	// entre 1 y 100.

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
			numero = 1 + rnd.nextInt(superior - inferior + 1); // Números aleatorios del 1 al 6
			System.out.println(i + 1 + ".-" + numero);
		}
	}

	// Devuelve un array de números enteros aleatorios, basandonos en el método
		// anterior

	public int[] generaListaAleatorios(int n, int inferior, int superior) {

		int[] resultado; // DECLARACION EN LA TABLA DE SIMBOLOS
		resultado = new int[n]; // INICIALIAZACION
		Random rnd = new Random();
		int numero = 0;
		for (int i = 0; i < n; i++) //for (int i = 0; i < resultado.length; i++)

			System.out.println(resultado[i] = inferior + rnd.nextInt(superior - inferior + 1)); // Números entre inferior y superior.

		return resultado;

	}
	
	public int sumaAleatorios(int n, int inferior, int superior) {
		int resultado = 0;
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			
			resultado += inferior+rnd.nextInt(superior-inferior+1);
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

	// 2.- ------ El mismo ejercicio pasando parametros
	public String pruebaCadena(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			cadena.charAt(i);
		}
		return cadena;
	}

	// -------------------compara cadenas--
	public void compararCadenas() {
		String cad1 = "abcd";
		String cad2 = "abcddddddd";
		// System.out.println(cad1.compareTo(cad2));
		System.out.println("No coinciden " + (cad2.compareToIgnoreCase(cad1)) + " caracteres");

	}

	// 2.- ------ El mismo ejercicio pasando parametros
	public int compararCadenas(String cad1, String cad2) {
		return cad2.compareToIgnoreCase(cad1);
	}

	// ------ Prueba
	public String[] listaDiasSemana(String[] dias) {

		// String[] diasSemana = {"Lunes",
		// "Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		for (int i = 0; i < dias.length; i++) {
			System.out.print(dias[i] + ", ");

		}

		return dias;
	}

	// ---------------------- 31/10/2018
	public float[] resumenVendedor(float[][] ventas) {

		float[] resultado = new float[ventas.length];
		// iterar por filas/columnas acumulando ventas de cada vendedor

		for (int i = 0; i < ventas.length; i++) {

			for (int j = 0; j < ventas[i].length; j++)

				resultado[i] += ventas[i][j];

			//System.out.println("El total de ventas del vendedor " + (i + 1) + " es: " + resultado[i]);

		}
		return resultado;
	}

	public float[] resumenVentasPorMes(float[][] ventas) {

		// String[] meses = new String[ventas.length];
		String[] vendedores = new String[3]; // puede sobrar esta variable si utilizo el parametro ventas
		float[] resultado = new float[ventas.length];
		float acumuladoMes = 0.0f;

		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiempre",
				"octubre", "noviembre", "diciembre" };
		// iterar por columnas/filas acumulando ventas de cada vendedor

		for (int k = 0; k < meses.length; k++) { // recorrer los meses del año e imprimir
		}
		
		for (int i = 0; i < ventas[0].length; i++) {
			System.out.println("Acumulado en el mes de " + meses[i]);// venta total por mes
			acumuladoMes = 0.0f;
			for (int j = 0; j < ventas.length; j++) {
				acumuladoMes += ventas[j][i];
				resultado[0] += ventas[j][i];
			}
			System.out.println(acumuladoMes + "€");
		}

		return resultado;
	}
	
	/*String x="6x9";
	int numero = Integer.parseInt(x);*/
		
	public int[] convierteCadenas(String[] cadenas) { 
		// El array de salida tiene el MISMO numero de elementos que el de entrada si un numero no es valido, se pone -1.
		int[] numero = new int[cadenas.length];
		for (int i = 0; i < cadenas.length; i++)
			try {
			numero[i] = Integer.parseInt(cadenas[i]);
			System.out.println("Llega aqui");
		} catch (NumberFormatException ex) {
			// Numero no valido
			numero[i] = -1;
		
		}
				
		
		return numero;
	}
	

	
}
