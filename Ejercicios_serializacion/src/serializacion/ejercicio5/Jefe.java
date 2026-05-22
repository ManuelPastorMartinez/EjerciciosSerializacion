package serializacion.ejercicio5;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString (callSuper = true)
public class Jefe extends Empleado{

    private String departamento;

    public Jefe(String nombre, double salario,String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
}
