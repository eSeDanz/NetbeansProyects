/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejerciciopropuesto3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int lado;
            System.out.print("Introduce el tamaño de lado del cuadrado: ");
            lado = sc.nextInt();
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= lado; j++) {
                    System.out.print(cuadradoRecursivo(i, j) + "\t");
                }
                System.out.println("");
            }
        } catch (InputMismatchException f1) {
            System.out.println("Error en el tipo de datos introducidos");
        }
    }

    public static int cuadradoRecursivo(int fila, int columna) {
        if (fila == 1 || columna == 1) {
            return 1;
        } else {
            return cuadradoRecursivo(fila - 1, columna) + cuadradoRecursivo(fila, columna - 1);
        }
    }
}
