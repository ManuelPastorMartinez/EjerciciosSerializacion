package serializacion.ejercicio1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializarPersona {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/serializacion/ejercicio1/clase_prueba.ser"));
            ArrayList<Persona> personas = (ArrayList<Persona>) in.readObject();
            in.close();
            for(Persona persona : personas) {
                System.out.println("Objeto persona leido: " + persona);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

    }

}
