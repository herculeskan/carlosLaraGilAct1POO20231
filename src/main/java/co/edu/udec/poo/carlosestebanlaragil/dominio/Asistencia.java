package co.edu.udec.poo.carlosestebanlaragil.dominio;
import java.util.Date;
public class Asistencia extends  Nino{
    private Date fecha;
    private String hora;
    private String estado;
    private Nino nino;
    private Menu menu;
    public Asistencia(Date fecha, String hora, String estado, Nino nino) {
        super();
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.nino = nino;
    }

    public Asistencia() {

    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Nino getNino() {
        return nino;
    }
    public void setNino(Nino nino) {
        this.nino = nino;
    }
}
