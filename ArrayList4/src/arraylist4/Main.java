/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static ArrayList<Persona> array = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        rellenarArray();
        mostrarMenu();       
    }
    
    public static void mostrarMenu() {                
        int accion;
        do {
            System.out.println("ACCIONES");
            System.out.println("--------");
            System.out.println("1. Buscar persona por DNI");
            System.out.println("2. Eliminar persona por DNI");
            System.out.println("3. Ordenar por apellidos");
            System.out.println("4. Mostrar todas las personas");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Introduce el número de acción a realizar: ");
            accion = sc.nextInt();
            switch (accion) {
                case 1:
                    buscarPorDNI();
                    break;
                case 2:
                    eliminarPorDNI();
                    break;
                case 3:
                    ordenarPorApellidos();
                    break;
                case 4:
                    mostrarArray();
                    break;
                case 5:
                    System.out.println("Hasta Luego\n");
                    break;
                default:
                    System.out.println("El número introducido no corresponde con ninguna acción\n");
                    break;
            }
        } while (accion != 5);
    }
    
    public static void rellenarArray() {        
        String dni;
        String nombre;
        String apellidos;
        char sexo;
        int edad;
        double peso;
        char resp;
        Persona f1;
        do {
            System.out.print("Introduce el DNI: ");
            dni = sc.nextLine();
            System.out.print("Introduce el nombre: ");
            nombre = sc.nextLine();
            System.out.print("Introduce los apellidos: ");
            apellidos = sc.nextLine();
            System.out.print("Introduce el sexo: ");
            sexo = sc.next().charAt(0);
            System.out.print("Introduce la edad: ");
            edad = sc.nextInt();
            System.out.print("Introduce el peso: ");
            peso = sc.nextDouble();
            f1 = new Persona(dni, apellidos, nombre, sexo, edad, peso);
            array.add(f1);
            System.out.print("Quieres seguir introduciendo alumnos? (S/N): ");
            resp = sc.next().charAt(0);
            sc.nextLine();
        } while (resp == 'S' || resp == 's');
        System.out.println("");
    }
    
    public static void mostrarArray() {
        for (Persona a : array) {
            System.out.println(a.toString());
        }
        System.out.println("");
    }
    
    public static void ordenarPorApellidos() {
        Collections.sort(array, new Comparator<Persona>() {
            @Override
            public int compare(Persona f1, Persona f2) {
                return f1.getApellidos().compareTo(f2.getApellidos());
            }
        });
        System.out.println("Ordenar Alfabeticamente: ");
    }
    
    public static void buscarPorDNI() {
        System.out.print("Introduce el DNI: ");
        String dni = sc.next();
        int posicion;
        for (Persona p: array) {
            if (p.getDni().equals(dni)) {
                System.out.println("Se ha encontrado el DNI en la persona " +p.toString());
            } 
//            else {
//               System.out.println("No se ha encontrado el DNI en la persona " + p);
//           }
        }
        System.out.println("");
    }
    
    public static void eliminarPorDNI() {
        System.out.print("Introduce el DNI: ");
        String dni = sc.next();
        int posicion;
        for (Persona p: array) {
            if (p.getDni().equals(dni)) {
                array.remove(p);
            } else {
                System.out.println("No se ha encontrado el DNI");
            }
        }
    }
}
