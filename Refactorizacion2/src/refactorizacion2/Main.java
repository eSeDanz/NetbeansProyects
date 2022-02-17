/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refactorizacion2;

import java.util.Scanner;

public class Main {

    private static final int TAM = 10;

    public static void main(String[] args) {
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        int[] c = new int[a.length + b.length];
        
        System.out.println("\nLeyendo la tabla a");
        rellenarArray(a);
        System.out.println("\nLeyendo la tabla b");
        rellenarArray(b);
        combinarTabla(a,b,c);
        System.out.println("\nLa tabla c queda asi:");
        mostrarTabla(c);

    }

    public static void rellenarArray(int[] v) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduce el numero en la posicion " + i + ": ");
            v[i] = sc.nextInt();
        }
    }

    public static void combinarTabla(int[] a, int[] b, int[] c) {
        int j = 0;
        for (int i = 0; i < TAM; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
    }

    public static void mostrarTabla(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        } System.out.println("");
    }
}
