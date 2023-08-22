package com.mariano.app.domain;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	
	String nombre;
	int total=0;
	List<Integer> puntos=new ArrayList<>();
	
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jugador(String nombre, int total, List<Integer> puntos) {
		super();
		this.nombre = nombre;
		this.total = total;
		this.puntos = puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Integer> getPuntos() {
		return puntos;
	}

	public void setPuntos(List<Integer> puntos) {
		this.puntos = puntos;
	}
	
}
