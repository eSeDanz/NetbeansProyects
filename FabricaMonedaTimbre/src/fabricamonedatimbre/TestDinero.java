/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricamonedatimbre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDinero {

    private static ArrayList<Dinero> dineros = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        dineros.add(new Moneda(5, 2022, 20, 4));
        dineros.add(new Moneda(50, 1970, 200, 400));
        dineros.add(new Billete(5, 2022, 20, 4));
        dineros.add(new Billete(50, 1970, 200, 400));
        menu();
    }

    public static void menu() {
        int opcion = -1;
        do {
            try {
                System.out.print("Opción 1: Crear Objetos\n"
                        + "Opción 2: Mostrar Objetos\n"
                        + "Opción 3: Comprobar duplicados\n"
                        + "Opción 4: Ordenar Objetos\n"
                        + "Opción 5: Crear copia del objeto\n"
                        + "Opción 6: Buscar objetos\n"
                        + "Opción 7: Modificar atributos\n"
                        + "Opción 8: Eliminar objetos\n"
                        + "Opción 9: Salir\n"
                        + "Introduce la opción del menú: ");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        crearObjetos();
                        break;
                    case 2:
                        mostrarPorPantalla();
                        break;
                    case 3:
                        comprobarDuplicados();
                        break;
                    case 4:
                        ordenarArray();
                        break;
                    case 5:
                        copiarObjeto();
                        break;
                    case 6:
                        buscar();
                        break;
                    case 7:
                        modificarAtributos();
                        break;
                    case 8:
                        eliminarObjetos();
                        break;
                    case 9:
                        System.out.println("Hasta luego");
                        break;
                    default:
                        System.out.println("Te has equivocado de número...");
                }
            } catch (InputMismatchException ioe) {
                System.out.println("Error en los datos introducidos");
                sc.nextLine();
            } catch (IndexOutOfBoundsException ioobe){
                System.out.println("Has puesto una posicion incorrecta");
            }
        } while (opcion != 9);

    }

    public static void crearObjetos() {
        String timbre;
        double valor;
        int anyoEmi;
        double altura;
        double anchura;
        double diametro;
        double peso;
        System.out.println("CREACIÓN DE UN OBJETO");
        System.out.println("*********************");
        do {
            System.out.print("Introduce el tipo de timbre que quieres crear (moneda/billete): ");
            timbre = sc.next();
            if (!timbre.equalsIgnoreCase("moneda") && !timbre.equalsIgnoreCase("billete")) {
                System.out.println("La respuesta introducida no es correcta");
            }
        } while (!timbre.equalsIgnoreCase("moneda") && !timbre.equalsIgnoreCase("billete"));
        if (timbre.equalsIgnoreCase("moneda")) {
            System.out.print("Introduce el valor: ");
            valor = sc.nextDouble();
            System.out.print("Introduce el año de emisión: ");
            anyoEmi = sc.nextInt();
            System.out.print("Introduce el diametro: ");
            diametro = sc.nextDouble();
            System.out.print("Introduce el peso: ");
            peso = sc.nextDouble();
            Moneda m1 = new Moneda(valor, anyoEmi, diametro, peso);
            dineros.add(m1);
            System.out.println("Moneda añadida en el ArrayList\n");
        } else {
            System.out.print("Introduce el valor: ");
            valor = sc.nextDouble();
            System.out.print("Introduce el año de emisión: ");
            anyoEmi = sc.nextInt();
            System.out.print("Introduce la altura: ");
            altura = sc.nextDouble();
            System.out.print("Introduce la anchura: ");
            anchura = sc.nextDouble();
            Billete b1 = new Billete(valor, anyoEmi, altura, anchura);
            dineros.add(b1);
            System.out.println("Billete añadido en el ArrayList\n");
        }
    }

    public static void mostrarPorPantalla() {
        if (dineros.isEmpty()) {
            System.out.println("No hay elementos que mostrar");
        } else {
            int i = 0;
            for (Dinero elemento : dineros) {
                System.out.println("(" + i + ") " + elemento.toString());
                i++;
                System.out.println("");
            }
        }
    }

    public static void comprobarDuplicados() {
        if (!dineros.isEmpty()) {
            HashMap<Dinero, Integer> duplicados = new HashMap<>();
            for (int i = 0; i < dineros.size(); i++) {
                int contador = 1;
                for (int j = i + 1; j < dineros.size(); j++) {
                    if (dineros.get(i).equals(dineros.get(j))) {
                        contador++;
                        duplicados.put(dineros.get(i), contador);
                    }
                }
            }
            if (!duplicados.isEmpty()) {
                for (Dinero d : duplicados.keySet()) {
                    System.out.println(d.toString());
                    System.out.println("Número de repeticiones: " + duplicados.get(d) + "\n");
                }
            } else {
                System.out.println("No hay duplicados");
            }
        } else {
            System.out.println("No hay elementos en la colección");
        }
    }

    private static void ordenarArray() {
        Comparator<Dinero> c = (d1, d2) -> -d1.compareTo(d2);
        dineros.sort(c);
    }

    private static void copiarObjeto() {
        mostrarPorPantalla();
        System.out.print("Indica la posición de la lista que quieres copiar: ");
        int posicion = sc.nextInt();
        sc.nextLine();
        if (dineros.get(posicion) instanceof Billete) {
            Billete b1 = new Billete((Billete) dineros.get(posicion));
            dineros.add(b1);
        } else if (dineros.get(posicion) instanceof Moneda) {
            Moneda m1 = new Moneda((Moneda) dineros.get(posicion));
            dineros.add(m1);
        }
    }

    private static void buscar() {
        System.out.println("\nBusqueda de objeto:");
        System.out.print("Por que atributo quieres buscar? (1):año/(2):valor: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        if (opcion == 1) {
            System.out.print("Introduce el año por el que quieres buscar: ");
            int año = sc.nextInt();
            sc.nextLine();
            for (Dinero elemento : dineros) {
                if (elemento.getAnyoEmi() == año) {
                    System.out.println(elemento.toString());
                }
            }
        } else if (opcion == 2) {
            System.out.print("Introduce el valor por el que quieres buscar: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            for (Dinero elemento : dineros) {
                if (elemento.getValor() == valor) {
                    System.out.println(elemento.toString());
                }
            }
        } else {
            System.out.println("Te has equivocado de número");
        }
    }

    public static void modificarAtributos() {
        mostrarPorPantalla();
        System.out.print("Indica la posición de la lista que quieres modificar: ");
        int posicion = sc.nextInt();
        sc.nextLine();
        if (dineros.get(posicion) instanceof Billete) {
            System.out.print("Introduce la nueva altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Introduce la nueva anchura: ");
            double anchura = sc.nextDouble();
            sc.nextLine();
            ((Billete) dineros.get(posicion)).setAltura(altura);
            ((Billete) dineros.get(posicion)).setAnchura(anchura);
        } else if (dineros.get(posicion) instanceof Moneda) {
            System.out.print("Introduce el nuevo diametro: ");
            double diametro = sc.nextDouble();
            sc.nextLine();
            System.out.print("Introduce el nuevo peso: ");
            double peso = sc.nextDouble();
            sc.nextLine();
            ((Moneda) dineros.get(posicion)).setDiametro(diametro);
            ((Moneda) dineros.get(posicion)).setPeso(peso);
        }
    }

    public static void eliminarObjetos() {
        mostrarPorPantalla();
        System.out.print("Indica la posición de la lista que quieres eliminar: ");
        int posicion = sc.nextInt();
        sc.nextLine();
        dineros.remove(posicion);
    }
}
