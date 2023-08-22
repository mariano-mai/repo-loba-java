package com.mariano.app.service.menu;

import com.mariano.app.input.IngresoPorScanner;
import com.mariano.app.service.ejecucion.Ejecutar;


public class MenuDeOpciones {
	
	static int opcion;
	
	public static void darOpciones() {
		System.out.println("Eliga una Opción:");
		
		System.out.println("0- Salir\n"
				+ "1- Agregar un Jugador\n"
				+ "2- Ver Lista de Jugadores\n"
				+ "3- Empezar Juego\n"
				+ "4- Agregar/Quitar un Jugador en Medio de la Partida");
		
		opcion = IngresoPorScanner.entradaDeNumero();
		
		switch(opcion) {
		case 0:
			Ejecutar.terminarEjecucion();
			break;
		}
	}

}
