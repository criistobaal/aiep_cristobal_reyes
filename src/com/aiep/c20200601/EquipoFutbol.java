package com.aiep.c20200601;

public class EquipoFutbol {

	String sNombre;
	String sApellidos;
	int sEdad;
	

	public EquipoFutbol() {
		
	}
	public EquipoFutbol(String sNombre,String sApellidos,int sEdad) {
		
		this.sNombre = sNombre;
		this.sApellidos = sApellidos;
		this.sEdad = sEdad;
		
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	
	public String getsApellidos() {
		return sApellidos;
	}
	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}
	
	public int getsEdad() {
		return sEdad;
	}
	public void setsEdad(int sEdad) {
		this.sEdad = sEdad;
	}
	
}
