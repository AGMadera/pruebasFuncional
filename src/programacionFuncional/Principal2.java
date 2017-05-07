package programacionFuncional;

import pojos.Persona;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by alfonsogalvanmadera on 07/05/17.
 */
public class Principal2 {

    public static void main(String[] args) {
        ArrayList<Persona> milista2 = new ArrayList<Persona>();
        milista2.add(new Persona("Pepe Navas"));
        milista2.add(new Persona("Monica Galindo"));

        Collections.sort(milista2,(Persona p1,Persona p2)->p1.getNombre().compareTo(p2.getNombre()));

        for (Persona p: milista2){
            System.out.println(p.getNombre());
        }
    }

}
