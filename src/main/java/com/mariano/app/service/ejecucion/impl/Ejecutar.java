package com.mariano.app.service.ejecucion.impl;

import com.mariano.app.service.ejecucion.EjecutarInterface;
import com.mariano.app.service.menu.MenuDeOpciones;

public class Ejecutar implements EjecutarInterface{
	
	public static EjecutarInterface ejecutar = new Ejecutar();
	
	@Override
	public void ejecutarPrograma() {
		System.out.println("\n==BIENVENIDO AL CONTADOR DE LOBA==\n");
		MenuDeOpciones.darOpciones();
	}
	
	@Override
	public void terminarEjecucion() {
		System.out.println("La partida ha terminado. Que tenga una buena velada.");
	}

}
