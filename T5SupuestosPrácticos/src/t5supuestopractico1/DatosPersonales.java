/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5supuestopractico1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class DatosPersonales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ape1, ape2, nombre;
        System.out.print("Introduce tu primer apellido: ");
        ape1 = sc.nextLine();
        System.out.print("Introduce tu segundo apellido: ");
        ape2 = sc.nextLine();
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.println(nombre + " " + ape1 + " " + ape2);
    }
}
