package mx.com.qtx.gestmsj.contactos;

public class Contacto {
	private int idContacto;
	private String nombreContacto;
	private String correoElectronico;
	private String telMovil;
	
	public Contacto(int idContacto, String nombreContacto, String correoElectronico, String telMovil) {
		super();
		this.idContacto = idContacto;
		this.nombreContacto = nombreContacto;
		this.correoElectronico = correoElectronico;
		this.telMovil = telMovil;
	}
	public int getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
	public String getNombreContacto() {
		return nombreContacto;
	}
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getTelMovil() {
		return telMovil;
	}
	public void setTelMovil(String telMovil) {
		this.telMovil = telMovil;
	}

}
