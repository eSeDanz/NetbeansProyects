/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5supuestopractico4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, operacion;
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Estas son las operaciones disponibles:\n" + "1. Suma\n" + "2. Resta\n" + "3. Multiplicación\n" + "4. División\n" + "5. Potencia");
        System.out.print("Que operación quieres realizar? ");
        operacion = sc.nextInt();
        switch (operacion) {
            case 1:
                System.out.println("La suma es igual a " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es igual a " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicación es igual a " + (num1 * num2));
                break;
            case 4:
                System.out.println("La división es igual a " + (num1 / num2));
                break;
            case 5:
                System.out.println("La potencia es igual a " + (int) Math.pow(num1, num2));
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}
