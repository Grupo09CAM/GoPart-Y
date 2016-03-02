package cam.grupo09.gopart_y.mundo;

import java.util.ArrayList;

/**
 * Created by Felipe on 29/02/2016.
 * Clase que modela un establecimiento en bogota.
 */
public class Establecimiento
{
    private String test;
    private String test2;
    private String test3;
    /**
     * Nombre del establecimiento
     */
    private String nombre;

    /**
     * Descripcion del establecimiento
     */
    private String descripcion;

    /**
     * Dirección del establacimiento*
     */
    private String direccion;

    /**
     * Lista de estilos de musica que se reproducen
     */
    private ArrayList<TipoMusica> tiposMusica;

    /**
     * Lista de bebidas que se distribuyen
     */
    private ArrayList<TipoBebida> tipoBebidas;

    /**
     * Costo cover
     */
    private double costoCover;

    //TODO agregar fotos


    public Establecimiento(String nombre, String descripcion, String direccion,
                           ArrayList<TipoMusica> tiposMusica, ArrayList<TipoBebida> tipoBebidas, double costoCover) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.tiposMusica = tiposMusica;
        this.tipoBebidas = tipoBebidas;
        this.costoCover = costoCover;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public ArrayList<TipoMusica> getTiposMusica()
    {
        return tiposMusica;
    }

    public ArrayList<TipoBebida> getTipoBebidas()
    {
        return tipoBebidas;
    }

    public double getCostoCover()
    {
        return costoCover;
    }
}
