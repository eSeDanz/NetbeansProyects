/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1propuestost5;

public class E1PropuestosT5 {

    public static void main(String[] args) {
        int a = 20, b = 50, c = 15;
        if (a > b && a > c) {
            System.out.println("El mayor es " + a);
        } else if (b > a && b > c) {
            System.out.println("El mayor es " + b);
        } else if (c > a && c > b) {
            System.out.println("El mayor es " + c);
        }
        if (a < b && a < c) {
            System.out.println("El menor es " + a);
        } else if (b < a && b < c) {
            System.out.println("El menor es " + b);
        } else if (c < a && c < b) {
            System.out.println("El menor es " + c);
        }
    }

}
