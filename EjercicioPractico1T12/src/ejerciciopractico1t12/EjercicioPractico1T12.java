/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico1t12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjercicioPractico1T12 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        leer();
        introducirFrases();
        leer();
    }

    public static void introducirFrases() {
        try {
            String frase;
            FileWriter fw;
            do {
                System.out.print("Introduce una frase al archivo destino: ");
                frase = sc.nextLine();
                if (!frase.equals("99")) {
                    System.out.print("Quieres sobreescribir el archivo?(S/N): ");
                    if (sc.nextLine().equalsIgnoreCase("S")) {
                        fw = new FileWriter("/home/alumno/ficheros/EjercicioPractico1T12.txt");
                    } else {
                        fw = new FileWriter("/home/alumno/ficheros/EjercicioPractico1T12.txt", true);
                    }
                    fw.write(frase + "\n");
                    fw.close();
                }
            } while (!frase.equals("99"));
        } catch (IOException ioe) {
            System.out.println("Excepción de entrada/salida");
        }
    }

    public static void leer() {
        try {
            FileReader fr = new FileReader("/home/alumno/ficheros/EjercicioPractico1T12.txt");
            int i;
            while ((i = fr.read()) != -1) {
                if (i != ' ') {
                    System.out.print((char) i);
                }
            }
            fr.close();
        } catch (IOException ioe) {
            System.out.println("Excepción de entrada/salida");
        }
    }
}
