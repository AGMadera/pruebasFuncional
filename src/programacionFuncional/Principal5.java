package programacionFuncional;

import pojos.Persona;

import java.util.ArrayList;

/**
 * Created by alfonsogalvanmadera on 07/05/17.
 */
public class Principal5 {
    public static void main(String[] args) {

        //Sin embargo podemos simplificar el codigo generado en Principal4
        // sobre manera utilizando una expresión Lambda.
        ArrayList<Persona> milista5 = new ArrayList<Persona>();
        milista5.add(new Persona("Pepe Navas"));
        milista5.add(new Persona("Monica Galindo"));

        //El compilador realiza las modificaciones necesarias para
        // que funcione perfectamente y el código queda claramente simplificado.
        milista5.forEach((final Persona persona)-> System.out.println(persona.getNombre()));
    }
}
