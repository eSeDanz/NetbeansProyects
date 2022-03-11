/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2evaluacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Figura> figuras = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Figura.rellenarRelleno();
        int operacion;
        do {
            System.out.println("\nOPERACIONES");
            System.out.println("1. Agregar una figura");
            System.out.println("2. Consultar el numero de figuras creadas");
            System.out.println("3. Mostrar todas las figuras");
            System.out.println("4. Mostrar la figura de la posicion seleccionada");
            System.out.println("5. Modificar los datos de la figura de la posición seleccionada y mostrar los cambios");
            System.out.println("6. Eliminar la figura de la posicion seleccionada y mostrar un mensaje indicando el tipo de figura eliminado");
            System.out.println("7. Vaciar la colección, previa confirmación del usuario");
            System.out.println("8. SALIR");
            System.out.print("Que operación quieres realizar?: ");
            operacion = sc.nextInt();
            switch (operacion) {
                case 1:
                    agregarFigura();
                    break;
                case 2:
                    System.out.println("Se han creado " + Figura.nTotal + " figuras");
                    break;
                case 3:
                    mostrarTodasFiguras();
                    break;
                case 4:
                    mostrarFiguraEnPosicion();
                    break;
                case 5:
                    modificarFiguraEnPosicion();
                    break;
                case 6:
                    eliminarFigura();
                    break;
                case 7:
                    vaciarColeccion();
                    break;
                case 8:
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }

        } while (operacion != 8);
    }

    public static void agregarFigura() {
        int opcion, b=0, a=0;
        do {
            System.out.println("\nFIGURAS");
            System.out.println("1. Triángulo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Trapecio");
            System.out.println("4. Hexágono");
            System.out.println("5. SALIR");
            System.out.print("Que figura quieres añadir?: ");
            opcion = sc.nextInt();
            if (opcion != 5) {
                System.out.print("Base: ");
                b = sc.nextInt();

                System.out.print("Altura: ");
                a = sc.nextInt();
            }
            
            switch (opcion) {
                case 1:
                    Triangulo tri = new Triangulo(b, a);
                    figuras.add(tri);
                    break;
                case 2:
                    Rectangulo rec = new Rectangulo(b, a);
                    figuras.add(rec);
                    break;
                case 3:
                    System.out.print("Base grande: ");
                    int bg = sc.nextInt();
                    Trapecio tra = new Trapecio(b, a, bg);
                    figuras.add(tra);
                    break;
                case 4:
                    Hexagono hex = new Hexagono(b, a);
                    figuras.add(hex);
                    break;
                case 5:

                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        } while (opcion != 5);
    }

    public static void mostrarTodasFiguras() {
        System.out.println("\nMOSTRAR TODAS LAS FIGURAS\n");
        for (Figura fig : figuras) {
            if (fig instanceof Triangulo) {
                System.out.println("TRIÁNGULO");

            } else if (fig instanceof Rectangulo) {
                System.out.println("RECTÁNGULO");

            } else if (fig instanceof Hexagono) {
                System.out.println("HEXÁGONO");
                
            } else if (fig instanceof Trapecio) {
                System.out.println("TRAPECIO");
                //Trapecio trap = (Trapecio) fig;
                
            }
            System.out.println(fig.toString());
            fig.mostrarDibujo();
            System.out.println("Posición que ocupa en la colección: " + figuras.indexOf(fig) + "\n");
        }
    }

    public static void mostrarFiguraEnPosicion() {
        int posicion;
        System.out.print("Introduce la posicion para mostrar la figura: ");
        posicion = sc.nextInt();
        if (figuras.get(posicion) instanceof Triangulo) {
            System.out.println("TRIÁNGULO");
            figuras.get(posicion).toString();
        } else if (figuras.get(posicion) instanceof Rectangulo) {
            System.out.println("RECTÁNGULO");
            figuras.get(posicion).toString();
        } else if (figuras.get(posicion) instanceof Hexagono) {
            System.out.println("HEXÁGONO");
            figuras.get(posicion).toString();
        } else if (figuras.get(posicion) instanceof Trapecio) {
            System.out.println("TRAPECIO");
            figuras.get(posicion).toString();
        }
    }

    public static void modificarFiguraEnPosicion() {
        int posicion;
        System.out.print("Introduce la posicion para modificar la figura: ");
        posicion = sc.nextInt();
        if (posicion >= figuras.size() || posicion < 0) {
            System.out.println("La posicion esta fuera de rango");
        } else {
            Figura f1 = figuras.get(posicion);
            System.out.print("Introduce la atura: ");
            int altura = sc.nextInt();
            f1.setAltura(altura);
            System.out.print("Introduce la Base: ");
            int base = sc.nextInt();
            f1.setBase(base);
            if (f1 instanceof Trapecio) {
                System.out.print("Introduce la Base grande: ");
                int bg = sc.nextInt();
            }

        }
    }

    public static void eliminarFigura() {
        int posicion;
        System.out.print("Introduce la posicion para eliminar la figura: ");
        posicion = sc.nextInt();
        if (posicion >= figuras.size() || posicion < 0) {
            System.out.println("La posicion esta fuera de rango");
        } else {
            if (figuras.get(posicion) instanceof Triangulo) {
                System.out.println("TRIÁNGULO");
            } else if (figuras.get(posicion) instanceof Rectangulo) {
                System.out.println("RECTÁNGULO");
            } else if (figuras.get(posicion) instanceof Hexagono) {
                System.out.println("HEXÁGONO");
            } else if (figuras.get(posicion) instanceof Trapecio) {
                System.out.println("TRAPECIO");
            }
            figuras.remove(posicion);
        }
    }

    public static void vaciarColeccion() {
        String respuesta;
        System.out.println("¿Seguro que quieres vaciar la colección?");
        respuesta = sc.next();
        if (respuesta == "Si" || respuesta == "si" || respuesta == "SI") {
            figuras.clear();
        }
    }
}
