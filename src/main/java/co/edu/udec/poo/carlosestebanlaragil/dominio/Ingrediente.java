package co.edu.udec.poo.carlosestebanlaragil.dominio;

import java.util.List;

public class Ingrediente extends Plato {
    String nombre;

    public Ingrediente(String nombre, List<Ingrediente> ingredientes) {
        super(nombre, ingredientes);
    }

    public Ingrediente() {

    }
}
