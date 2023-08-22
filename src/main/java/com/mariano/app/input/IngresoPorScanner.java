package com.mariano.app.input;

import java.util.Scanner;

public class IngresoPorScanner {
	static Scanner entrada;
	
	public static String entradaDeTexto() {
		entrada = new Scanner(System.in);
		String texto = entrada.nextLine();
		return texto;
	}
	
	public static int entradaDeNumero() {
		entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		return numero;
	}

}
