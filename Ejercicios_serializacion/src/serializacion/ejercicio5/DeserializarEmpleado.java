package serializacion.ejercicio5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializarEmpleado {
    public static void main(String[] args) {

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/serializacion/ejercicio5/ejercicio5.ser"));

            ArrayList<Empleado> empleados = (ArrayList<Empleado>) in.readObject();

            in.close();

            for(Empleado persona : empleados) {
                System.out.println(persona);
            }
        }catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}
