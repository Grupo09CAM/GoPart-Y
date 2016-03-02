package cam.grupo09.gopart_y.mundo;

/**
 * Created by Felipe on 29/02/2016.
 * Contiene la información del usuario.
 */
public class Usuario
{

    /**
     * Nombre del usuario
     */
    private String nombre;

    /**
     *Apellido del usuario
     */
    private String apellido;

    /**
     * Correo electronico del usuario
     */
    private String correoElectronico;

    /**
     * Teléfono celular del usuario
     */
    private String telefono;

    /**
     * Crea un nuevo usuario con los parámetros dados.
     * @param nombre
     * @param apellido
     * @param correoElectronico
     * @param telefono
     */
    public Usuario(String nombre, String apellido, String correoElectronico, String telefono)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }
}
