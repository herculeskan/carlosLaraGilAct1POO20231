package co.edu.udec.poo.carlosestebanlaragil.dominio;
import java.util.List;
public class CostoMensual extends Persona{
    /*
    Programa que se conecta a costo mensual
     */
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private String cuentaCorriente;
    private List<Tutor> autorizados;


    public CostoMensual(String dni, String nombre, String direccion, String telefono, String cuentaCorriente, List<Tutor> autorizados) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuentaCorriente = cuentaCorriente;
        this.autorizados = autorizados;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(String cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public List<Tutor> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(List<Tutor> autorizados) {
        this.autorizados = autorizados;
    }
}
