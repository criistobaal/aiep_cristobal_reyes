package com.aiep.c20200601;

public class Futbolista extends EquipoFutbol{
	int dorsal;
	String posicion;   

	public Futbolista() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Futbolista(String sNombre, String sApellidos, int sEdad) {
		super(sNombre, sApellidos, sEdad);
		// TODO Auto-generated constructor stub
	}


	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
		

		
}
