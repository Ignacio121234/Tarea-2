package org.example;


import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

//main demostrativo del funcionamiento de las clases con una reunion simulada

public class Main {
    public static void main(String[] args) {
         List<Empleado> empleadosTech = new ArrayList<>();//lista que contiene lso empleados del departamento
         String salaOenlace="";//creacion de una string necesaria para crear el archivo.txt
        Departamento tech = new Departamento("Tecnologia");//creacion del departamento "Tecnologia"
        Instant ahora = Instant.now();//definicion del instante en el que se crea la reuion/se marca la asistencia

        //creacion de empleados del departamento tecnologia
        Empleado t1 = new Empleado(1, "ignacio garcia", "ignacio@gmail.com", tech,ahora);
        Empleado t2 = new Empleado(2, "ignacio ferandez", "ignacio1@gmail.com", tech,ahora);

        //se agregan lso empleados al departemento de tecnologia
        tech.agregarEmpleado(t1);
        tech.agregarEmpleado(t2);



        Departamento mark = new Departamento("marketing");// se crea el departamento de tecnologia

        //se crean empleados del departamento de marketing
        Empleado m1 = new Empleado(3, "ignacio garcia1", "ignacio12@gmail.com", mark,ahora);
        Empleado m2 = new Empleado(4, "ignacio garcia2", "ignacio13@gmail.com", mark,ahora);

        //se agregan los empleados al departamento de marketing
        mark.agregarEmpleado(m1);
        mark.agregarEmpleado(m2);

        //creacion de una personal externa
        PersonaExterna p1 =new PersonaExterna("ignacio externo","ignacioex@gmail.com",ahora);

        //creacion de la reunion
        Reunion reunion = new Reunion(Instant.now().truncatedTo(ChronoUnit.MINUTES), Duration.ofHours(2), t2,2,1) {};

        //estos if definen si la string dara la sala o en el enlace de la reunion dependiendo del valor de formato
        //esta string luego se usa para almacenar la info en archivo.txt
        if(reunion.formato==1){ salaOenlace="sala 3";}
        if(reunion.formato==2){ salaOenlace="reunion.com/reu";}

        //este metodo invita al departamento de tecnologia
        reunion.agregarDepartamento(tech);

        //este metodo invita individualmente al empleado m1
        reunion.agregarInvitado(m1);

        //aqui validamos que el m1 asiste y su hora de llegada
        reunion.registrarAsistencia(m1,Instant.now());

        //aqui validamos que el t1 asiste y su hora de llegada
        reunion.registrarAsistencia(t1,ahora.plus(Duration.ofHours(2)));

        //se llama al metodo que comienza la reunion()
        reunion.ComenzarReunion();

        //se imprime la lista de invitados
        reunion.crearListainvitados();

        //se finaliza la reunion
        reunion.finalizarReunion();


        //se entregan las strings que se guardaran en el archivo.txt
        String[]  informe  = {
                 "parametros de la reunion: "+reunion,
                "lista de invitados: "+reunion.invitados.toString(),
                "lista de asistentes: "+reunion.presentes.toString(),
                "lista de ausentes: "+reunion.ausentes.toString(),
                "ubicacion/enlace: "+salaOenlace,
                "Apuntes: "+reunion.crearNota(),



        };
        //este metodo guarda las strings anteriores en el archivo txt
        Nota.escribirCadenasEnArchivo("archivo.txt", informe);




    }
}