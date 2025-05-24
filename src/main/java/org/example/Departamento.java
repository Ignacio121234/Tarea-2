package org.example;


import java.util.ArrayList;
import java.util.List;

//clase que representa los departamentos  a traves de una lista de empleados

public class Departamento {
    private String nombre;//nombre del departamento
    private List<Empleado> empleados = new ArrayList<>();//lista que contiene la informacion de los empleados



    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    //metodo que agrega empleados a la lista de empleados
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    //metodo getter de la lista de empleados
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    //metodo que permite obtener la cantidad de empleados en un departamento
    public int obtenerNumeroEmpleados() {
        return empleados.size();
    }



    //se usa para obtener el nombre del departamento
    @Override
    public String toString() {
        return nombre ;
    }



}

