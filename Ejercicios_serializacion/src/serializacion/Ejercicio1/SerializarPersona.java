package serializacion.Ejercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class SerializarPersona {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Manuel", 19));
        personas.add(new Persona("Alberto", 29));
        personas.add(new Persona("Joaquin", 19));
        personas.add(new Persona("Jacobo", 21));
        personas.add(new Persona("George", 22));

        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/serializacion/clase_prueba.ser"));

            out.writeObject(personas);

            out.close();

        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

        System.out.println("Objeto serializado en clase_prueba.ser");

    }
}



