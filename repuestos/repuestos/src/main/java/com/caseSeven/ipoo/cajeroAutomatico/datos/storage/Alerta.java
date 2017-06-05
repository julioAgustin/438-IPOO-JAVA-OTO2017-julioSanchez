package com.caseSeven.ipoo.cajeroAutomatico.datos.storage;

public class Alerta {

		private int nro;
		private int fechaHora;
		private String motivo;
		public Alerta(int nro, int fechaHora, String motivo) {
			super();
			this.nro = nro;
			this.fechaHora = fechaHora;
			this.motivo = motivo;
		}
		public Alerta(){
			
		}
		public int getNro() {
			return nro;
		}
		public void setNro(int nro) {
			this.nro = nro;
		}
		public int getFechaHora() {
			return fechaHora;
		}
		public void setFechaHora(int fechaHora) {
			this.fechaHora = fechaHora;
		}
		public String getMotivo() {
			return motivo;
		}
		public void setMotivo(String motivo) {
			this.motivo = motivo;
		}
		
}
