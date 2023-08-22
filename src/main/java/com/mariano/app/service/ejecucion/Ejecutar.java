package com.mariano.app.service.ejecucion;

import com.mariano.app.service.menu.MenuDeOpciones;

public class Ejecutar {
	
	public static void ejecutarPrograma() {
		System.out.println("\n==BIENVENIDO AL CONTADOR DE LOBA==\n");
		MenuDeOpciones.darOpciones();
	}
	
	public static void terminarEjecucion() {
		System.out.println("La partida ha terminado. Que tenga una buena velada.");
	}

}
