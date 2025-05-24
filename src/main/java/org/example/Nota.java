package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Nota {

    //metodo escribirCadenasEnArchivo permite almacenar strings proporcionadas en un archivo.txt
    public static void escribirCadenasEnArchivo(String nombreArchivo, String[] informe) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            //loop que itera entre las strings de informe y las almacena
            for (String strings : informe) {
                writer.write(strings);
                writer.newLine();
            }

        }
        //manejo del caso de excepcion
        catch (IOException e) {System.out.println("Error crear archivo: " );}
    }

}