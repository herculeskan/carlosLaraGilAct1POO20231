package co.edu.udec.poo.carlosestebanlaragil.dominio;

/**
 *
 * @author Carlos Esteban Lara gil
 * classDiagram
 * class Persona {
 *     +dni: String
 *     +nombre: String
 *     +direccion: String
 *     +telefono: String
 * }
 *
 * class Menu {
 *     +id: int
 *     +platos: List<Plato>
 * }
 *
 * class Plato {
 *     +nombre: String
 *     +ingredientes: List<Ingrediente>
 * }
 *
 * class Ingrediente {
 *     +nombre: String
 * }
 *
 * class Tutor {
 *     +persona: Persona
 *     +relacion: String
 * }
 *
 * class CostoMensual {
 *     +dni: String
 *     +nombre: String
 *     +direccion: String
 *     +telefono: String
 *     +cuentaCorriente: String
 *     +autorizados: List<Tutor>
 * }
 *
 * class Nino {
 *     +numMatricula: int
 *     +nombre: String
 *     +fechaNacimiento: Date
 *     +fechaIngreso: Date
 *     +fechaBaja: Date
 *     +costoMensual: CostoMensual
 *     +alergias: List<Ingrediente>
 *     +asistencias: List<Asistencia>
 * }
 *
 * class Asistencia {
 *     +fecha: Date
 *     +menu: Menu
 * }
 *
 * Persona <|-- Tutor
 * Persona <|-- CostoMensual
 * Ingrediente <-- Plato
 * Plato <-- Menu
 * Tutor --> Nino : autoriza
 * CostoMensual --> Nino : paga por
 * Nino --> Tutor : tiene como tutor
 * Nino --> Asistencia : asiste
 * Asistencia --> Menu : consume
 * Plato --> Ingrediente : contiene
 */

public class Persona  {
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona() {
    }

    public Persona(String dni, String nombre, String direccion, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
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
}