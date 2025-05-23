package org.example;
import java.time.Instant;
public class PersonaExterna {
    private String nombre;
    private String correo;

    public PersonaExterna(String nombre,String correo, Instant HoraLlegada){

        this.nombre=nombre;
        this.correo=correo;

    }
    @Override
    public String toString() {
        return  "Persona externa: " + nombre + ", correo: " + correo ;
    }
}
