package com.mariano.app.service.crear.impl;

import com.mariano.app.domain.Jugador;
import com.mariano.app.input.IngresoPorScanner;
import com.mariano.app.service.crear.AgregarJugadorInterface;

public class AgregarJugador implements AgregarJugadorInterface{
	
	static Jugador jugador;

	@Override
	public Jugador creaJugador() {
		jugador = new Jugador();
		System.out.println("Nombre del Jugador:");
		jugador.setNombre(IngresoPorScanner.entradaDeTexto());
		return jugador;
	}
	
	

}
