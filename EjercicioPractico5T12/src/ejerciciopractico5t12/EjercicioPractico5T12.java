/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico5t12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioPractico5T12 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce la cantidad de numeros enteros y positivos que quieres generar: ");
        int cantidad = sc.nextInt();
        System.out.print("Introduce la ruta del fichero de destino: ");
        sc.nextLine();
        String destino = sc.next();
        try {
            FileOutputStream fos = new FileOutputStream(destino, true);
            DataOutputStream dos = new DataOutputStream(fos);
            FileInputStream fis = new FileInputStream(destino);
            DataInputStream dis = new DataInputStream(fis);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

}
