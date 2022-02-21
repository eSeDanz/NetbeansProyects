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
        return vectoraux;
    }
    
    public static void elementoMasRepetido() {
        int elemento=0;
        for(int i=0; i<vectoraux.length; i++) {
            if (vectoraux[i]>elemento) {
                elemento=vectoraux[i];
            }
        }
        for(int i=0; i<vectoraux.length; i++) {
            if (vectoraux[i]==elemento) {
                System.out.println("El elemento mas repetido es el "+i+" y aparece repetido "+vectoraux[i]+" veces");
            }
        }
    }
}
