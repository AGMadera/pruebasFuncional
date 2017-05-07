package programacionFuncional;

import pojos.Persona;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by alfonsogalvanmadera on 07/05/17.
 */
public class Principal6 {
    public static void main(String[] args) {
        //implementando lo aprendido
        //Llenando arraylist
        ArrayList <Persona> list = new ArrayList<Persona>();
        list.add(new Persona("Joseias"));
        list.add(new Persona("Sinfonias"));
        list.add(new Persona("Pepe Navas"));
        list.add(new Persona("Monica Galindo"));
        list.add(new Persona("Miguel"));
        list.add(new Persona("Alicia"));
        list.add(new Persona("Canelo Alvarez"));
        list.add(new Persona("Adolfo Hitler"));

        //ordenando el arraylist
        Collections.sort(list,(Persona p1,Persona p2)->p1.getNombre().compareTo(p2.getNombre()));

        //imprimir resultados
        list.forEach((final Persona persona)->System.out.println(persona.getNombre()));
    }
}
