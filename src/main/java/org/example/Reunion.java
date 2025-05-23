package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Reunion{

        int Tipo;
        protected String Tipo1;
        protected Instant fechaHora;
        protected Instant fechaHoraAtrasos;
        protected Duration duracionPrevista;
        protected Empleado organizador;
        protected List<Empleado> invitados = new ArrayList<>();
        protected List<PersonaExterna> invitadosEx = new ArrayList<>();
        protected List<Empleado> atrasados = new ArrayList<>();
        protected List<Empleado> presentes = new ArrayList<>();
        protected List<Empleado> ausentes = new ArrayList<>();







        public Reunion(Instant fechaHora, Duration duracionPrevista,Empleado organizador,int Tipo) {
                this.fechaHora = fechaHora;
                this.duracionPrevista = duracionPrevista;
                this.organizador = organizador;
                this.Tipo=Tipo;
                this.Tipo1=Tipo1;

                if(Tipo==1){String Tipo1="Tecnologico";}
                if(Tipo==2){String Tipo1="Marketing";}
                if(Tipo==3){String Tipo1="Otro";}



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
                presentes.add(empleado);
                atrasados.add(empleado);

        }
        public void agregarDepartamento(Departamento departamento) {
                int i = 0;
                while (i < departamento.getEmpleados().size()) {
                        if (departamento.getEmpleados().get(i).getDepartamento().toString().equals("Tecnologia")) {

                                System.out.println("works");
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
                String Asistencia="Asistencia: "+lol;

                return Asistencia;

        }

        public String calcularAsistencia2(){

                float lol= presentes.size();
                float lol2= invitados.size();
                float lol3=lol/lol2;
                String porcentajeAsistencia="pocentaje de la asistencia: "+lol3;

                return porcentajeAsistencia;

        }

        public void crearListaAsistentes(){


                        System.out.println(presentes);

        }

        public void ComenzarReunion()
        {

                System.out.println("parametros de la reunion:");



        }
        public void finalizarReunion() {

                System.out.println("se acabo la reunion:");
        }


}

