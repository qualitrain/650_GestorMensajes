package mx.com.qtx.gestmsj.entidades;

public class Mensaje {
	
	private int idMensaje;
	private String encabezado;
	private String cuerpoMensaje;
	private String observaciones;
	
	
	public Mensaje(int idMensaje, String encabezado, String cuerpoMensaje, String observaciones) {
		super();
		this.idMensaje = idMensaje;
		this.encabezado = encabezado;
		this.cuerpoMensaje = cuerpoMensaje;
		this.observaciones=observaciones;
	}
	public int getIdMensaje() {
		return idMensaje;
	}
	public void setIdMensaje(int idMensaje) {
		this.idMensaje = idMensaje;
	}
	public String getEncabezado() {
		return encabezado;
	}
	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}
	public String getCuerpoMensaje() {
		return cuerpoMensaje;
	}
	public void setCuerpoMensaje(String cuerpoMensaje) {
		this.cuerpoMensaje = cuerpoMensaje;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	@Override
	public String toString() {
		return "Mensaje [idMensaje=" + idMensaje + ", encabezado=" + encabezado + ", cuerpoMensaje=" + cuerpoMensaje
				+ "]";
	}

}
