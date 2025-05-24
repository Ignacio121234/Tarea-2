package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Reunion{


        //declaracion de variables en reunion
        protected int Tipo;//indica el tipo de reunion
        protected int formato;//indica si el formato es online o precencial
        protected String Tipo2;//indica el tipo de reunion pero es una string
        protected String formato2;//indica si el formato es online o precencial pero es una string
        protected Instant fechaHora;//indica el momento de la reunion
        protected Duration duracionPrevista;//indica cuanto se espera que dure la reunion
        protected Empleado organizador;//define que empleado organiza la reunion
        protected List<Empleado> invitados = new ArrayList<>();//lista de invitados
        protected List<PersonaExterna> invitadosEx = new ArrayList<>();//lista de invitados externos
        protected List<Empleado> atrasados = new ArrayList<>();//lsita de empleados atrasados
        protected List<Empleado> presentes = new ArrayList<>();//lista de empleados que asisten a la reunion
        protected List<Empleado> ausentes = new ArrayList<>();//lista de empleados que se ausentan a la reunion





        //constructor de la clase Reunion

        public Reunion(Instant fechaHora, Duration duracionPrevista,Empleado organizador,int Tipo,int formato) {


                //variables de parametros de la reunion
                this.fechaHora = fechaHora;//indica el momento de la reunion
                this.duracionPrevista = duracionPrevista;//indica cuanto se espera que dure
                this.organizador = organizador;//define que empleado organiza la reunion
                this.Tipo=Tipo;//indica el tipo de reunion
                this.Tipo2=Tipo2;//indica el tipo de reunion pero es una string
                this.formato=formato;//indica si el formato es online o precencial
                this.formato2=formato2;//indica si el formato es online o precencial pero es una string



                //se define el Tipo de reunion
                if(Tipo==1){ Tipo2="Tecnologico";}
                if(Tipo==2){ Tipo2="Marketing";}
                if(Tipo==3){ Tipo2="Otro";}


                //se define el formato de reunion
                if(formato==1){ formato2="precencial";}
                if(formato==2){ formato2="online";}



        }


        //metodo que invita empleado de manera individual
        public void agregarInvitado(Empleado empleado) {
                invitados.add(empleado);

        }
        //metodo que agrega invitados externos
        public void agregarInvitadoEx(PersonaExterna personaExterna) {
                invitadosEx.add(personaExterna);

        }
        //metodo que registra la asistencia a la reunion
        public void registrarAsistencia(Empleado empleado,Instant fechaHora) {
                presentes.add(empleado);//se agregan empleados a la lista presentes
        }

        //metodo que registra los atrasos de los empleados(no implementado)
        public void registrarAtraso(Empleado empleado, Instant fechaHoraAtrasos){
                if(empleado.horaLlegada().isAfter(Instant.now()))
                        atrasados.add(empleado);

        }
        //metodo que invita un departamento completo
        public void agregarDepartamento(Departamento departamento) {
                int i = 0;
                while (i < departamento.getEmpleados().size()) {
                        if (departamento.getEmpleados().get(i).getDepartamento().toString().equals("Tecnologia")) {

                                invitados.add(departamento.getEmpleados().get(i));
                                i = i + 1;
                        }
                }
        }
        //metodo que registra las ausencias
        public void registarAusencias(){
                ausentes = new ArrayList<>(invitados);
                ausentes.removeAll(presentes);





        }
        //indica cuantas personas asisten
        public String calcularAsistencia(){

                float lol= presentes.size();
                String Asistencia="Asistencia: "+lol+" personas";

                return Asistencia;

        }
        //metodo que indica el porcentaje de asistencia
        public String calcularAsistencia2(){

                float lol= presentes.size();
                float lol2= invitados.size();
                float lol3=(lol/lol2)*100;
                String porcentajeAsistencia="pocentaje de la asistencia: "+lol3+"%";

                return porcentajeAsistencia;

        }
        //metodo que crea un lista de la gente que asiste
        public boolean crearListaAsistentes(){

                        System.out.print("lista asistentes: ");
                        System.out.println(presentes);

                return false;
        }
        //metodo que crea una lista de la que se ausenta
        public boolean crearListaAusentes(){

                System.out.print("lista ausentes: ");
                System.out.println(ausentes);

                return false;
        }
        //metodo que crea una lista de las personas que fueron invitadas
        public boolean crearListainvitados(){

                System.out.print("lista invitados: ");
                System.out.println(invitados);

                return false;

        }
        //metodo que se utiliza para agregar una nota al archivo.txt
        public String crearNota(){

                String Nota="ESTOS SON LOS APUNTES DE LA REUNION";
                return Nota;
        }


        //metodo de inicio de la reunion
        public void ComenzarReunion()
        {

                System.out.println("parametros de la reunion: "+ this);
                if(formato2.equals("online")){
                        System.out.println("Enlace: reunion.com/reu");
                }
                if(formato2.equals("precencial")){
                        System.out.println("Ubicacion: sala 3");
                }






        }
        //metodo que termina la reunion
        public void finalizarReunion() {

                crearListaAsistentes();
                calcularAsistencia();
                System.out.println(calcularAsistencia());
                System.out.println(calcularAsistencia2());
                calcularAsistencia2();
                registarAusencias();
                crearListaAusentes();
                System.out.println("se acabo la reunion");
        }

        //se usa toString para dar los datos de esenciales de la clase Reunion
        @Override
        public String toString() {
                return  "Tipo: " + Tipo2 + ", Fecha: " + fechaHora + " duracion prevista: " + duracionPrevista + " organizador: " + organizador +" fomarto: " + formato2;
        }
}

