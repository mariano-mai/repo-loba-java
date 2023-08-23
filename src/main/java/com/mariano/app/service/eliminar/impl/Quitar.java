package com.mariano.app.service.eliminar.impl;

import com.mariano.app.service.eliminar.QuitarInterface;
import com.mariano.app.service.indexado.impl.ListarObjetos;

public class Quitar implements QuitarInterface{
	
	public static QuitarInterface quitarJugador = new Quitar();
	
	@Override
	public void quitarJugador(int indice) {
		ListarObjetos.listaDeJugadores.remove(indice);
		System.out.println("El Jugador fue removido con éxito.");
	}

}
