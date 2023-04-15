package co.edu.udec.poo.carlosestebanlaragil.dominio;

import java.util.List;

public class Plato extends Menu {
    String nombre;
    List<Ingrediente> ingredientes;

    public Plato(String nombre, List<Ingrediente> ingredientes) {
        super();
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public Plato() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
