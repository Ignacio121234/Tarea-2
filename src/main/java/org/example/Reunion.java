package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Reunion {

        protected Instant fechaHora;
        protected Instant fechaHoraAtrasos;
        protected Duration duracionPrevista;
        protected String organizador;
        protected List<Empleado> invitados = new ArrayList<>();
        protected List<Empleado> atrasados = new ArrayList<>();
        protected List<Empleado> presentes = new ArrayList<>();
        protected List<Empleado> ausentes = new ArrayList<>();
        protected List<Asistencia> asistencia = new ArrayList<>();



        public Reunion(Instant fechaHora, Duration duracionPrevista,String organizador) {
                this.fechaHora = fechaHora;
                this.duracionPrevista = duracionPrevista;
                this.organizador = organizador;

        }

        public void agregarInvitado(Empleado empleado) {
                invitados.add(empleado);

        }
        public void registrarAsistencia(Empleado empleado,Instant fechaHora) {
                presentes.add(empleado);
        }

        public void registrarAtraso(Empleado empleado, Instant fechaHoraAtrasos){
                presentes.add(empleado);
                atrasados.add(empleado);



        }
        public void registarAusencias(){
                ausentes = new ArrayList<>(invitados); // Create a copy
                ausentes.removeAll(presentes);




        }
        public void ComenzarReunion()
        {

                System.out.println("parametros de la reunion:");

        }
        public void finalizarReunion() {

                System.out.println("se acabo la reunion:");
        }


}

