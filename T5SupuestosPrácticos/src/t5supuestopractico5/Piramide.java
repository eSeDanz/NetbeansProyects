/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5supuestopractico5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Piramide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        for (int altura = 1; altura <= numFilas; altura++) {
            //Espacios en blanco
            for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
                System.out.print(" ");
            }
            //Asteriscos
            for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
