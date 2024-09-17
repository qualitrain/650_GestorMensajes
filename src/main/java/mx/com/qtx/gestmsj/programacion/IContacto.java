package mx.com.qtx.gestmsj.programacion;

import java.util.List;

public interface IContacto {
	public void setNombreContacto(String nombre);
	public void setCorreoContacto(String correo);
	public void setTelefonoContacto(String telefono);
	public String getNombreContacto();
	public String getTelefonoContacto();
	public String getCorreoContacto();
	//Hola, aquí le agrego algo extra a esta linda interfaz
	public String setDireccionContacto();
	public String getDireccionContacto();
}
