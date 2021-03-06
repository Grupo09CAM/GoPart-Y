package cam.grupo09.gopart_y.mundo;

/**
 * Created by Felipe on 29/02/2016.
 * Define los posibles estados de un evento.
 */
public enum EstadoEvento
{

    /*
        En configuración: El evento se creó, no se ha configurado completamente
        Configurado: Ya se definieron los diferentes parámetros del evento
        Anulado: El evento fue cancelado
        Finalizado: El evento ya pasó.
     */

    EN_CONFIGURACION, CONFIGURADO, ANULADO, FINALIZADO

}
