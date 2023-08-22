package com.mariano.app.service.menu;

import com.mariano.app.input.IngresoPorScanner;
import com.mariano.app.service.ejecucion.impl.Ejecutar;
import com.mariano.app.service.indexado.impl.ListarObjetos;


public class MenuDeOpciones {
	
	static int opcion;
	
	public static void darOpciones() {
		System.out.println("Eliga una Opción:");
		
		System.out.println("0- Salir\n"
				+ "1- Agregar Jugadores\n"
				+ "2- Ver Lista de Jugadores\n"
				+ "3- Empezar Juego\n"
				+ "4- Agregar/Quitar un Jugador en Medio de la Partida");
		
		opcion = IngresoPorScanner.entradaDeNumero();
		
		switch(opcion) {
		case 0:
			Ejecutar.ejecutar.terminarEjecucion();
			break;
		case 1:
			ListarObjetos.listarObjetos.listarJugadores();
			VolverAlMenu.retornar();
			break;
		case 2:
			ListarObjetos.listarObjetos.mostrarJugadores();
		}
	}

}
