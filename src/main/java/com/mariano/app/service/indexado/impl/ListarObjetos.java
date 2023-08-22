package com.mariano.app.service.indexado.impl;

import java.util.ArrayList;
import java.util.List;

import com.mariano.app.domain.Jugador;
import com.mariano.app.input.IngresoPorScanner;
import com.mariano.app.service.crear.AgregarJugadorInterface;
import com.mariano.app.service.crear.impl.AgregarJugador;
import com.mariano.app.service.indexado.ListarObjetosInterface;
import com.mariano.app.service.menu.VolverAlMenu;

public class ListarObjetos implements ListarObjetosInterface{
	
	public static ListarObjetosInterface listarObjetos = new ListarObjetos();
	
	static List<Jugador> listaDeJugadores = new ArrayList<>();
	static AgregarJugadorInterface agregaJugador = new AgregarJugador();
	static int cantidad;
	
	@Override
	public List<Jugador> listarJugadores(){
		System.out.println("Ingrese la cantidad de jugadores: ");
		cantidad = IngresoPorScanner.entradaDeNumero();
		for(int i=0; i<cantidad; i++) {
			listaDeJugadores.add(agregaJugador.creaJugador());
		}
		return listaDeJugadores;
	}
	
	@Override
	public void mostrarJugadores() {
		System.out.println("Jugadores Actuales:");
		for(int i=0; i<listaDeJugadores.size(); i++) {
			System.out.println("\t"+listaDeJugadores.get(i).getNombre());
		}
		VolverAlMenu.retornar();
	}

}
