package org.example;


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         List<Empleado> empleadosTech = new ArrayList<>();
        Departamento tech = new Departamento("Tecnologia");
        Instant ahora = Instant.now();
        Empleado t1 = new Empleado(1, "ignacio garcia", "ignacio@gmail.com", tech,ahora);
        Empleado t2 = new Empleado(2, "ignacio ferandez", "ignacio1@gmail.com", tech,ahora);
        tech.agregarEmpleado(t1);
        tech.agregarEmpleado(t2);



        Departamento mark = new Departamento("marketing");
        Empleado m1 = new Empleado(1, "ignacio garcia1", "ignacio12@gmail.com", mark,ahora);
        Empleado m2 = new Empleado(2, "ignacio garcia2", "ignacio13@gmail.com", mark,ahora);
        mark.agregarEmpleado(m1);
        mark.agregarEmpleado(m2);

        PersonaExterna p1 =new PersonaExterna("ignacio externo","ignacioex@gmail.com",ahora);

        Reunion reunion = new Reunion(Instant.now(), Duration.ofHours(2), t1,2) {};
        reunion.agregarDepartamento(tech);
        reunion.agregarDepartamento(tech);

        reunion.agregarInvitado(t1);
        reunion.agregarInvitadoEx(p1);
        reunion.registrarAsistencia(t1,ahora);
        reunion.agregarInvitado(t2);
        reunion.registrarAsistencia(t2,ahora);
        reunion.agregarInvitado(m1);
        reunion.registrarAsistencia(m1,ahora);
        reunion.agregarInvitado(m2);

        reunion.registarAusencias();
        System.out.println(reunion.calcularAsistencia());
        System.out.println(reunion.calcularAsistencia2());

        System.out.println("xdd:"+reunion.presentes.toString());

        //reunion.crearListaAsistentes();
    }
}