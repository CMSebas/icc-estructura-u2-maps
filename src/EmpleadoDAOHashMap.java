import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import controllers.EmpleadoDAO;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO{

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>(); // inicialización en el constructor
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
        System.out.println("Empleado Agregado"+empleado);
        
    }

    @Override
    public void remove(int id) {
        Empleado temp=new Empleado(id);
        empleados.remove(temp);


        
    }

    @Override
    public void list() {
        System.out.println(empleados);

    }

   

    


}