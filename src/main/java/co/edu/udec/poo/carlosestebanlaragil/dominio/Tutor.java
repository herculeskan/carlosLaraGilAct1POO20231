package co.edu.udec.poo.carlosestebanlaragil.dominio;

public class Tutor extends Persona {
    /*
    Programa que se conecta a Tutor
     */
    private Persona persona;
    private String relacion;

    public Tutor(Persona persona, String relacion) {
        super();
        this.persona = persona;
        this.relacion = relacion;
    }

    public Tutor() {

    }

    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getRelacion() {
        return relacion;
    }
    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
}
