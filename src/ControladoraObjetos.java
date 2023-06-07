import java.io.*;
import java.util.ArrayList;

public class ControladoraObjetos
{
    public static void grabar (ArrayList<Persona> personasArrayList)
    {
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream = null;

        try
        {
            fileOutputStream = new FileOutputStream("objetos.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for(Persona persona : personasArrayList)
            {
                objectOutputStream.writeObject(persona);

            }
        }
        catch (IOException ex)
        {
            ex.getMessage();
        }

        finally {
            try
            {
                if(fileOutputStream!=null)
                    fileOutputStream.close();

                if(objectOutputStream!=null)
                    objectOutputStream.close();

            }catch (IOException ex)
            {
                ex.getMessage();
            }
        }
    }

    public static ArrayList<Persona> leer ()
    {
        ArrayList<Persona> personas =new ArrayList<Persona>();
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;

        try
        {
            fileInputStream = new FileInputStream("objetos.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while(true)
            {
                Persona aux = (Persona) objectInputStream.readObject();
                personas.add(aux);
            }

        }
        catch (EOFException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            try
            {
                if(fileInputStream!=null)
                    fileInputStream.close();
                if(objectInputStream!=null)
                    objectInputStream.close();
            }
            catch (IOException ex)
            {
                ex.getMessage();
            }
        }

    return personas;
    }
}
