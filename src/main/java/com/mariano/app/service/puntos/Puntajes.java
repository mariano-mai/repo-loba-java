package com.mariano.app.service.puntos;

import java.util.ArrayList;
import java.util.List;

import com.mariano.app.input.IngresoPorScanner;

public class Puntajes {
	
	static List<Integer> valores;
	static List<Integer> puntos = new ArrayList<>();
	static int suma = 0;
	
	public static List<Integer> agregaPuntos(){
		valores = new ArrayList<>();
		int punto = IngresoPorScanner.entradaDeNumero();
		valores.add(punto);
		return valores;
	}
	
	public static List<Integer> listarPuntos(){
		puntos.addAll(valores);
		return puntos;
	}
	
	public static int sumarPuntos() {
		for(int i: puntos) {
			suma = suma + i;
		}
		return suma;
	}

}
