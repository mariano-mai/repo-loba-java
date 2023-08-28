package com.mariano.app.service.menu.impl;

import com.mariano.app.service.indexado.impl.ListarObjetos;
import com.mariano.app.service.menu.CondicionalesInterface;

public class Condicionales implements CondicionalesInterface{
	
	public static CondicionalesInterface condicionalesInt = new Condicionales();

	@Override
	public void empezarSiHayJugadores() {
		if(ListarObjetos.listaDeJugadores.isEmpty()) {
			System.out.println("\nAntes de Empezar debe Agregar Jugadores.\n");
		}else {
			System.out.println("Ahora empieza lo bueno.");
		}
	}
	
	

}
