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
    Departamento Tech =new Departamento("tecnologia");
    Empleado e1 = new Empleado(1,"ignacio garcia","ignacio@gmail.com",Tech);
    Empleado e2 = new Empleado(1,"ignacio fernandez","ignacio@gmail.com",Tech);
    Empleado e3 = new Empleado(1,"ignacio tomas","ignacio@gmail.com",Tech);
    Empleado e4 = new Empleado(1,"ignacio ignacio","ignacio@gmail.com",Tech);
    Empleado e5 = new Empleado(1,"ignacio garcia2","ignacio@gmail.com",Tech);
    Empleado e6 = new Empleado(1,"ignacio garcia3","ignacio@gmail.com",Tech);

}

