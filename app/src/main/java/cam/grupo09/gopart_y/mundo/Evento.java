package cam.grupo09.gopart_y.mundo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Felipe on 29/02/2016.
 * Clase que representa un evento.
 */
public class Evento
{

    /**
     * Identificador del evento
     */
    private long id;

    /**
     * Nombre del evento
     */
    private String nombreEvento;

    /**
     * Fecha seleccionada para el evento.
     */
    private Date fechaSeleccionada ;

    /**
     * Lista de invitaciones al evento
     */
    private ArrayList<Invitacion> invitaciones;


    /**
     * Posibilidades de fechas propuestas
     */
    private ArrayList<OpcionPropuesta<Date>> fechasPropuestas;

    /**
     * Lugares propuestos
     */



}
