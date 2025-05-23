package org.example;


import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Departamento tech = new Departamento("Tecnología");
        Departamento mark = new Departamento("marketing");
        Instant ahora = Instant.now();


        Empleado t1 = new Empleado(1, "ignacio garcia", "ignacio@gmail.com", tech);
        Empleado t2 = new Empleado(2, "ignacio ferandez", "ignacio1@gmail.com", tech);
        tech.agregarEmpleado(t1);
        tech.agregarEmpleado(t2);
        Empleado m1 = new Empleado(1, "ignacio garcia1", "ignacio12@gmail.com", mark);
        Empleado m2 = new Empleado(2, "ignacio garcia2", "ignacio13@gmail.com", mark);

        PersonaExterna e1 =new PersonaExterna("igancio garcia21","ignacio21@gmail.com");

        Reunion reunion = new Reunion(Instant.now(), Duration.ofHours(2), "Juan") {};

        reunion.agregarInvitado(t1);
        reunion.registrarAsistencia(t1,ahora);
        reunion.agregarInvitado(t2);
        reunion.registrarAsistencia(t2,ahora);
        reunion.agregarInvitado(m1);
        reunion.registrarAsistencia(m1,ahora);
        reunion.agregarInvitado(m2);

        reunion.registarAusencias();

        System.out.println("xdd:"+reunion.ausentes.toString());

    }
}