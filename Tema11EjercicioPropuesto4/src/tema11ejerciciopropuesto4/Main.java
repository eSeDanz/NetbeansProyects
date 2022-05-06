/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejerciciopropuesto4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int filas;
            System.out.print("Introduce el tamaño de lado del cuadrado: ");
            filas = sc.nextInt();
            for (int i = 1; i <= filas; i++) {
                for (int k = 1; k <= filas - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= filas; j++) {
                    if (i >= j) {
                        System.out.print(trianguloRecursivo(i, j) + " ");
                    }
                }
                System.out.println("");
            }
        } catch (InputMismatchException f1){
            System.out.println("Error en el tipo de datos introducidos");
        }
    }

    
    public static int trianguloRecursivo(int fila, int columna) {
        if (columna == 1) {
            return 1;
        } else if (fila < columna) {
            return 0;
        } else {
            return trianguloRecursivo(fila - 1, columna) + trianguloRecursivo(fila - 1, columna - 1);
        }
    }
}

//1000
//1100
//1210
//1331
