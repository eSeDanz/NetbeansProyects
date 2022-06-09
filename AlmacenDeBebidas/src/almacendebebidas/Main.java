/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacendebebidas;

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

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static final String RUTA = "/home/alumno/NetBeansProjects/AlmacenDeBebidas/src/almacendebebidas/Serializado.bin";
    private static Almacen al;
    
    public static void main(String[] args) {
        recuperarDatos();
        mostrarMenu();
        serializar(al);
    }

    public static void serializar(Almacen almacen) {
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
                        oos.writeObject(almacen);
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
                oos.writeObject(almacen);
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
                    System.out.println("Continuaremos con el almacen creado pero vacio...");
                    al = crearAlmacen();
                } else if (respuesta.equalsIgnoreCase("s")) {
                    if (fichero.exists()) {
                        FileInputStream fis = new FileInputStream(RUTA);
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        Almacen almacen = (Almacen) ois.readObject();
                        ois.close();
                        fis.close();
                    } else {
                        System.out.println("Imposible recuperar datos, es la primera ejecución del programa");
                        System.out.println("Continuaremos con el almacen creado pero vacio...");
                        al = crearAlmacen();
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

    public static Almacen crearAlmacen() {
        int filas;
        int columnas;
        System.out.print("Introduce el número de filas que va a tener el almacén: ");
        filas = sc.nextInt();
        System.out.print("Introduce el número de columnas que va a tener el almacén: ");
        columnas = sc.nextInt();
        sc.nextLine();
        Almacen almacen = new Almacen(filas, columnas);
        return almacen;
    }

    public static void mostrarMenu() {
        int opcion;
        try {
            do {
                System.out.println("\nALMACÉN DE BEBIDAS");
                System.out.println("******************");
                System.out.println("1. Agregar bebida");
                System.out.println("2. Eliminar una bebida");
                System.out.println("3. Calcular precio total");
                System.out.println("4. Calcular precio marca");
                System.out.println("5. Calcular precio estante");
                System.out.println("6. Bebidas del almacén");
                System.out.println("7. Número de bebidas dadas de alta");
                System.out.println("8. Mostrar todo");
                System.out.println("9. Ampliar almacén");
                System.out.println("0. SALIR");
                System.out.print("Introduzca la acción a realizar: ");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1: //Agregar bebida: solicitar ID, comprobar que no existe, comprobar que queda sitio 
                        //--> crear bebida y agregarla al almacén
//                    System.out.print("Introduce la ID de la bebida a borrar: ");
//                    int id = sc.nextInt();
//                    agregarBebida();
                        break;

                    case 2: //Eliminar bebida: solicitar ID, borrarlo e informar
//                    System.out.print("Introduce la ID de la bebida a borrar: ");
//                    int id = sc.nextInt();
//                    eliminarBebida(id);
                        break;

                    case 3: //Calcular precio total y mostrarlo

                        break;

                    case 4: //Calcular precio marca: solicitar marca y mostrar precio 

                        break;

                    case 5: //Calcular precio estante: solicitar estante y mostrar precio

                        break;

                    case 6: //Consultar número de bebidas del almacén

                        break;

                    case 7: //Consultar número de bebidas creadas

                        break;

                    case 8: //Mostar toda la información de las bebidas

                        break;

                    case 9: //Ampliar almacén: 
                    //mostrar dimensiones actuales del almacén, 
                    //crear almacén nuevo, 
                    //comprobar dimensiones del almacén nuevo,
                    //copiar bebidas del almacén pequeño al nuevo

                    case 0: //Salir: tratamiento de fichero y mensaje de despedida 
                        System.out.println("Hasta luego");
                        break;
                    default:
                        System.out.println("\nOpción incorecta. Vuelva a intentarlo");
                        break;
                }

            } while (opcion != 0);

        } catch (InputMismatchException ime) {
            System.out.println("Error en el tipo de datos introducidos ");
            sc.nextLine();
        }
    }

}
