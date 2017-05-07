package poo;

import pojos.Persona;

import java.util.ArrayList;

/**
 * Created by alfonsogalvanmadera on 07/05/17.
 */
public class Principal3 {
    public static void main(String[] args) {

        //bucle forEach clásico que recorre una colección de Personas:

        ArrayList<Persona> milista3 = new ArrayList<Persona>();
        milista3.add(new Persona("Canelo Alvarez"));
        milista3.add(new Persona("Adolfo Hitler"));

        for (Persona p: milista3){
            System.out.println(p.getNombre());
        }
    }
}
