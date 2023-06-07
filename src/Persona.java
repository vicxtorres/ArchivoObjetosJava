import java.io.Serializable;

public class Persona implements Serializable
{
    private String nombre;
    private transient int legajo; //esto no se va a guardar porque dice transient

    public Persona()
    {
        nombre = "nombre";
    }
    public Persona(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona" +
                " nombre: " + nombre ;
    }
}
