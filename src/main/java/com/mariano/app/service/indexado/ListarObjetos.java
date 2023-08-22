package com.mariano.app.service.indexado;

import java.util.ArrayList;
import java.util.List;

import com.mariano.app.domain.Jugador;
import com.mariano.app.service.crear.AgregarJugador;
import com.mariano.app.service.menu.VolverAlMenu;

public class ListarObjetos {
	
	static List<Jugador> listaDeJugadores = new ArrayList<>();
	
	public static List<Jugador> listarJugadores(){
		listaDeJugadores.add(AgregarJugador.creaJugador());
		return listaDeJugadores;
	}
	
	public static void mostrarJugadores() {
		System.out.println("Jugadores Actuales:");
		for(int i=0; i<listaDeJugadores.size(); i++) {
			System.out.println("\t"+listaDeJugadores.get(i).getNombre());
		}
		VolverAlMenu.retornar();
	}

}
