/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto9t8;

import java.util.Arrays;

public class Vector {

    private static int[] vector;

    public static void main(String[] args) {
        vector = crearVector();
        mostrarNoAlmacenados();
    }

    public static int[] crearVector() {
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100 + 1);
        }
        java.util.Arrays.sort(vector);
        System.out.println("Vector Generado: ");
        System.out.println(Arrays.toString(vector));
        System.out.println("");
        return vector;
    }

    public static void mostrarNoAlmacenados() {
        int[] vectoraux= new int[101];
        for (int i=0; i<vector.length;i++) {
            vectoraux[vector[i]]++;
        }
        String frase="Los números que no han sido almacenados son los siguientes: ";
        for (int i=1; i<vectoraux.length;i++) {
            if(vectoraux[i]==0) {
                frase+=i+" ";
            }
        }
        System.out.println(frase);
    }
}
