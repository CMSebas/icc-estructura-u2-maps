package controllers;

import java.util.List;

import models.Empleado;

public interface EmpleadoDAO{
     void add(Empleado empleado);             
               
    void list();             
          
    void remove(int id); 
    


}