package serializacion.ejercicio4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class DeserializarMapa {
    public static void main(String[] args) {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/serializacion/ejercicio4/mapa.ser"));
            HashMap personas = (HashMap) in.readObject();

            for(Object persona : personas.entrySet() ){
                System.out.println(persona);
            }
        }catch (IOException|ClassNotFoundException e){
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}
