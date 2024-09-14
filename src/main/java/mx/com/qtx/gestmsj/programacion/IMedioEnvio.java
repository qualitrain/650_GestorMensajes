package mx.com.qtx.gestmsj.programacion;

import java.util.Map;
import java.util.Properties;

public interface IMedioEnvio {
	String getId();
	Properties getConfig();
	String getDescripcion();
	Map<String,Integer> getStatusServicios();
	long getCapacidadMsjXminuto();
}
