package serializacion.ejercicio3;

import java.io.Serializable;

public class PersonaEjercicio3 implements Serializable {
    private String nombre;
    private int edad;

    public PersonaEjercicio3(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " tiene " + edad + " años.";
    }
}