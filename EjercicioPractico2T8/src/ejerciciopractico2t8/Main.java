/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico2t8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] vector = new int[100];
        int suma = 0;
        int mayor = 0;
        int menor = 100;
        for (int i = 0; i < 100; i++) {
            vector[i] = (int) (Math.random() * 71 + 10);
            suma += vector[i];
            if (vector[i] > mayor) {
                mayor = vector[i];
            } else if (vector[i] < menor) {
                menor = vector[i];
            }
        }
        double media = (double) suma / vector.length;
        java.util.Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
    }
}
