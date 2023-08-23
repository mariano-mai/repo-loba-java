package com.mariano.app.service.busqueda.impl;

import com.mariano.app.domain.Jugador;
import com.mariano.app.input.IngresoPorScanner;
import com.mariano.app.service.busqueda.RecorrerInterface;
import com.mariano.app.service.indexado.impl.ListarObjetos;

public class Recorrer implements RecorrerInterface{
	
	public static RecorrerInterface recorrer = new Recorrer();
	static String nombre;
	static int indice;

	@Override
	public int existeJugador() {
		System.out.println("Ingrese el nombre del Jugador: ");
		nombre = IngresoPorScanner.entradaDeTexto();
		for(Jugador jugador: ListarObjetos.listaDeJugadores) {
			if(jugador.getNombre().equalsIgnoreCase(nombre)) {
				indice = ListarObjetos.listaDeJugadores.indexOf(jugador);
			}
		}
		return indice;
	}

}
