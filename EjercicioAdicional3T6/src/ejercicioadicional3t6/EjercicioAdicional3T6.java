/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioadicional3t6;

public class EjercicioAdicional3T6 {

    public static void main(String[] args) {
        Password f1 = new Password();
        Password f2 = new Password();
        Password f3 = new Password();
//        password f3 = new Password(Password.minusculas+Password.mayusculas+Password.numeros,11);
//        System.out.println(f1.generarPassword());
//        System.out.println(f2.generarPassword(16));
//        System.out.println(f3.generarPassword(Password.mayusculas+Password.minusculas+Password.numeros, 24));
//        System.out.println((char)(Math.random()*26+'A'));  //(mayusculas de la A a la Z)
//        System.out.println((int)(Math.random()*101+100));  //(numeros del 100 al 200)     
//        System.out.println((int)(Math.random()*10+0));     //(numeros del 0 al 9)
        f2.setLongitud(11);
//        System.out.println(f2.generarPassword());
        System.out.println(f2.getContraseña());
    }
    
}
