/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico1t8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] numeros = new int[100];
        int suma = 0;
        for (int i= 0; i<100; i++) {
            numeros[i]= i+1;
            suma += i+1;
        }
        double media = (double) suma/numeros.length;
        for (int elemento: numeros) {
            System.out.print(elemento + " ");
        }
        System.out.println("\nSuma = " + suma);
        System.out.println("Media = " + media);
    }
    
}
