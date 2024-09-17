package mx.com.qtx.gestmsj.entidades;

import java.util.Date;
import java.util.List;

public class Programacion {
	
	private int idProgramacion;
	private Date fechaEnvio;
	private String medioEnvio;
	private List<String> lstContactos;
	private String mensajeEnvio;
	private String estatusEnvio;

	public Programacion(int idProgramacion, Date fechaEnvio, String medioEnvio, List<String> lstContactos,
			String mensajeEnvio, String estatusEnvio) {
		super();
		this.idProgramacion = idProgramacion;
		this.fechaEnvio = fechaEnvio;
		this.medioEnvio = medioEnvio;
		this.lstContactos = lstContactos;
		this.mensajeEnvio = mensajeEnvio;
		this.estatusEnvio = estatusEnvio;
	}
	
	public int getIdProgramacion() {
		return idProgramacion;
	}
	public void setIdProgramacion(int idProgramacion) {
		this.idProgramacion = idProgramacion;
	}
	public Date getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	public String getMedioEnvio() {
		return medioEnvio;
	}
	public void setMedioEnvio(String medioEnvio) {
		this.medioEnvio = medioEnvio;
	}
	public List<String> getLstContactos() {
		return lstContactos;
	}
	public void setLstContactos(List<String> lstContactos) {
		this.lstContactos = lstContactos;
	}
	public String getMensajeEnvio() {
		return mensajeEnvio;
	}
	public void setMensajeEnvio(String mensajeEnvio) {
		this.mensajeEnvio = mensajeEnvio;
	}
	public String getEstatusEnvio() {
		return estatusEnvio;
	}
	public void setEstatusEnvio(String estatusEnvio) {
		this.estatusEnvio = estatusEnvio;
	}

	@Override
	public String toString() {
		return "Programacion [idProgramacion=" + idProgramacion + ", fechaEnvio=" + fechaEnvio + ", medioEnvio="
				+ medioEnvio + ", lstContactos=" + lstContactos + ", mensajeEnvio=" + mensajeEnvio + ", estatusEnvio="
				+ estatusEnvio + "]";
	}
	

	
}
