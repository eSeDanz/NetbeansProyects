/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto83t8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String alumno;
        int pos;
        int operacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de gestión de alumnos Dropersanz\n");
        String array[] = crearArray();
        System.out.println(Arrays.toString(array)+"\n");
        do {
            System.out.print("0.Salir\n1.Anyadir\n2.Insertar en posición\n3.Eliminar por nombre\n4.Eliminar por posición \n5.Ordenar\n\nQue operacion quieres realizar? ");
            operacion = sc.nextInt();
            sc.nextLine();
            switch (operacion) {

                case 0:
                    System.out.println("Hasta la vista Baby");
                    break;
                case 1: //Añadir
                    System.out.println("Añadir");
                    System.out.print("Que alumno quieres añadir? ");
                    alumno = sc.nextLine();
                    array = anyadir(array, alumno);
                    System.out.println(Arrays.toString(array)+"\n");
                    break;
                case 2: //Insertar en Posicion
                    System.out.println("Insertar en Posicion");
                    System.out.print("Que alumno quieres insertar? ");
                    alumno = sc.nextLine();
                    System.out.print("En que posición lo quieres insertar? ");
                    pos = sc.nextInt();
                    sc.nextLine();
                    array = insertar(array, alumno, pos);
                    System.out.println(Arrays.toString(array)+"\n");
                    break;
                case 3: //Eliminar por nombre
                    System.out.println("Eliminar por nombre");
                    System.out.print("Que alumno quieres eliminar? ");
                    alumno = sc.nextLine();
                    array = eliminarPorNombre(array, alumno);
                    System.out.println(Arrays.toString(array)+"\n");
                    break;
                case 4: //Eliminar por posicion
                    System.out.println("Eliminar por posicion");
                    System.out.print("Que posición de alumno quieres eliminar? ");
                    pos = sc.nextInt();
                    sc.nextLine();
                    array = eliminar(array, pos);
                    System.out.println(Arrays.toString(array)+"\n");
                    break;
                case 5: //Ordenar
                    System.out.println("Ordenar alfabeticamente");
                    array = ordenar(array);
                    System.out.println(Arrays.toString(array)+"\n");
                    break;
            }
        } while (operacion != 0);

    }

    public static String[] eliminar(String[] array, int posicion) {
        if (posicion >= 0 && posicion < array.length) {
            String[] nuevoarray = new String[array.length - 1];
            System.arraycopy(array, 0, nuevoarray, 0, posicion);
            System.arraycopy(array, posicion + 1, nuevoarray, posicion, nuevoarray.length - posicion);
            return nuevoarray;
        }
        return array;
    }

    public static String[] eliminarPorNombre(String[] array, String elemento) {
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                pos = i;
            }
        }
        if (pos == -1) {
            return array;
        } else {
            String[] nuevoarray = new String[array.length - 1];
            System.arraycopy(array, 0, nuevoarray, 0, pos);
            System.arraycopy(array, pos + 1, nuevoarray, pos, nuevoarray.length - pos);
            return nuevoarray;
        }
    }

    public static String[] eliminarpornombre(String[] array, String elemento) {
        String[] nuevoarray = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(elemento)) {
                nuevoarray[j] = array[i];
                j++;
            }
        }
        return nuevoarray;
    }

    public static String[] insertar(String[] array, String elemento, int posicion) {
        String[] nuevoarray = new String[array.length + 1];
        if (posicion > nuevoarray.length) {
            System.out.println("La posición esta fuera de rango");
            return array;
        }else
        System.arraycopy(array, 0, nuevoarray, 0, posicion);
        nuevoarray[posicion] = elemento;
        System.arraycopy(array, posicion, nuevoarray, posicion + 1, array.length - posicion);        
        return nuevoarray;
    }

    public static String[] anyadir(String[] array, String elemento) {
        String[] nuevoarray = new String[array.length + 1];
        System.arraycopy(array, 0, nuevoarray, 0, array.length);
        nuevoarray[array.length] = elemento;
        return nuevoarray;
    }

    public static String[] ordenar(String[] array) {
        java.util.Arrays.sort(array);
        return array;
    }

    public static String[] crearArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos alumnos hay en la clase? ");
        int alumnos = sc.nextInt();
        sc.nextLine();
        String[] array = new String[alumnos];
        for (int i = 1; i <= alumnos; i++) {
            System.out.print("Introduce el nombre del alumno " + i + ": ");
            String alumno = sc.nextLine();
            array[i - 1] = alumno;
        }
        return array;
    }

}
