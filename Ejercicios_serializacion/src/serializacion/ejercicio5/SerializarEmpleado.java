package serializacion.ejercicio5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializarEmpleado {

    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Jefe("Manuel",5000,"Programación"));
        listaEmpleados.add(new Empleado("Joaquin",1200));
        listaEmpleados.add(new Empleado("Jacobo",  2000));
        listaEmpleados.add(new Empleado("George",1000));
        listaEmpleados.add(new Jefe("Alberto",3550,"Base de datos"));

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/serializacion/ejercicio5/ejercicio5.ser"));

            out.writeObject(listaEmpleados);
            out.close();
        }catch (IOException e){
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }


}
