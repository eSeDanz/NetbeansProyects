/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4ejerciciopropuesto9;

/**
 *
 * @author Dani
 */
public class Joven {
    public static void main(String[] args) {
        int edad = 28;
        int nivel_de_estudios = 4;
        int ingresos = 12000;
        boolean jasp;
        jasp = ((edad <= 28 && nivel_de_estudios > 3) || (edad < 30 && ingresos > 28000));
        System.out.println(jasp);
    }
}
