package programacionFuncional;

import pojos.Persona;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Created by alfonsogalvanmadera on 07/05/17.
 */
public class Principal4 {
    public static void main(String[] args) {

        //el método forEach de Java 8 que las colecciones soportan a través del interface Iterable.
        ArrayList<Persona> milista4 = new ArrayList<Persona>();
        milista4.add(new Persona("Miguel"));
        milista4.add(new Persona("Alicia"));

        //El método forEach soporta un nuevo tipo de Clase que se denomina “Consumer”
        // la cual dispone de un método accept que realiza las operaciones que necesitemos
        // sobre los objetos con los que estamos trabajando.
        milista4.forEach(new Consumer<Persona>() {
            @Override
            public void accept(Persona persona) {
                System.out.println(persona.getNombre());
            }
        });
        // Esta modificación parece de entrada un paso atrás
        // ya que el código es más complejo al haber usado una clase anónima.
    }
}
