package org.example;

import java.time.Instant;

//clase empleado que define a los trabajadores de los distintos departamentos
public class Empleado {


    private int id;//identificador de los empleados,es un entero
    private String nombre;//nombre del empleado, es una string
    private String correo;//correo del empleado,es una string
    private Instant horaLlegada;//momento en el que llega el empleado
    private Departamento departamento;//departamento al cual pertenece el empleado



    //constructor de Empleado
    public Empleado(int id, String nombre, String correo, Departamento departamento, Instant horaLlegada){

        //asignacion de los parametros definidos anteriormente
        this.id=id;
        this.nombre=nombre;
        this.correo=correo;
        this.departamento=departamento;
        this.horaLlegada = this.horaLlegada;



    }

    //metodo getter de Departamento
    public Departamento getDepartamento() {
        return departamento;
    }
    //metodo Getter de horaLLegada
    public Instant horaLlegada() {
        return horaLlegada;
    }

    //se usa toString para dar algunos parametros que queremos conocer del empleado
    @Override
    public String toString() {
        return "id: "+id+ ", Empleado: " + nombre + ", correo: " + correo +", departamento: "+ departamento ;
    }
}




