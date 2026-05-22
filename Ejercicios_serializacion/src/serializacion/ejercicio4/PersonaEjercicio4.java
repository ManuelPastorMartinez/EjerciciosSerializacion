package serializacion.ejercicio4;

import java.io.Serializable;

public class PersonaEjercicio4 implements Serializable {
    private String nombre;
    private int edad;

    public PersonaEjercicio4(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " tiene " + edad + " años.";
    }
}