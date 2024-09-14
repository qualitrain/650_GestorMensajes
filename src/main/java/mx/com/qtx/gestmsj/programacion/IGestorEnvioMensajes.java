package mx.com.qtx.gestmsj.programacion;

public interface IGestorEnvioMensajes {

    void enviarMensaje(String destinatario, String mensaje);
    
    String obtenerMensaje(int mensajeId);
    
    boolean eliminarMensaje(int mensajeId);
    

}