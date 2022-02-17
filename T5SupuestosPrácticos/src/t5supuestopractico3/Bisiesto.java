/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5supuestopractico3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Bisiesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Introduce un año para calcular si es bisiesto: ");
        año = sc.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 4 == 0 && año % 100 == 0 && año % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
