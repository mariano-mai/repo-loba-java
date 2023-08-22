package com.mariano.app.service.puntos.impl;

import java.util.ArrayList;
import java.util.List;

import com.mariano.app.input.IngresoPorScanner;
import com.mariano.app.service.puntos.PuntajesInterface;

public class Puntajes implements PuntajesInterface{
	
	public static PuntajesInterface puntajes = new Puntajes();
	
	static List<Integer> valores;
	static List<Integer> puntos = new ArrayList<>();
	static int suma = 0;
	
	@Override
	public List<Integer> agregaPuntos(){
		valores = new ArrayList<>();
		int punto = IngresoPorScanner.entradaDeNumero();
		valores.add(punto);
		return valores;
	}
	
	@Override
	public List<Integer> listarPuntos(){
		puntos.addAll(valores);
		return puntos;
	}
	
	@Override
	public int sumarPuntos() {
		for(int i: puntos) {
			suma = suma + i;
		}
		return suma;
	}

}
