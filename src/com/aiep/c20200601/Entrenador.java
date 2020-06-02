package com.aiep.c20200601;

public class Entrenador extends EquipoFutbol {
    
	int años;
 
	int cant_copas;
	
	public Entrenador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entrenador(String sNombre, String sApellidos, int sEdad) {
		super(sNombre, sApellidos, sEdad);
		// TODO Auto-generated constructor stub
	}
	   public int getAños() {
			return años;
		}
		public void setAños(int años) {
			this.años = años;
		}
		public int getCant_copas() {
			return cant_copas;
		}
		public void setCant_copas(int cant_copas) {
			this.cant_copas = cant_copas;
		}	
	    
	    
	
	
	
}
