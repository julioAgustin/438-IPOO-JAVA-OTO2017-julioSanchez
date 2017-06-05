package com.caseSeven.ipoo.cajeroAutomatico.datos.storage;

public class Cajero {
	
		private int nroCajero;
		private String direccion;
		
		private Informe informe;
		
		public Cajero(){ 
			
		}

		public Cajero(int nroCajero, String direccion, Informe informe) {
			super();
			this.nroCajero = nroCajero;
			this.direccion = direccion;
			this.informe = informe;
		}

		public int getNroCajero() {
			return nroCajero;
		}

		public void setNroCajero(int nroCajero) {
			this.nroCajero = nroCajero;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public Informe getInforme() {
			return informe;
		}

		public void setInforme(Informe informe) {
			this.informe = informe;
		}
		
		

		


}
