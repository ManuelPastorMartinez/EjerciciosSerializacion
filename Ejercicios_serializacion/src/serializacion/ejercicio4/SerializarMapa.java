package serializacion.ejercicio4;

import java.io.*;
import java.util.HashMap;

public class SerializarMapa {
    public static void main(String[] args) {
        HashMap<String, PersonaEjercicio4> mapa = new HashMap<>();

        mapa.put("Persona1", new PersonaEjercicio4("Manuel", 19));
        mapa.put("Persona2", new PersonaEjercicio4("Alberto", 29));
        mapa.put("Persona3", new PersonaEjercicio4("Joaquin", 19));
        mapa.put("Persona4", new PersonaEjercicio4("Jacobo", 21));
        mapa.put("Persona5", new PersonaEjercicio4("George", 25));

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/serializacion/ejercicio4/mapa.ser"));

            out.writeObject(mapa);
            out.close();

        }catch (IOException e) {
                System.out.println("Algo ha ido mal.");
                e.printStackTrace();
            }
    }

}
