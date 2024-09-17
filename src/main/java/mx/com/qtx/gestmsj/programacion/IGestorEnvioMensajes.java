package mx.com.qtx.gestmsj.programacion;

public interface IGestorEnvioMensajes {

    void enviarMensaje(String destinatario, String mensaje);
    String getMensaje(long mensajeId);
    boolean eliminarMensaje(long mensajeId);
    //Hola prueba de permisos 
}