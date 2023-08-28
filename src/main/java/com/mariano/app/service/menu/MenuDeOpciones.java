package com.mariano.app.service.menu;

import com.mariano.app.input.IngresoPorScanner;
import com.mariano.app.service.busqueda.impl.Recorrer;
import com.mariano.app.service.ejecucion.impl.Ejecutar;
import com.mariano.app.service.eliminar.impl.Quitar;
import com.mariano.app.service.indexado.impl.ListarObjetos;
import com.mariano.app.service.menu.impl.Condicionales;


public class MenuDeOpciones {
	
	static int opcion;
	
	public static void darOpciones() {
		System.out.println("Eliga una Opción:");
		
		System.out.println("0- Salir\n"
				+ "1- Agregar Jugadores\n"
				+ "2- Quitar Jugador\n"
				+ "3- Ver Lista de Jugadores\n"
				+ "4- Empezar Partida\n"
				+ "5- Agregar/Quitar un Jugador en Medio de la Partida");
		
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
			Quitar.quitarJugador.quitarJugador(Recorrer.recorrer.existeJugador());
			VolverAlMenu.retornar();
			break;
		case 3:
			ListarObjetos.listarObjetos.mostrarJugadores();
			VolverAlMenu.retornar();
			break;
		case 4:
			Condicionales.condicionalesInt.empezarSiHayJugadores();
			VolverAlMenu.retornar();
		}
	}

}
