/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico4t8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int FILAS=4;
    private static final int COLUMNAS=4;
    private static Scanner sc = new Scanner(System.in);        
    
    public static void main(String[] args) {
        int [][] matriz;
        matriz=rellenarArray();
        mostrarMatriz(matriz);
        sumaFilas(matriz);
    }
    
    public static void mostrarMatriz(int [][] m) {
        System.out.println("");
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }   
    
    public static int[][] rellenarArray() {
        System.out.println("Rellena la matriz de números");
        int[][] array = new int[FILAS][COLUMNAS];
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[0].length; j++) {
                System.out.print("Introduzca número "+ i + ", "+ j+": ");
                array[i][j] = sc.nextInt();                
            }
        }
        return array;
    }
    
    public static void sumaFilas(int [][] m) {
        int fila;
        int suma=0;
        do {
        System.out.print("Introduce la fila que quieres sumar: ");
        fila= sc.nextInt();
        if (fila>m[fila].length||fila<0) {
        System.out.println("Te has pasado con la fila");
        }} while (fila>=m[fila].length||fila<0);
        for (int j=0;j<m[fila].length;j++) {
            suma += m[fila][j];
        }
        System.out.println("La suma de la fila "+fila+" es "+suma);
    }
    
    public static void sumaColumnas(int [][] m) {
        
    }
}
