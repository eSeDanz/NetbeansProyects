/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricamonedatimbre;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDinero {

    private static ArrayList<Dinero> dineros = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static final String RUTA = "C:\\Users\\Dani\\Java\\NetbeansProyects\\FabricaMonedaTimbre\\src\\fabricamonedatimbre\\Serializado.bin";

    public static void main(String[] args) {
        recuperarDatos();
        menu();
        serializar(dineros);
    }

    public static void serializar(ArrayList<Dinero> dineros) {
        try {
            File fichero = new File(RUTA);
            String respuesta;
            if (fichero.exists()) {
                do {
                    System.out.print("Quieres guardar la sesión actual? s/n: ");
                    respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.println("Se guardarán los cambios introducidos en la sesión actual");
                        FileOutputStream fos = new FileOutputStream(RUTA);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(dineros);
                        oos.close();
                        fos.close();
                    } else if (respuesta.equalsIgnoreCase("n")) {
                        System.out.println("No se guardaran los cambios de la sesión actual");
                    } else {
                        System.out.println("Te has equivocado de respuesta");
                    }
                } while (!(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")));
            } else {
                FileOutputStream fos = new FileOutputStream(RUTA);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(dineros);
                oos.close();
                fos.close();
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ioe) {
            System.out.println("Error en la entrada/salida de datos");
        }
    }

    public static void recuperarDatos() {
        try {
            File fichero = new File(RUTA);
            boolean fin = false;
            String respuesta;
            do {
                System.out.print("Quieres recuperar la sesión anterior? s/n: ");
                respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("n")) {
                    System.out.println("Continuaremos con las monedas y billetes por defecto...");
                    defaultValues();
                } else if (respuesta.equalsIgnoreCase("s")) {
                    if (fichero.exists()) {
                        FileInputStream fis = new FileInputStream(RUTA);
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        dineros = (ArrayList<Dinero>) ois.readObject();
                        ois.close();
                        fis.close();
                    } else {
                        System.out.println("Imposible recuperar datos, es la primera ejecución del programa");
                        System.out.println("Continuaremos con las monedas y billetes por defecto...");
                        defaultValues();
                    }
                } else {
                    System.out.println("Te has equivocado al introducir la respuesta");
                }
            } while (!(respuesta.trim().equalsIgnoreCase("s") || respuesta.trim().equalsIgnoreCase("n")));
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ioe) {
            System.out.println("Error en la entrada/salida de datos");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Clase no encontrada");
        }
    }

    public static void defaultValues() {
        dineros.add(new Moneda(5, 2022, 20, 4));
        dineros.add(new Moneda(50, 1970, 200, 400));
        dineros.add(new Billete(5, 2022, 20, 4));
        dineros.add(new Billete(50, 1970, 200, 400));
    }

    public static void menu() {
        int opcion = -1;
        do {
            try {
                System.out.print("\nMENU PRINCIPAL:\n"
                        + "Opción 1: Crear Objetos\n"
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
            } catch (IndexOutOfBoundsException ioobe) {
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
        System.out.println("\nCREACIÓN DE UN OBJETO");
        System.out.println("*********************");
        do {
            System.out.print("Introduce el tipo de timbre que quieres crear (moneda/billete): ");
            timbre = sc.next();
            if (!timbre.equalsIgnoreCase("moneda") && !timbre.equalsIgnoreCase("billete")) {
                System.out.println("La respuesta introducida no es correcta");
            }
        } while (!timbre.equalsIgnoreCase("moneda") && !timbre.equalsIgnoreCase("billete"));
        if (timbre.equalsIgnoreCase("moneda")) {
            System.out.print("Introduce el valor de la moneda en euros: ");
            valor = sc.nextDouble();
            System.out.print("Introduce el año de emisión de la moneda: ");
            anyoEmi = sc.nextInt();
            System.out.print("Introduce el diametro de la moneda en milímetros: ");
            diametro = sc.nextDouble();
            System.out.print("Introduce el peso de la moneda en gramos: ");
            peso = sc.nextDouble();
            Moneda m1 = new Moneda(valor, anyoEmi, diametro, peso);
            dineros.add(m1);
            System.out.println("Moneda añadida en el ArrayList\n");
        } else {
            System.out.print("Introduce el valor del billete en euros: ");
            valor = sc.nextDouble();
            System.out.print("Introduce el año de emisión del billete: ");
            anyoEmi = sc.nextInt();
            System.out.print("Introduce la altura del billete en milímetros: ");
            altura = sc.nextDouble();
            System.out.print("Introduce la anchura del billete en milímetros: ");
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
            System.out.println("\nMOSTRANDO OBJETOS");
            int i = 0;
            for (Dinero elemento : dineros) {
                System.out.println("\n(" + i + ") " + elemento.toString());
                i++;
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
        System.out.println("El arrayList se ha ordenado");
    }

    private static void copiarObjeto() {
        mostrarPorPantalla();
        System.out.print("Indica la posición de la lista que quieres copiar: ");
        int posicion = sc.nextInt();
        sc.nextLine();
        if (dineros.get(posicion) instanceof Billete) {
            Billete b1 = new Billete((Billete) dineros.get(posicion));
            dineros.add(b1);
            System.out.println("Billete copiado y añadido al arrayList con éxito");
        } else if (dineros.get(posicion) instanceof Moneda) {
            Moneda m1 = new Moneda((Moneda) dineros.get(posicion));
            dineros.add(m1);
            System.out.println("Moneda copiada y añadida al arrayList con éxito");
        }
    }

    private static void buscar() {
        System.out.println("\nBusqueda de objeto:");
        System.out.print("Por que atributo quieres buscar? (1):año/(2):valor: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        int index = 0;
        if (opcion == 1) {
            System.out.print("Introduce el año por el que quieres buscar: ");
            int año = sc.nextInt();
            sc.nextLine();
            for (Dinero elemento : dineros) {
                if (elemento.getAnyoEmi() == año) {
                    System.out.println("\n" + elemento.toString());
                    index++;
                }
            }
            if (index == 0) {
                System.out.println("Ningún dinero encontrado con ese año");
            }
        } else if (opcion == 2) {
            System.out.print("Introduce el valor por el que quieres buscar: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            for (Dinero elemento : dineros) {
                if (elemento.getValor() == valor) {
                    System.out.println("\n" + elemento.toString());
                    index++;
                }
            }
            if (index == 0) {
                System.out.println("Ningún dinero encontrado con ese valor");
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
            System.out.println("Billete modificado con éxito");
        } else if (dineros.get(posicion) instanceof Moneda) {
            System.out.print("Introduce el nuevo diametro: ");
            double diametro = sc.nextDouble();
            sc.nextLine();
            System.out.print("Introduce el nuevo peso: ");
            double peso = sc.nextDouble();
            sc.nextLine();
            ((Moneda) dineros.get(posicion)).setDiametro(diametro);
            ((Moneda) dineros.get(posicion)).setPeso(peso);
            System.out.println("Moneda modificada con éxito");
        }
    }

    public static void eliminarObjetos() {
        mostrarPorPantalla();
        System.out.print("Indica la posición de la lista que quieres eliminar: ");
        int posicion = sc.nextInt();
        sc.nextLine();
        dineros.remove(posicion);
        System.out.println("Eliminado con éxito");
    }
}
