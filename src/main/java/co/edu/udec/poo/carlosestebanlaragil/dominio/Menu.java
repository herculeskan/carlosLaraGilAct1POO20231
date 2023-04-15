package co.edu.udec.poo.carlosestebanlaragil.dominio;

import java.util.Date;
import java.util.List;

public class Menu extends Asistencia{
    int id;
    List<Plato> platos;

    public Menu(Date fecha, String hora, String estado, Nino nino) {
        super(fecha, hora, estado, nino);
    }

    public Menu() {
        super();
    }
}
