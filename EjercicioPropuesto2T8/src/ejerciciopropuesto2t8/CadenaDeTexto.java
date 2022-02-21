/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto2t8;

import java.util.Scanner;


public class CadenaDeTexto {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cadena;
        String[] array;
        System.out.print("Introduce una cadena de texto para imprimirla en líneas distintas: ");
        cadena=sc.nextLine();
        array=cadena.split(" ");
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
    
}
