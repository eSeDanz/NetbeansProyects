/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejerciciopropuesto2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int pos;
            System.out.print("Introduce el fibonacci que quieres calcular: ");
            pos = sc.nextInt();
            for (int i = 1; i <= pos; i++) {
                System.out.print(fibonacci_iterativo(i) + " ");
            }
            System.out.println("");
            for (int i = 1; i <= pos; i++) {
                System.out.print(fibonacci_recursivo(i) + " ");
            }
        } catch (InputMismatchException f1) {
            System.out.println("Error en el tipo de datos introducidos");
        }
    }

    public static int fibonacci_recursivo(int posicion) {
        if (posicion == 1) {
            return 0;
        } else if (posicion == 2) {
            return 1;
        } else {
            return fibonacci_recursivo(posicion - 1) + fibonacci_recursivo(posicion - 2);
        }
    }

    public static int fibonacci_iterativo(int posicion) {
        int ultimo = 1, penultimo = 0, fib = 0;
        if (posicion == 1) {
            return 0;
        } else if (posicion == 2) {
            return 1;
        }

        for (int i = 3; i <= posicion; i++) {
            fib = ultimo + penultimo;
            penultimo = ultimo;
            ultimo = fib;
        }
        return fib;
    }
}
