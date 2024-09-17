package mx.com.qtx.gestmsj.contactos;

import java.util.ArrayList;

public interface IGestorContactos {

	public void cargaContactosExcel(String nombreArchivo);
	public void cargaContactosFacebook(String perfil);
	public void cargaContactosLDAP(String directorio);
	public void actualizaContacto(String nombre, ArrayList<String> telefonos);
	

}
