package serializacion.ejercicio2;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class PersonaTransient implements Serializable {
    private String nombre;
    private String apellido;
    private transient int edad;


    public PersonaTransient(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String toString() {
        return nombre + apellido + " tiene " + edad + " años.";
    }
}