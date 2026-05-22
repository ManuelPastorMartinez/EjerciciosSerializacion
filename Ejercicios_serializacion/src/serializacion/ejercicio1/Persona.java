package serializacion.ejercicio1;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Persona implements Serializable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " tiene " + edad + " años.";
    }
}