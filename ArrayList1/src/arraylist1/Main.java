/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = leerValores();
        int suma = calcularSuma(array);
        double media = (double) suma / array.size();
        mostrarResultados(array, suma, media);
    }

    public static ArrayList<Integer> leerValores() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int valor;
        do {
            System.out.print("Introduce los valores del ArrayList de uno en uno: ");
            valor = sc.nextInt();
            if (valor != -99) {
                array.add(valor);
            }
        } while (valor != -99);
        return array;
    }

    public static int calcularSuma(ArrayList<Integer> x) {
        int suma = 0;
        Iterator<Integer> itr = x.iterator();
        while (itr.hasNext()) {
            suma += itr.next();
        }
        return suma;
//        for (int i=0; i<x.size();i++)
//            suma+= x.get(i);
    }

    public static void mostrarResultados(ArrayList<Integer> y, int suma, double media) {
        System.out.println("");
        System.out.println("Valores del ArrayList");
        System.out.println("---------------------");
        System.out.println(y);
        System.out.println("");
        System.out.println("Suma: " + suma);
        System.out.println("");
        System.out.println("Media: " + media);
        System.out.println("");
        System.out.println("Números superiores a la media:");
        System.out.println("------------------------------");
        for (int i = 0; i < y.size(); i++) {
            if (y.get(i) > media) {
                System.out.print(y.get(i) + " ");
            }
        }
    }
}
