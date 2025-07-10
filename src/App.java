import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
       runEjerccios();
    }
/* 
    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }*/

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();

        
    }

    private static void runEjerccios() {
        System.out.println("-----------------Ejercicio 1 -------------------------------");
        Ejercicios ejercicio=new Ejercicios();
        boolean val=ejercicio.areAnagrams("triangle", "integral");

        if(val==true){
            System.out.println(" las palabras triangle e integral tienen mismos caracteres");
        }else{
            System.out.println(" las palabras triangle e integral  no tienen mismo caracteres");

        }
        System.out.println(ejercicio.areAnagrams("triangle", "integral"));

        System.out.println("-----------------Ejercicio 2 -------------------------------");
        int[] nums = {9,2,3,6};
        int[] resultado = ejercicio.sumatoriaDeDos(nums, 5);
         if (resultado != null) {
            System.out.println("Resultado: " + resultado[0] + ", " + resultado[1] );
        } else {
            System.out.println("No Hay");
        }

        System.out.println("-----------------Ejercicio 3 -------------------------------");
        ejercicio.contarCaracteres("hola");
        System.out.println("-----------------Ejercicio 4 -------------------------------");
        System.out.println( ejercicio.sonAnagramas("roma", "amor"));
        
    }

    public static void runEmpleadoExample(){
        EmpleadoDAO empleadoDaoHas=new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller=new EmpleadoContoller(empleadoDaoHas);

        EmpleadoDAO empleadoDAOTree =new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 =new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1=new Empleado(5, "Pedro", "dev");
        Empleado emp2=new Empleado(3, "Juan", "dev");
        Empleado emp3=new Empleado(2, "Maria", "dev");
        Empleado emp4=new Empleado(1, "Seb", "dev");
        Empleado emp5=new Empleado(4, "Mateo", "dev");

        empleadoContoller.agregarEmpleado(emp1);
        empleadoContoller.agregarEmpleado(emp2);
        empleadoContoller.agregarEmpleado(emp3);
        empleadoContoller.agregarEmpleado(emp4);
        empleadoContoller.agregarEmpleado(emp5);




        empleadoContoller.listarEmpleado();
        System.out.println("Eliminar empleado");
        empleadoContoller.eliminarEmpleado(1);
        System.out.println("ACTUALIZADO");
        empleadoContoller.listarEmpleado();

        System.out.println("Con tree map");

        empleadoContoller2.agregarEmpleado(emp1);
        empleadoContoller2.agregarEmpleado(emp2);
        empleadoContoller2.agregarEmpleado(emp3);
        empleadoContoller2.agregarEmpleado(emp4);
        empleadoContoller2.agregarEmpleado(emp5);

        empleadoContoller2.eliminarEmpleado(5);
        empleadoContoller2.listarEmpleado();


        
    }
}
