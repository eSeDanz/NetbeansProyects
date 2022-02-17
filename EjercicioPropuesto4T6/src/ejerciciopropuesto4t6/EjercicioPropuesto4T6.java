/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto4t6;

public class EjercicioPropuesto4T6 {

    public static void main(String[] args) {
        satelite f1 = new satelite();
        f1.setPosicion(100,500,1000);
        f1.printPosicion();
        f1.variaAltura(-500);
        f1.variaPosicion(200,100);
        f1.printPosicion();
        System.out.print("El satelite esta en orbita? ");
        System.out.println(f1.enOrbita());
        f1.variaAltura(-500);
        f1.printPosicion();
        System.out.print("El satelite esta en orbita? ");
        System.out.println(f1.enOrbita());
    }
}
