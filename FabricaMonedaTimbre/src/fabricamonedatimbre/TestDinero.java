/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricamonedatimbre;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDinero {

    private static ArrayList<Dinero> dineros = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Billete b1 = new Billete(5.2, 12.5, 10, 1986);
        Moneda m1 = new Moneda(24.5, 7, 1, 2001);

    }

    public void crearObjetos() {
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
            if (!timbre.equalsIgnoreCase("moneda") || !timbre.equalsIgnoreCase("billete")) {
                System.out.println("La respuesta introducida no es correcta");
            }
        } while (!timbre.equalsIgnoreCase("moneda") || !timbre.equalsIgnoreCase("billete"));
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
        }
    }
}
