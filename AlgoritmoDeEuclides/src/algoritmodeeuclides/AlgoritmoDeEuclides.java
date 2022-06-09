/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmodeeuclides;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlgoritmoDeEuclides {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = 0;
        do {
            try {
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextInt();
                if (num1 <= 0) {
                    System.out.println("El número tiene que ser mayor a 0");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Error en el tipo de datos introducidos");
                sc.nextLine();
            }
        } while (num1 <= 0);
        int num2 = 0;
        do {
            try {
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextInt();
                if (num2 <= 0) {
                    System.out.println("El número tiene que ser mayor a 0");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Error en el tipo de datos introducidos");
                sc.nextLine();
            }
        } while (num2 <= 0);

        System.out.println("CALCULANDO MCD");
        System.out.println("**************");
        System.out.println("EL MCD de " + num1 + " y " + num2 + " es igual a " + MCD(num1, num2));

    }

    public static int MCD(int num1, int num2) {
        if (num1 == num2) {
            return num1;
        } else if (num1 > num2) {
            num1 = num1 - num2;
            return MCD(num1, num2);
        } else {
            num2 = num2 - num1;
            return MCD(num1, num2);
        }
    }
}
