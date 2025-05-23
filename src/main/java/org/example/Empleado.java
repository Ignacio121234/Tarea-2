package org.example;

public class Empleado {
    private int id;
    private String nombre;
    private String correo;
    private Departamento departamento;


    public Empleado(int id, String nombre,String correo, Departamento departamento){

        this.id=id;
        this.nombre=nombre;
        this.correo=correo;
        this.departamento=departamento;

    }


    @Override
    public String toString() {
        return "id: "+id+ ", Empleado: " + nombre + ", correo: " + correo +", departamento: "+ departamento ;
    }
}



