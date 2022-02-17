/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salondevideojuegos;

public class Test {

    public static void main(String[] args) {
        System.out.println("Creo ja1, jv1 y jv2");
        System.out.println("*******************");
        JuegoEnAlquiler ja1 = new JuegoEnAlquiler("Mario Bros", "Nintendo", 1986, 5.0, 2, 10);
        JuegoEnVenta jv1 = new JuegoEnVenta("Mario Bros", "Nintendo", 1986, 40.0, 10);
        JuegoEnVenta jv2 = new JuegoEnVenta("Mario Bros", "Nintendo", 1985, 35.0, 10);
        System.out.println("");
        System.out.println("Creo una copia de ja1(ja2)");
        System.out.println("**************************");
        JuegoEnAlquiler ja2 = new JuegoEnAlquiler(ja1);
        System.out.println("");
        System.out.println("Muestro el numero total de juegos del salon");
        System.out.println("******************************************");
        System.out.println("Numero total de juegos: " + Juego.getTotaljuegos());
        System.out.println("");
        System.out.println("Alquilo ja1");
        System.out.println("***********");
        ja1.alquilar();
        System.out.println(ja1.toString());
        System.out.println("Devuelvo ja1");
        System.out.println("************");
        ja1.devolver();
        System.out.println(ja1.toString());
        System.out.println("");
        System.out.println("Compruebo si ja1 y jv1 son iguales");
        System.out.println("**********************************");
        System.out.println("Son iguales? " + ja1.equals(jv1));
        System.out.println("");
        System.out.println("Compruebo si ja1 y jv2 son iguales");
        System.out.println("**********************************");
        System.out.println("Son iguales? " + ja1.equals(jv2));
        System.out.println("");
        System.out.println("Comparo jv1 con jv2");
        System.out.println("*******************");
        if (jv1.compareTo(jv2) == 0) {
            System.out.println("Los objetos jv1 y jv2 son iguales");
        } else if (jv1.compareTo(jv2) == 1) {
            System.out.println("El objeto jv1 es mayor que el objeto jv2");
        } else {
            System.out.println("El objeto jv2 es mayor que el objeto jv1");
        }
        System.out.println("");
        System.out.println("Comparo ja1 con jv1");
        System.out.println("*******************");
        if (ja1.compareTo(jv1) == 0) {
            System.out.println("Los objetos ja1 y jv1 son iguales");
        } else if (ja1.compareTo(jv1) == 1) {
            System.out.println("El objeto jv2 es mayor que el objeto jv1");
        } else {
            System.out.println("El objeto jv1 es mayor que el objeto jv2");
        }
    }
}
