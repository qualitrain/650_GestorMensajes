package mx.com.qtx.gestmsj.contactos;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GestorContactos implements IGestorContactos {
	
	private static Logger log = LoggerFactory.getLogger(GestorContactos.class);

	@Override
	public void cargaContactosExcel(String nombreArchivo) {
		log.info("Cargando contactos Excel desde archivo" + nombreArchivo);

	}

	@Override
	public void cargaContactosFacebook(String perfil) {
		log.info("Cargando contactos desde Facebook" + perfil);

	}

	@Override
	public void cargaContactosLDAP(String directorio) {
		log.info("Cargando contactos desde LDAP" + directorio);

	}

	@Override
	public void actualizaContacto(String nombre, ArrayList<String> telefonos) {
		log.info("actualizaContacto");
		log.info("El nombre del contacto; " + nombre);
		for (int i = 0; i < telefonos.size(); i++) {
			log.info("Valor contacto; " + telefonos.get(i));
		}
	

	}

}
