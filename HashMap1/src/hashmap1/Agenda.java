/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Agenda {

    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Integer> agenda = new HashMap<>();

    public static void main(String[] args) {
        mostrarMenu();

    }

    public static void mostrarMenu() {
        int accion;
        do {
            System.out.println("ACCIONES");
            System.out.println("--------");
            System.out.println("1. Agendar a un amigo");
            System.out.println("2. Consultar el número de amigos que hay agendados");
            System.out.println("3. Consultar el teléfono de un amigo");
            System.out.println("4. Modificar el teléfono de un amigo");
            System.out.println("5. Consultar a quién pertenece un número de teléfono");
            System.out.println("6. Borrar a un ex-amigo de la agenda");
            System.out.println("7. Mostrar el contenido de la agenda");
            System.out.println("8. Listar únicamente los nombres de los amigos");
            System.out.println("9. Ordenar agenda por nombres");
            System.out.println("10. Ordenar agenda por teléfonos");
            System.out.println("11. SALIR");
            System.out.print("\nIntroduce una acción: ");
            accion = sc.nextInt();
            switch (accion) {
                case 1:
                    rellenarAgenda();
                    break;
                case 2:
                    consultarNumAmigos();
                    break;
                case 3:
                    consultarTelefono();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    mostrarAgenda();
                    break;
                case 8:
                    mostrarNombres();
                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:
                    System.out.println("Hasta Luego\n");
                    break;
                default:
                    System.out.println("El número introducido no corresponde con ninguna acción\n");
                    break;
            }
        } while (accion != 11);
    }

    public static void rellenarAgenda() {        
        String nombre;
        int telefono;
        char resp;
        do {
            System.out.print("Introduce el nombre del alumno: ");
            nombre = sc.nextLine();            
            if (agenda.containsKey(nombre)) {
                System.out.println("El nombre introducido ya existe en la lista");
            } else {
                System.out.print("Introduce el telefono del alumno: ");
                telefono = sc.nextInt();
                agenda.put(nombre, telefono);
            }
            System.out.print("Quieres seguir introduciendo alumnos? (S/N): ");
            resp = sc.next().charAt(0);
            sc.nextLine();
        } while (resp == 'S' || resp == 's');
        System.out.println("");
    }

    public static void mostrarAgenda() {
        int tlf;
        System.out.println("\nAGENDA");
        for(String nombre: agenda.keySet()) {
            tlf= agenda.get(nombre);
            System.out.println(nombre+"\t"+tlf);
            //System.out.println(nombre+"\t"+agenda.get(nombre));
        }
    }
    
    public static void mostrarNombres() {
        int tlf;
        System.out.println("\nAGENDA");
        for(String nombre: agenda.keySet()) {
            System.out.println(nombre);
        }
    }

    public static void consultarNumAmigos() {
        System.out.println("El número de amigos en la agenda es: "+agenda.size());
    }
    
/*    public static void ordenarPorNombre() {
        TreeMap<String, Integer> ordenada = new TreeMap<>(agenda);
        int tlf;
    }*/
    
    public static void consultarTelefono() {
        String nombre;
        System.out.print("Introduce el nombre para buscar su número de teléfono: ");
        nombre=sc.nextLine();
        System.out.println("El teléfono de "+nombre+" es "+agenda.get(nombre));
    }
    
    public static void modificarTelefono(){
        String nombre;
        int nuevoTlf;
        System.out.print("Introduce el nombre: ");
        nombre=sc.nextLine();
        if (agenda.containsKey(nombre)) {
            System.out.println("Introduce el nuevo teléfono: ");
            nuevoTlf= sc.nextInt();
            agenda.replace(nombre, nuevoTlf);
        } else {
            System.out.println("No existe el nombre introducido");
        }
        
    }
}
