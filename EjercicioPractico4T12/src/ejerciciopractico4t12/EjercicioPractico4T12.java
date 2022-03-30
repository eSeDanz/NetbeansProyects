/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico4t12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioPractico4T12 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce la ruta del fichero a copiar: ");
        String origen = sc.nextLine();
        System.out.println("Introduce la ruta del fichero destino: ");
        String destino = sc.nextLine();
        try {
            FileInputStream fis = new FileInputStream(origen);
            FileOutputStream fos = new FileOutputStream(destino);
            byte[] array = new byte[fis.available()];
            fis.read(array);
            fos.write(array);
            fos.close();
            fis.close();
        } catch (IOException ioe) {
            System.out.println("Error copiando los ficheros");
        }
    }

}
