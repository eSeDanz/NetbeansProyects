/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//import java.util.Scanner.Us

public class Main {

    static ArrayList<Alumno> array = new ArrayList<>();

    public static void main(String[] args) {
        rellenarArray();
        mostrarArray();
        ordenarNota();
        mostrarArray();
        ordenarAlfa();
        mostrarArray();

    }

    public static void rellenarArray() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double nota;
        char resp;
        Alumno f1;
        do {
            System.out.print("Introduce el nombre del alumno: ");
            nombre = sc.nextLine();
            System.out.print("Introduce la nota del alumno: ");
            nota = sc.nextDouble();
            f1 = new Alumno(nombre, nota);
            array.add(f1);
            System.out.print("Quieres seguir introduciendo alumnos? (S/N): ");
            resp = sc.next().charAt(0);
            sc.nextLine();
        } while (resp == 'S' || resp == 's');
        System.out.println("");
    }

    public static void mostrarArray() {
        for (Alumno a : array) {
            System.out.println(a.toString());
        }
        System.out.println("");
    }

    public static void ordenarNota() {
        /*        Collections.sort(array, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno f1, Alumno f2) {
                if (f1.getNota() > f2.getNota()) {
                    return 1;
                }
                if (f1.getNota() < f2.getNota()) {
                    return -1;
                }
                return 0;
                
            }
        });*/
        Collections.sort(array, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno f1, Alumno f2) {
                return Double.valueOf(f1.getNota()).compareTo(f2.getNota());
            }
        });
        System.out.println("Ordenar por nota:");
    }

    public static void ordenarAlfa() {
        Collections.sort(array, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno f1, Alumno f2) {
                return f1.getNombre().compareTo(f2.getNombre());
            }
        });
        System.out.println("Ordenar Alfabeticamente: ");
    }
}
