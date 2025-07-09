package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import models.Empleado;
import controllers.EmpleadoDAO;

public class EmpleadoContoller { 
    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO){
        this.empleadoDAO=empleadoDAO;

    }

    public void agregarEmpleado(Empleado emp){
        empleadoDAO.add(emp);
    }

    public void eliminarEmpleado(int id){
        empleadoDAO.remove(id);
    }

    public void listarEmpleado(){
        empleadoDAO.list();
    }

     
}