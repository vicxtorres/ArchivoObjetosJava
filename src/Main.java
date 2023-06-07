import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Persona personaUno = new Persona("victoria");
        Persona personaDos = new Persona("vic");

        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(personaUno);
        personas.add(personaDos);

        ControladoraObjetos.grabar(personas);

        ArrayList<Persona> otrasPersonas = new ArrayList<Persona>();
        otrasPersonas = ControladoraObjetos.leer();

        System.out.println(otrasPersonas.toString());
    }
}