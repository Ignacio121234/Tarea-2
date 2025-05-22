package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Reunion {

        protected Instant fechaHora;
        protected Duration duracionPrevista;
        protected String organizador;
        protected List<Empleado> invitados = new ArrayList<>();
        protected List<Empleado> presentes = new ArrayList<>();
        protected List<Empleado> ausentes = new ArrayList<>();
        protected List<Asistencia> asistencia = new ArrayList<>();



}
