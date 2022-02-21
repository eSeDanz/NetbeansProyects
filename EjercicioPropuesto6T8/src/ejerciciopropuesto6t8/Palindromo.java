/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto6t8;

import java.util.Scanner;

public abstract class Palindromo {

    private static Scanner sc = new Scanner(System.in);
    private static String fraseoriginal;
    private static String frase;

    public static void main(String[] args) {
        pedirFrase();
        frase = fraseoriginal;
        frase = formatear(frase);
        if (frase.equalsIgnoreCase(invertir(frase))) {
            System.out.println("La frase '" + fraseoriginal + "' es un palíndromo");
        } else {
            System.out.println("La frase '" + fraseoriginal + "' no es un palíndromo");
        }
    }

    private static String pedirFrase() {
        do {
            System.out.print("Introduce la frase para comprobar si es palíndromo: ");
            fraseoriginal = sc.nextLine();
            if (fraseoriginal.trim().equals("")) {
                System.out.println("Escribe algo bandido!");
            }
        } while (fraseoriginal.trim().equals(""));
        return fraseoriginal;
    }

    private static String formatear(String frase) {
        return frase.replace(" ", "");
    }

    private static String invertir(String frase) {
        String invertir = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertir += frase.charAt(i);
        }
        return invertir;
    }
}
