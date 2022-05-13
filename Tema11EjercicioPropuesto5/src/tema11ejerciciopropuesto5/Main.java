/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejerciciopropuesto5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean error = false;
        String s = "Introduce ";
        do {
            try {
                int filas;
                int suma = 0;

                System.out.print(s+"el numero de filas: ");
                filas = sc.nextInt();
                System.out.println("");

                for (int i = 1; i <= filas; i++) {
                    for (int k = 1; k <= filas - i; k++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {

                        System.out.print(trianguloRecursivo(i, j) + " ");
                        suma += trianguloRecursivo(i, j);
                    }
                    System.out.println("");
                }
                System.out.println("\nLa suma total de los números en la piramide es igual a " + suma);
            } catch (InputMismatchException f1) {
                System.out.println("Error en el tipo de datos introducidos");
                error = true;
                sc.nextLine();
                s="Vuelve a introducir ";
            }
        } while (error);

    }

    public static int trianguloRecursivo(int fila, int columna) {
        if (columna == 1) {
            return 1;
        } else if (columna == 0) {
            return 0;
        } else if (columna > 2 * fila - 1) {
            return 0;
        } else {
            return trianguloRecursivo(fila - 1, columna) + trianguloRecursivo(fila - 1, columna - 1) + trianguloRecursivo(fila - 1, columna - 2);
        }
    }
}
