package co.edu.udec.poo.carlosestebanlaragil.dominio;

import java.util.Scanner;

public class Principal {

        public static void main(String[] args) {
            /*
            invocar las demás clases
             */
            Nino nino = new Nino();
            Persona persona = new Persona();
            Tutor tutor = new Tutor();
            Menu menu = new Menu();
            Plato plato = new Plato();
            Ingrediente ingrediente = new Ingrediente();
            System.out.println("Mensaje para ver si todo compilado");

            /*
            Datos de la persona
             */
            persona.setNombre("Carlos");
            persona.setTelefono("123456789");
            System.out.println(persona.getTelefono());
            System.out.println(persona.getNombre());

        }
}
