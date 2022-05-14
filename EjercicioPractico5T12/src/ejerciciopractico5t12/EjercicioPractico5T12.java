/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico5t12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class EjercicioPractico5T12 {

    private static Scanner sc = new Scanner(System.in);
    private static int cantidad;
    private static String destino;

    public static void main(String[] args) {
        escribirAleatorios();
        leer();
        añadirAleatorios();
        leer();
    }

    public static void escribirAleatorios() {
        System.out.print("Introduce la cantidad de numeros aleatorios enteros y positivos que quieres generar: ");
        cantidad = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce la ruta del fichero de destino: ");
        destino = sc.nextLine();
        try {
            FileOutputStream fos = new FileOutputStream(destino, true);
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0; i < cantidad; i++) {
//              int random = (int) (Math.random() * 101 + 0);
                dos.writeInt(generarAleatorio());
            }
            dos.close();
            fos.close();
        } catch (IOException ioe) {
            System.out.println("Excepción de entrada/salida");
        }
    }

    public static int generarAleatorio() {
        int aleatorio;
        Random rnd = new Random();
        aleatorio = rnd.nextInt(101) + 0;
        return aleatorio;
    }

    public static void añadirAleatorios() {
        System.out.print("\nIntroduce la cantidad de numeros aleatorios que quieres añadir: ");
        cantidad = sc.nextInt();
        sc.nextLine();
        try {
            FileOutputStream fos = new FileOutputStream(destino, true);
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0; i < cantidad; i++) {
                dos.writeInt(generarAleatorio());
            }
            dos.close();
            fos.close();
        } catch (IOException ioe) {
            System.out.println("Excepción de entrada/salida");
        }
    }

    public static void leer() {
        System.out.println("Leyendo el archivo");
        try {
            FileInputStream fis = new FileInputStream(destino);
            DataInputStream dis = new DataInputStream(fis);
            int enteros = fis.available()/Integer.BYTES;
            for (int i = 1; i <= enteros; i++) {
                System.out.print(dis.readInt()+" ");
            }
            dis.close();
            fis.close();
        } catch (EOFException e) {
            System.out.println("Fin de Fichero");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
