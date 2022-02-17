/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto84t8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String argumento = args[0];
        System.out.println(argumento);   
        String [] trozos = argumento.split(" ");
        System.out.println(Arrays.toString(trozos));
        System.out.println("El array contiene " + trozos.length + " palabras");   
    }    
}
