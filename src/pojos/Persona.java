package pojos;

/**
 * Created by alfonsogalvanmadera on 07/05/17.
 */
public class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }
}
