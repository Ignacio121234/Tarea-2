package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Reunion{

        protected int Tipo;
        protected int formato;
        protected String Tipo2;
        protected String formato2;
        protected Instant fechaHora;
        protected Instant fechaHoraAtrasos;
        protected Duration duracionPrevista;
        protected Empleado organizador;
        protected List<Empleado> invitados = new ArrayList<>();
        protected List<PersonaExterna> invitadosEx = new ArrayList<>();
        protected List<Empleado> atrasados = new ArrayList<>();
        protected List<Empleado> presentes = new ArrayList<>();
        protected List<Empleado> ausentes = new ArrayList<>();







        public Reunion(Instant fechaHora, Duration duracionPrevista,Empleado organizador,int Tipo,int formato) {
                this.fechaHora = fechaHora;
                this.duracionPrevista = duracionPrevista;
                this.organizador = organizador;
                this.Tipo=Tipo;
                this.Tipo2=Tipo2;
                this.formato=formato;
                this.formato2=formato2;

                if(Tipo==1){ Tipo2="Tecnologico";}
                if(Tipo==2){ Tipo2="Marketing";}
                if(Tipo==3){ Tipo2="Otro";}

                if(formato==1){ formato2="precencial";}
                if(formato==2){ formato2="online";}



        }


        public void agregarInvitado(Empleado empleado) {
                invitados.add(empleado);

        }
        public void agregarInvitadoEx(PersonaExterna personaExterna) {
                invitadosEx.add(personaExterna);

        }
        public void registrarAsistencia(Empleado empleado,Instant fechaHora) {
                presentes.add(empleado);
        }

        public void registrarAtraso(Empleado empleado, Instant fechaHoraAtrasos){
                if(empleado.horaLlegada().isAfter(Instant.now()))
                        atrasados.add(empleado);

        }
        public void agregarDepartamento(Departamento departamento) {
                int i = 0;
                while (i < departamento.getEmpleados().size()) {
                        if (departamento.getEmpleados().get(i).getDepartamento().toString().equals("Tecnologia")) {

                                invitados.add(departamento.getEmpleados().get(i));
                                i = i + 1;
                        }
                }
        }
        public void registarAusencias(){
                ausentes = new ArrayList<>(invitados); // Create a copy
                ausentes.removeAll(presentes);





        }
        public String calcularAsistencia(){

                float lol= presentes.size();
                String Asistencia="Asistencia: "+lol+" personas";

                return Asistencia;

        }

        public String calcularAsistencia2(){

                float lol= presentes.size();
                float lol2= invitados.size();
                float lol3=(lol/lol2)*100;
                String porcentajeAsistencia="pocentaje de la asistencia: "+lol3+"%";

                return porcentajeAsistencia;

        }

        public boolean crearListaAsistentes(){

                        System.out.print("lista asistentes: ");
                        System.out.println(presentes);

                return false;
        }
        public boolean crearListaAusentes(){

                System.out.print("lista ausentes: ");
                System.out.println(ausentes);

                return false;
        }
        public boolean crearListainvitados(){

                System.out.print("lista invitados: ");
                System.out.println(invitados);

                return false;

        }
        public String crearNota(){

                String Nota="ESTOS SON LOS APUNTES DE LA REUNION";
                return Nota;
        }


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
        public void finalizarReunion() {

                crearListaAsistentes();
                calcularAsistencia();
                System.out.println(calcularAsistencia());

                System.out.println(calcularAsistencia2());
                calcularAsistencia2();
                System.out.println("se acabo la reunion:");
                registarAusencias();
                crearListaAusentes();

        }

        @Override
        public String toString() {
                return  "Tipo: " + Tipo2 + ", Fecha: " + fechaHora + " duracion prevista: " + duracionPrevista + " organizador: " + organizador +" fomarto: " + formato2;
        }
}

