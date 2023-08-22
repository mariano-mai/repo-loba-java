package com.mariano.app.service.crear;

import com.mariano.app.domain.Jugador;
import com.mariano.app.input.IngresoPorScanner;

public class AgregarJugador {
	
	static Jugador jugador;
	
	public static Jugador creaJugador() {
		System.out.println("Nombre del Jugador:");
		jugador.setNombre(IngresoPorScanner.entradaDeTexto());
		return jugador;
	}

}
