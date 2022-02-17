/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico3t7;

public class Principal {

    public static void main(String[] args) {
        Revista r1 = new Revista("23D","Formula 1",2021,12);
        Libro l1 = new Libro("248F","Mujeres",2021);
        System.out.println(r1.toString());
        System.out.println("");
        System.out.println(l1.toString());
        System.out.println("");
        l1.prestar();
        System.out.println("Prestado: "+l1.prestado());
        System.out.println("");
        System.out.println(l1.toString());
        System.out.println("");
        l1.devolver();
        System.out.println("Prestado: "+l1.prestado());
        System.out.println("");
        r1.setAño(2022);
        r1.setCodigo("R1X");
        r1.setNumero(1);
        System.out.println(r1.toString());
    }
}
