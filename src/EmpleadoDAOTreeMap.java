import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import controllers.EmpleadoDAO;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private TreeMap<Empleado, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>(); 
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
