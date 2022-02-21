/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto8t8;

import java.util.Arrays;

public class Vector {

    private static int[] vector = new int[100];
    private static int[] vectoraux;
    
    public static void main(String[] args) {
        generarArray();
        vectoraux = generarVectorAux();
        elementoMasRepetido();
    }

    public static void generarArray() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 71 + 10);
        }
        java.util.Arrays.sort(vector);
        System.out.println("Vector generado: ");
        System.out.println(Arrays.toString(vector));
    }

    public static int[] generarVectorAux() {
        int[] vectoraux = new int[81];
        for (int i = 0; i < vector.length; i++) {
            vectoraux[vector[i]]++;
        }
        System.out.println("Vector auxiliar: ");
        System.out.println(Arrays.toString(vectoraux));
        System.out.println("");
        return vectoraux;
    }
    
    public static void elementoMasRepetido() {
        int mayorelemento=0;
        for(int i=0; i<vectoraux.length; i++) {
            if (vectoraux[i]>mayorelemento) {
                mayorelemento=vectoraux[i];
            }
        }
        String frase="El elemento más repetido aparece "+mayorelemento+" veces y es el ";
        for(int i=0; i<vectoraux.length; i++) {
            if (vectoraux[i]==mayorelemento) {
                frase+=i+" ";
//                System.out.println("El elemento mas repetido es el "+i+" y aparece repetido "+vectoraux[i]+" veces");
            }
        }
        System.out.println(frase);
    }
}
