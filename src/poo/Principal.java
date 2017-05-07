package poo;

import pojos.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by alfonsogalvanmadera on 07/05/17.
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> milista = new ArrayList<Persona>();
        milista.add(new Persona("Pepe P Dos"));
        milista.add(new Persona("Monica Galindo"));
        milista.add(new Persona("Jesus Brayan"));

        //Sencillo bloque de código que usa un Comparador para ordenar una lista de Personas.
        Collections.sort(milista, new Comparator<Persona>() {
                    @Override
                    public int compare(Persona o1, Persona o2) {
                        return o1.getNombre().compareTo(o2.getNombre());
                    }
                }
        );
        for (Persona p: milista){
            System.out.println(p.getNombre());
        }

    }
}
