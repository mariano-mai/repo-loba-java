package com.mariano.app.service.implement;

import com.mariano.app.service.indexado.ListarObjetos;
import com.mariano.app.service.menu.MenuDeOpciones;

public class Implementaciones {
	
	public static void agregaJugador() {
		ListarObjetos.listarJugadores();
		MenuDeOpciones.darOpciones();
	}

}
