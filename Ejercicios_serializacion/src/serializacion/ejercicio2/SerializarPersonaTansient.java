package serializacion.ejercicio2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class SerializarPersonaTansient {

    public static void main(String[] args) {

        ArrayList<PersonaTransient> personas = new ArrayList<>();

        personas.add(new PersonaTransient("Manuel","Pastor",19));
        personas.add(new PersonaTransient("Alberto","Planelles", 29));
        personas.add(new PersonaTransient("Joaquin","Magnoli", 19));
        personas.add(new PersonaTransient("Jacobo","San Mauro", 21));
        personas.add(new PersonaTransient("George","Cuartero", 22));

        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/serializacion/ejercicio2/clase_prueba_transient.ser"));

            out.writeObject(personas);

            out.close();

        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

        System.out.println("Objeto serializado en clase_prueba_transient.ser");

    }
}



