/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema112;

import java.util.Scanner;


public class Main {

    //Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int n = sc.nextInt();
        recursivo(n);
    }
    
    //Calculo de numeros binarios de manera recursiva
    public static void recursivo(int n){
        //int resto= n%2;
        if (n >1){
            recursivo(n/2);
            System.out.print(n%2);  //tambien puedes poner resto si el calculo se hace arriba
        }
        else
            System.out.print(n);        
    }   
}
