package org.example;


import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         List<Empleado> empleadosTech = new ArrayList<>();
         String salaOenlace="";
        Departamento tech = new Departamento("Tecnologia");
        Instant ahora = Instant.now();
        Empleado t1 = new Empleado(1, "ignacio garcia", "ignacio@gmail.com", tech,ahora);
        Empleado t2 = new Empleado(2, "ignacio ferandez", "ignacio1@gmail.com", tech,ahora);
        tech.agregarEmpleado(t1);
        tech.agregarEmpleado(t2);



        Departamento mark = new Departamento("marketing");
        Empleado m1 = new Empleado(3, "ignacio garcia1", "ignacio12@gmail.com", mark,ahora);
        Empleado m2 = new Empleado(4, "ignacio garcia2", "ignacio13@gmail.com", mark,ahora);
        mark.agregarEmpleado(m1);
        mark.agregarEmpleado(m2);

        PersonaExterna p1 =new PersonaExterna("ignacio externo","ignacioex@gmail.com",ahora);

        Reunion reunion = new Reunion(Instant.now().truncatedTo(ChronoUnit.MINUTES), Duration.ofHours(2), t2,2,1) {};
        if(reunion.formato==1){ salaOenlace="sala 3";}
        if(reunion.formato==2){ salaOenlace="reunion.com/reu";}


        reunion.agregarDepartamento(tech);

        reunion.agregarInvitado(m1);
        reunion.registrarAsistencia(m1,Instant.now());


        reunion.registrarAsistencia(t1,ahora.plus(Duration.ofHours(2)));








        reunion.ComenzarReunion();
        reunion.crearListainvitados();


        reunion.finalizarReunion();



        String[]  informe  = {
                 "parametros de la reunion: "+reunion,
                "lista de invitados: "+reunion.invitados.toString(),
                "lista de asistentes: "+reunion.presentes.toString(),
                "lista de ausentes: "+reunion.ausentes.toString(),
                "ubicacion/enlace: "+salaOenlace,
                "Apuntes: "+reunion.crearNota(),



        };
        Nota.escribirCadenasEnArchivo("archivo.txt", informe);




    }
}