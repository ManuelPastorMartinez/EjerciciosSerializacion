package serializacion.ejercicio3;

import serializacion.ejercicio1.Persona;

import java.io.*;
import java.util.ArrayList;

public class DeserializarPersonaEjercicio3 {
    public static void main(String[] args) {

       try {
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/serializacion/ejercicio3/clase_prueba_3.ser"));
           ArrayList<PersonaEjercicio3> listaPersonas = (ArrayList<PersonaEjercicio3>) in.readObject();
           in.close();
           for(PersonaEjercicio3 persona : listaPersonas) {
               System.out.println("Objeto persona leido: " + persona);
           }
       } catch (IOException e) {
           System.out.println("El fichero está dañado o no existe, creando fichero por defecto.");
           e.printStackTrace();
           crearFicheroPorDefecto();
       }

       catch (ClassNotFoundException e) {
           System.out.println("Algo ha ido mal.");
           e.printStackTrace();
       }
    }

    public static void crearFicheroPorDefecto(){
        ArrayList<PersonaEjercicio3> personas = new ArrayList<>();
        personas.add(new PersonaEjercicio3("Manuel", 19));
        personas.add(new PersonaEjercicio3("Alberto", 29));
        personas.add(new PersonaEjercicio3("Joaquin", 19));
        personas.add(new PersonaEjercicio3("Jacobo", 21));
        personas.add(new PersonaEjercicio3("George", 22));
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/serializacion/ejercicio3/clase_prueba_3.ser"));
            out.writeObject(personas);

            System.out.println("Fichero creado por defecto en src/serializacion/ejercicio3/clase_prueba_3.ser");
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/serializacion/ejercicio3/clase_prueba_3.ser"));
            ArrayList<PersonaEjercicio3> listaPersonas = (ArrayList<PersonaEjercicio3>) in.readObject();
            in.close();
            for (PersonaEjercicio3 persona : listaPersonas) {
                System.out.println("Objeto persona leido: " + persona);
            }
        } catch (IOException|ClassNotFoundException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }

}
