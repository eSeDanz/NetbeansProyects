/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricamonedatimbre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestDinero {

    private static ArrayList<Dinero> dineros = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        crearObjetos();
        crearObjetos();
        mostrarPorPantalla();
    }

    public static void crearObjetos() {
        String timbre;
        double valor;
        int anyoEmi;
        double altura;
        double anchura;
        double diametro;
        double peso;
        System.out.println("CREACIÓN DE UN OBJETO");
        System.out.println("*********************");
        do {
            System.out.print("Introduce el tipo de timbre que quieres crear (moneda/billete): ");
            timbre = sc.next();
            if (!timbre.equalsIgnoreCase("moneda") && !timbre.equalsIgnoreCase("billete")) {
                System.out.println("La respuesta introducida no es correcta");
            }
        } while (!timbre.equalsIgnoreCase("moneda") && !timbre.equalsIgnoreCase("billete"));
        if (timbre.equalsIgnoreCase("moneda")) {
            System.out.print("Introduce el valor: ");
            valor = sc.nextDouble();
            System.out.print("Introduce el año de emisión: ");
            anyoEmi = sc.nextInt();
            System.out.print("Introduce el diametro: ");
            diametro = sc.nextDouble();
            System.out.print("Introduce el peso: ");
            peso = sc.nextDouble();
            Moneda m1 = new Moneda(diametro, peso, valor, anyoEmi);
            dineros.add(m1);
            System.out.println("Moneda añadida en el ArrayList\n");
        } else {
            System.out.print("Introduce el valor: ");
            valor = sc.nextDouble();
            System.out.print("Introduce el año de emisión: ");
            anyoEmi = sc.nextInt();
            System.out.print("Introduce la altura: ");
            altura = sc.nextDouble();
            System.out.print("Introduce la anchura: ");
            anchura = sc.nextDouble();
            Billete b1 = new Billete(altura, anchura, valor, anyoEmi);
            dineros.add(b1);
            System.out.println("Billete añadido en el ArrayList\n");
        }
    }

    public static void mostrarPorPantalla() {
        if (dineros.isEmpty()) {
            System.out.println("No hay elementos que mostrar");
        } else {
            for (Dinero elemento : dineros) {
                System.out.println(elemento.toString());
                System.out.println("");
            }
        }
    }

    public static void comprobarDuplicados() {
        if (!dineros.isEmpty()) {
            HashMap<Dinero, Integer> duplicados;
            
        } else {
            System.out.println("No hay elementos en la colección");
        }
    }
}
