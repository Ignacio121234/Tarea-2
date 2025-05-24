package org.example;
import java.time.Instant;

//clase que representa a alguien que es invitado a la reunion pero no es empleado
public class PersonaExterna {

    private String nombre;//nombre del invitado

    private String correo;//correo del invitado

    public PersonaExterna(String nombre,String correo, Instant HoraLlegada){

        //asignacion de los datos del invitado
        this.nombre=nombre;
        this.correo=correo;

    }

    //se usa toString para obtener la informacion del invitado
    @Override
    public String toString() {
        return  "Persona externa: " + nombre + ", correo: " + correo ;
    }
}
