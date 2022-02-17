/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto8.pkg1;

import java.util.Random;

public class Principal {
    
    public static void main(String[] args) {
       int[] puta = array();
        for (int i = 0; i < puta.length ; i++) {
          System.out.print(puta[i]+" ");       
        }
        System.out.println();
        rabodeperro(puta);      
    }
    
    private static int[] array(){
    int [] array; 
    Random minabo = new Random();
    array = new int [100];
        for (int i = 0; i < array.length; i++) {
           array[i] = minabo.nextInt(100)+1;
        }
        return array;
    }
    private static void rabodeperro(int[] puto) {
        int sumatorio = 0;
        for (int i = puto.length-1; i >= 0; i--) {
            sumatorio += puto[i];             
        }
        System.out.println(sumatorio);
    }
}
