package com.mariano.app.service.indexado.impl;

import java.util.ArrayList;
import java.util.List;

import com.mariano.app.domain.Jugador;
import com.mariano.app.input.IngresoPorScanner;
import com.mariano.app.service.busqueda.impl.Recorrer;
import com.mariano.app.service.indexado.ListarValoresInterface;

public class ListarValores implements ListarValoresInterface{
	
	ListarValoresInterface listarValores = new ListarValores();
	
	public static List<Integer> listaDePuntos;
	public static List<Integer> listaAuxiliar;
	static int punto, indice;

	@Override
	public void agregarPuntos() {
		indice = Recorrer.recorrer.existeJugador();
		ListarObjetos.listaDeJugadores.get(indice).setPuntos(listadoAuxiliar(indice));
	}

	@Override
	public void mostrarPuntosDeJugador() {
		indice = Recorrer.recorrer.existeJugador();
		System.out.println(ListarObjetos.listaDeJugadores.get(indice).getPuntos().toArray());
		
	}
	
	private List<Integer> listarPuntosDeJugador() {
		listaDePuntos = new ArrayList<>();
		System.out.println("Ingrese punto: ");
		punto = IngresoPorScanner.entradaDeNumero();
		listaDePuntos.add(punto);
		return listaDePuntos;
	}
	
	private List<Integer> listadoAuxiliar(int indice){
		Jugador jugador = ListarObjetos.listaDeJugadores.get(indice);
		listaAuxiliar = new ArrayList<>();
		listaAuxiliar.addAll(jugador.getPuntos());
		listaAuxiliar.addAll(listarPuntosDeJugador());
		return listaAuxiliar;
		
	}

}
