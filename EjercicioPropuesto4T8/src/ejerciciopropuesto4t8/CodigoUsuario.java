/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto4t8;

import java.util.Scanner;


public class CodigoUsuario {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre;
        String ape1;
        String ape2;
        System.out.println("Vamos a generar el código de usuario");
        System.out.println("************************************");
        System.out.print("Introduce un nombre: ");
        nombre=sc.nextLine();
        System.out.print("Introduce primer apellido: ");
        ape1=sc.nextLine();
        System.out.print("Introduce segundo apellido: ");
        ape2=sc.nextLine();        
        System.out.println("El codigo de usuario es: "+nombre.substring(0, 3).concat(ape1.substring(0, 3)).concat(ape2.substring(0, 3)).toUpperCase());
    }        
}
