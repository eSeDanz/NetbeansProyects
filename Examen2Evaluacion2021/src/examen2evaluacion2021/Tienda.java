/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2evaluacion2021;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tienda {

    private static ArrayList<Lavadora> lista = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Electrodomestico.rellenarLetras();

        int op = 0;
        do {
            System.out.println("\nACCIONES");
            System.out.println("1. Agregar lavadora");
            System.out.println("2. Buscar lavadora");
            System.out.println("3. Modificar precio base ");
            System.out.println("4. Eliminar lavadora");
            System.out.println("5. Mostrar todas las lavadoras");
            System.out.println("6. SALIR");
            System.out.print("Introduzca su opción: ");
            try {
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        agregarLavadora();
                        break;
                    case 2:
                        buscarLavadora();
                        break;
                    case 3:
                        modificarLavadora();
                        break;
                    case 4:
                        eliminarLavadora();
                        break;
                    case 5:
                        mostrarTodo();
                        break;
                    case 6:
                        System.out.println("Hasta pronto!!");
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                        break;
                }

            } catch (InputMismatchException ex) {
                System.out.println("ERROR. Tipo incorrecto");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (op != 6);
    }

    public static void agregarLavadora() {
        System.out.print("Modelo: ");
        String m = sc.next();
        System.out.print("Precio base: ");
        double pb = sc.nextDouble();
        if (pb < 0) {
            throw new IllegalArgumentException("PRECIO debe ser mayor que 0");
        }
        System.out.print("Consumo: ");
        char c = sc.next().charAt(0);
        System.out.print("Peso: ");
        double p = sc.nextDouble();
        if (p < 0) {
            throw new IllegalArgumentException("PESO debe ser mayor que 0");
        }
        System.out.print("Carga: ");
        double car = sc.nextDouble();
        Lavadora lav = new Lavadora(m, pb, c, p, car);
        lista.add(lav);
    }

    public static void buscarLavadora() {
        System.out.print("Modelo a buscar: ");
        String m = sc.next();
        int pos = buscarPosicion(m);

        if (pos == -1) {
            System.out.println("\nLavadora desconocida");
        } else {
            Lavadora l = lista.get(pos);
            System.out.println(l.toString());
        }
    }

    public static int buscarPosicion(String mod) {
        int pos = -1;
        for (Lavadora lav : lista) {
            if (lav.getModelo().equals(mod)) {
                pos = lista.indexOf(lav);
                break;
            }
        }
        return pos;
    }

    public static void modificarLavadora() {
        System.out.print("Modelo a modificar: ");
        String m = sc.next();
        int pos = buscarPosicion(m);

        if (pos == -1) {
            System.out.println("\nLavadora desconocida");
        } else {
            Lavadora l = lista.get(pos);
            System.out.print("Nuevo precio base: ");
            double pb = sc.nextDouble();
            l.setPrecioBase(pb);
            System.out.println(l.toString());
        }
    }

    public static void eliminarLavadora() {
        System.out.print("Modelo a eliminar: ");
        String m = sc.next();
        int pos = buscarPosicion(m);

        if (pos == -1) {
            System.out.println("\nLavadora desconocida");
        } else {
            Lavadora l = lista.remove(pos);
            System.out.println(l.toString());
        }
    }

    public static void mostrarTodo() {
        if (lista.size() > 0) {
            System.out.println("\nLISTADO DE LAVADORAS");
            for (Lavadora lav : lista) {
                System.out.println(lav.toString());
            }
        } else {
            System.out.println("\nNo quedan lavadoras");
        }
    }
/*
    DecimalFormat df = new DecimalFormat (###.##);
    double precio = 555,73458;
    print("Precio: "+ df.Format(precio));
    
    
    for(Electrodomestico e: lista)
    if (e instanceof Lavadora) {
    println("LAVADORA");
    Lavadora l = (Lavadora) e;
    }
    
    */
}
