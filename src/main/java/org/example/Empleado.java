package org.example;

import java.time.Instant;

public class Empleado {
    private int id;
    private String nombre;
    private String correo;
    private Instant horaLlegada;
    private Departamento departamento;




    public Empleado(int id, String nombre, String correo, Departamento departamento, Instant horaLlegada){

        this.id=id;
        this.nombre=nombre;
        this.correo=correo;
        this.departamento=departamento;
        this.horaLlegada = this.horaLlegada;



    }

    public Departamento getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "id: "+id+ ", Empleado: " + nombre + ", correo: " + correo +", departamento: "+ departamento ;
    }
}




