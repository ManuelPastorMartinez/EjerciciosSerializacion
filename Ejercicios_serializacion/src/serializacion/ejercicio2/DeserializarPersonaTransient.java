package serializacion.ejercicio2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializarPersonaTransient {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/serializacion/ejercicio2/clase_prueba_transient.ser"));
            ArrayList<PersonaTransient> personas = (ArrayList<PersonaTransient>) in.readObject();
            in.close();
            for(PersonaTransient persona : personas) {
                System.out.println("Objeto persona leido: " + persona);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

    }

}
