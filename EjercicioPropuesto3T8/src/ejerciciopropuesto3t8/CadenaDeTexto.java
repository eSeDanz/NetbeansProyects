/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto3t8;

import java.util.Scanner;

public class CadenaDeTexto {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cadena;
        String cadena2;
        System.out.print("Introduce una cadena de texto: ");
        cadena=sc.nextLine();
        System.out.print("Introduce una cadena de texto para compararla con la anterior: ");
        cadena2=sc.nextLine();
        if (cadena.equalsIgnoreCase(cadena2)) {
            System.out.println("Las dos cadenas son iguales");   
        } else {
            System.out.println("Las dos cadenas son distintas");
        }
    }
    
}
