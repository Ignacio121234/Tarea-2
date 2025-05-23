package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Nota {


    public static void escribirCadenasEnArchivo(String nombreArchivo, String[] informe) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String strings : informe) {
                writer.write(strings);
                writer.newLine();
            }

        }
        catch (IOException e) {System.out.println("Error crear archivo: " );}
    }

}