/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refactorizacion1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cuadrado;
        do {
            System.out.print("Introduzca un número: ");
            num=sc.nextInt();
            cuadrado=num*num;
            System.out.println("El cuadrado de "+num+" es "+cuadrado);
        } while (num>=0);
        System.out.println("¡Hasta pronto!");       
    }
}
