/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Biblioteca {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static final String RUTA = "C:\\Users\\Dani\\Rogelio\\NetbeansProyects\\Biblioteca\\src\\biblioteca\\Serializado.bin";

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        recuperarDatos();
        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    altaLibro();
                    break;
                case 2:
                    int op;
                    do {
                        op = menuBusqueda();
                        switch (op) {
                            case 1:
                                buscarPorTitulo();
                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                            case 6:

                                break;
                            case 7:

                                break;
                            case 8:

                                break;
                            case 9:
                                System.out.println("Saliendo del menú...");
                                break;
                            default:
                                System.out.println("Te has equivocado de número...");
                        }
                    } while (op != 9);
                    break;
                case 3:
                        
                    break;
                case 4:
                        
                    break;
                case 5:
                       
                    break;
                case 6:
                        
                    break;
                case 7:
                    
                    break;
                case 10:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Te has equivocado de número...");
            }
        } while (opcion != 10);
        serializar(empleados, usuarios, libros);
    }

    public static void defaultValues() {
        empleados.add(new Empleado("Alberto"));
        empleados.add(new Empleado("Encarna"));
        empleados.add(new Empleado("Estela"));
        empleados.add(new Empleado("Manolo"));
        empleados.add(new Empleado("Agustín"));
        usuarios.add(new Usuario("usu1"));
        usuarios.add(new Usuario("usu2"));
        usuarios.add(new Usuario("usu3"));
        usuarios.add(new Usuario("usu4"));
        usuarios.add(new Usuario("usu5"));
        libros.add(new Libro("Frankenstein", "Mary Shelley", "Lackington", 1, "XSDFNSDF", 25.30));
        libros.add(new Libro("El Lobo Estepario", "Herman Hesse", "S.Fischer Verlag", 2, "XQWEDNBF", 22.50));
        libros.add(new Libro("El mito de Sísifo", "Albert Camus", "Hamish Hamilton", 3, "XSJUSHE", 20.20));
    }

    public static void serializar(ArrayList<Empleado> empleados, ArrayList<Usuario> usuarios, ArrayList<Libro> libros) throws FileNotFoundException, IOException {
        File fichero = new File(RUTA);
        String respuesta;
        if (fichero.exists()) {
            System.out.print("Quieres guardar la sesión actual? s/n: ");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                System.out.println("Se guardarán los cambios introducidos en la sesión actual");
                FileOutputStream fos = new FileOutputStream(RUTA);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(empleados);
                oos.writeObject(usuarios);
                oos.writeObject(libros);
                oos.close();
                fos.close();
            } else {
                System.out.println("No se guardaran los cambios de la sesión actual");
            }
        } else {
            FileOutputStream fos = new FileOutputStream(RUTA);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(empleados);
            oos.writeObject(usuarios);
            oos.writeObject(libros);
            oos.close();
            fos.close();
        }
    }

    public static void recuperarDatos() throws FileNotFoundException, IOException, ClassNotFoundException {
        File fichero = new File(RUTA);
        boolean fin = false;
        String respuesta;
        System.out.print("Quieres recuperar la sesión anterior? s/n: ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("n")) {
            System.out.println("Continuaremos con los valores por defecto de usuarios y empleados, y tendras que crear nuevos libros...");
            defaultValues();
        } else if (respuesta.equalsIgnoreCase("s")) {
            if (fichero.exists()) {
                FileInputStream fis = new FileInputStream(RUTA);
                ObjectInputStream ois = new ObjectInputStream(fis);
                empleados = (ArrayList<Empleado>) ois.readObject();
                usuarios = (ArrayList<Usuario>) ois.readObject();
                libros = (ArrayList<Libro>) ois.readObject();
                ois.close();
                fis.close();
            } else {
                System.out.println("Imposible recuperar datos, es la primera ejecución del programa");
                System.out.println("Continuaremos con los valores por defecto de usuarios y empleados, y tendras que crear nuevos libros...");
                defaultValues();
            }
        } else {
            System.out.println("Te has equivocado al introducir la respuesta, no se recuperará la sesión anterior");
            System.out.println("Continuaremos con los valores por defecto de usuarios y empleados, y tendras que crear nuevos libros...");
            defaultValues();
        }
    }

    public static int menuPrincipal() {
        int opcion;
        try {
            System.out.print("\nMenu Principal: "
                    + "\n(1) Dar de alta un libro en el sistema"
                    + "\n(2) Busqueda de libros en el sistema"
                    + "\n(3) Dar de baja un libro en el sistema"
                    + "\n(4) Alquiler de un libro por un usuario"
                    + "\n(5) Devolucion de un libro por un usuario"
                    + "\n(6) Gestion de empleados de la biblioteca"
                    + "\n(7) Gestion de usuarios de la biblioteca"
                    + "\n(10) Salir del sistema"
                    + "\nIntroduce una opción del menú: ");
            opcion = sc.nextInt();
            sc.nextLine();
            return opcion;
        } catch (InputMismatchException ime) {
            System.out.println("Error en el tipo de datos introducidos");
        }
        return 0;
    }

    public static void altaLibro() {
        String titulo;
        String autor;
        String editorial;
        int numPasillo;
        String ISBN;
        double precio;
        try {
        System.out.print("\nIntroduce el título del libro: ");
        titulo = sc.nextLine();
        System.out.print("Introduce el autor: ");
        autor = sc.nextLine();
        System.out.print("Introduce la editorial del libro: ");
        editorial = sc.nextLine();
        System.out.print("Introduce el pasillo donde va a estar el libro: ");
        numPasillo = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el ISBN: ");
        ISBN = sc.nextLine();
        System.out.print("Introduce el precio del libro: ");
        precio = sc.nextDouble();
        sc.nextLine();
        Libro l = new Libro(titulo, autor, editorial, numPasillo, ISBN, precio);
        libros.add(l);
        } catch (InputMismatchException ime) {
            System.out.println("Error en el tipo de datos introducidos");
        }
    }

    public static int menuBusqueda() {
        int opcion;
        try {
        System.out.print("\n(1) Título"
                + "\n(2) Autor"
                + "\n(3) Editorial"
                + "\n(4) Ubicacion"
                + "\n(5) ISBN"
                + "\n(6) Nombre del bibliotecario que lo ha prestado"
                + "\n(7) Estado de prestamos(buscar libros prestados o no prestados)"
                + "\n(8) Nombre del usuario que lo ha alquilado"
                + "\n(9) Salir"
                + "\nIntroduce un criterio de busqueda: ");
        opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
        } catch (InputMismatchException ime) {
            System.out.println("Error en el tipo de datos introducidos");
        }
        return 0;
    }
    
    public static void buscarPorTitulo(){
        System.out.print("Introduce el título del libro que quieres buscar: ");
        String titulo=sc.nextLine();
        int index=1;
        for(Libro l: libros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Libro "+index+": ");
                System.out.println(l.toString());
            }
        }
    }
}
