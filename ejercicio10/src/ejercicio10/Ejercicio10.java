/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinero;
        System.out.println("Cuanto dinero quieres cambiar? ");
        dinero = sc.nextInt();
        int quini = dinero / 500;
        dinero %= 500;
        int dosci = dinero / 200;
        dinero %= 200;
        int cien = dinero / 100;
        dinero %= 100;
        int cincu = dinero / 50;
        dinero %= 50;
        int veinte = dinero / 20;
        dinero %= 20;
        int diez = dinero / 10;
        dinero %= 10;
        int cinco = dinero / 5;
        dinero %= 5;
        int dos = dinero / 2;
        dinero %= 2;
        if (quini > 1) {
            System.out.println(quini + " billetes de 500");
        } else if (quini == 1) {
            System.out.println(quini + " billete de 500");
        }
        if (dosci > 1) {
            System.out.println(dosci + " billetes de 200");
        } else if (dosci == 1) {
            System.out.println(dosci + " billete de 200");
        }
        if (cien == 1) {
            System.out.println(cien + " billete de 100");
        }
        if (cincu == 1) {
            System.out.println(cincu + " billete de 50");
        }
        if (veinte > 1) {
            System.out.println(veinte + " billetes de 20");
        } else if (veinte == 1) {
            System.out.println(veinte + " billete de 20");
        }
        if (diez == 1) {
            System.out.println(diez + " billete de 10");
        }
        if (cinco == 1) {
            System.out.println(cinco + " billete de 5");
        }
        if (dos > 1) {
            System.out.println(dos + " monedas de 2");
        } else if (dos == 1) {
            System.out.println(dos + " moneda de 2");
        }
        if (dinero == 1) {
            System.out.println(dinero + " moneda de 1");
        }
    }
}