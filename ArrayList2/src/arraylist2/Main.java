/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Double> array = new ArrayList<>();

    public static void main(String[] args) {

        int accion;
        do {
            mostrarMenu();
            accion = sc.nextInt();
            switch (accion) {
                case 1:
                    agregarNum();
                    break;
                case 2:
                    buscarNum();
                    break;
                case 3:
                    modificarNum();
                    break;
                case 4:
                    eliminarNum();
                    break;
                case 5:
                    insertarEnPosicion();
                    break;
                case 6:
                    mostrarElementos();
                    break;
                case 7:
                    ordenarAscendentemente();
                    break;
                case 8:
                    ordenarDescendentemente();
                    break;
                case 9:
                    System.out.println("Hasta Luego\n");
                    break;
                default:
                    System.out.println("El número introducido no corresponde con ninguna acción\n");
                    break;
            }
        } while (accion != 9);

    }

    public static void mostrarMenu() {
        System.out.println("ACCIONES");
        System.out.println("--------");
        System.out.println("1. Agregar un número");
        System.out.println("2. Buscar un número");
        System.out.println("3. Modificar un número");
        System.out.println("4. Eliminar un número");
        System.out.println("5. Insertar un número en la posición dada");
        System.out.println("6. Mostrar los elementos");
        System.out.println("7. Ordenar ascendentemente los elementos");
        System.out.println("8. Ordenar descendentemente los elementos");
        System.out.println("9. Salir");
        System.out.print("\nIntroduce una acción: ");
    }

    public static void agregarNum() {
        double elemento;
        System.out.print("Introduce el elemento a insertar al final de la lista: ");
        elemento = sc.nextDouble();
        array.add(elemento);
        System.out.println(array);
        System.out.println("");
    }

    public static void buscarNum() {
        double elemento;
        int posicion;
        System.out.print("Indica el elemento a buscar: ");
        elemento = sc.nextDouble();
        posicion = array.indexOf(elemento);
        if (posicion == -1) {
            System.out.println("No se ha encontrado el elemento en la colección");
        } else {
            System.out.println("El elemento se ha encontrado en la posicion: " + posicion);
        }
    }

    public static void modificarNum() {
        double elemento;
        double nuevoElemento;
        int posicion;
        System.out.print("Indica el elemento a modificar: ");
        elemento = sc.nextDouble();
        posicion = array.indexOf(elemento);
        if (posicion == -1) {
            System.out.println("No se ha encontrado el elemento en la colección");
        } else {
            System.out.print("Introduce el nuevo valor para modificar el anterior elemento: ");
            nuevoElemento = sc.nextDouble();
            array.set(posicion, nuevoElemento);
        } System.out.println(array);
        System.out.println("");
    }

    public static void eliminarNum() {
        double elemento;
        int posicion;
        System.out.print("Indica el elemento a eliminar: ");
        elemento = sc.nextDouble();
        posicion = array.indexOf(elemento);
        if (posicion == -1) {
            System.out.println("No se ha encontrado el elemento en la colección");
        } else {
            array.remove(posicion);
        } System.out.println(array);
        System.out.println("");
    }

    public static void insertarEnPosicion() {
        double elemento;
        int posicion;
        System.out.print("Indica el elemento a insertar: ");
        elemento = sc.nextDouble();
        System.out.print("Indica la posicion donde insertar el elemento: ");
        posicion = sc.nextInt();
        if (posicion > array.size()) {
            System.out.println("La posicion esta fuera de rango");
        } else {
            array.add(posicion, elemento);
        } System.out.println(array);
        System.out.println("");
    }

    public static void mostrarElementos() {
        if (array.isEmpty()) {
            System.out.println("El array esta vacio");
        } else {
            System.out.println(array);
        } System.out.println("");
    }

    public static void ordenarAscendentemente() {
        Collections.sort(array);
        System.out.println(array);
        System.out.println("");
    }

    public static void ordenarDescendentemente() {
        Collections.sort(array);
        Collections.reverse(array);
        System.out.println(array);
        System.out.println("");
    }
    
//      public static void ordenarDescendentemente() {
//      Comparator<Double> comparador = Collections.reverseOrder();
//      Collections.sort(array, comparador);
//      System.out.println(array);
//      System.out.println("");    
//      }

}
