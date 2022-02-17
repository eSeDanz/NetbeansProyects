/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioadicional2t6;

import java.util.Scanner;

public class EjercicioAdicional2T6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el coeficiente a: ");
        double aa = sc.nextDouble();
        System.out.println("Introduce el coeficiente b: ");
        double bb = sc.nextDouble();
        System.out.println("Introduce el coeficiente c: ");
        double cc = sc.nextDouble();
        
        Raices f = new Raices(aa, bb, cc);
        System.out.println(f.getDiscriminante());
        System.out.println(f.tieneRaiz());
        
    }
    
}
