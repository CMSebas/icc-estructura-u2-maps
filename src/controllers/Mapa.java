package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
    }

    public void ejemploConHashMap(){
        System.out.println("------------------Ejemplo con Hash Map---------------------------");
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Peru", "Lima");
        capitales.put("Colombia", "Bogota");
        System.out.println(capitales.keySet());

        for(String pais:capitales.keySet()){
            System.out.println("Pais: "+ pais+", Capital:"+capitales.get(pais));
        }

        String capital=capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: "+ capital);

        Map<Integer,Empleado> empleados=new HashMap<>();

        empleados.put(3,new Empleado(3, "Pedro", "Tester"));
        empleados.put(1,new Empleado(1, "Ana", "Dev"));
        empleados.put(2,new Empleado(2, "Luis", "Diseñador"));
        empleados.put(1,new Empleado(3, "Pedro", "Tester"));

        for(Map.Entry<Integer,Empleado>entry:empleados.entrySet()){
            System.out.println("Clave "+ entry.getKey()+",Valor:"+entry.getKey());
        }

        Map<Empleado,Integer> empleadosDos=new HashMap<>();

        Empleado emp1=new Empleado(1, "Ana", "Dev");
        Empleado emp2=new Empleado(2, "Pedro", "Dev");
        Empleado emp3=new Empleado(3, "Ana", "Dev");
        Empleado emp4=new Empleado(3, "Ana", "Dev");

        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500);
        empleadosDos.put(emp4, 2000);

        for(Map.Entry<Empleado,Integer>entry:empleadosDos.entrySet()){
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
        

    }

    public void ejemploConLinkedHashMap(){
        System.out.println("------------------Ejemplo con Linked Hash Map---------------------------");
        Map<String, Double> productos = new LinkedHashMap<>();

    productos.put("Pan", 0.50);
    productos.put("Leche", 1.00);
    productos.put("Azucar", 1.50);
    productos.put("Jugos", 2.20);

    System.out.println("Productos:");
    for (String producto : productos.keySet()) {
        System.out.println("Producto: " + producto + ", Precio: $" + productos.get(producto));
    }

    String productoBuscado = "Leche";
    Double precio = productos.get(productoBuscado);
    System.out.println("El precio de " + productoBuscado + " es: $" + precio);
    }

    public void ejemploConTreeMap(){
        System.out.println("------------------Ejemplo con Tree Map---------------------------");
        Map<String,Integer> personas=new TreeMap<>();
        personas.put("Martha", 10);
        personas.put("Sebas", 23);
        personas.put("Mateo", 30);

        System.out.println("Contenido de TreeMap:");
        System.out.println(personas);

        

        
        
        
        
        


    }
}
