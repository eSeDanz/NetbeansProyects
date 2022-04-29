/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejerciciopropuesto2;

import java.util.Scanner;


public class Main {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int pos;
        System.out.print("Introduce el fibonacci que quieres calcular: ");
        pos= sc.nextInt();
        for(int i=1; i<=pos; i++){
            System.out.print(fibonacci_iterativo(i) + " ");
        }
       // fibonacci_recursivo(5);
    }
    
    public static void fibonacci_recursivo(int posicion){
        
    }
    
    public static int fibonacci_iterativo(int posicion){
        int ultimo=1, penultimo=0, fib=0;
        if(posicion==1){
            return 0;
        } else if(posicion==2){
            return 1;
        }
        
        for(int i=3; i<=posicion; i++){
            fib=ultimo+penultimo;
            penultimo=ultimo;
            ultimo=fib;
        } return fib;
    }
}
