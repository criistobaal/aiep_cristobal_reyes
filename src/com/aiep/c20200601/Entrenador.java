package com.aiep.c20200601;

public class Entrenador extends EquipoFutbol {
    
	int a�os;
 
	int cant_copas;
	
	public Entrenador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entrenador(String sNombre, String sApellidos, int sEdad) {
		super(sNombre, sApellidos, sEdad);
		// TODO Auto-generated constructor stub
	}
	   public int getA�os() {
			return a�os;
		}
		public void setA�os(int a�os) {
			this.a�os = a�os;
		}
		public int getCant_copas() {
			return cant_copas;
		}
		public void setCant_copas(int cant_copas) {
			this.cant_copas = cant_copas;
		}	
	    
	    
	
	
	
}
