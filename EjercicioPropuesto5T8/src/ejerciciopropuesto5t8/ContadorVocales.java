/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto5t8;

import java.util.Scanner;


public class ContadorVocales {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase;
        char[] array;
        System.out.print("Introduce una frase para contar sus vocales: ");
        frase=sc.nextLine();
        array= frase.toLowerCase().toCharArray();
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        for (int j=0; j<array.length;j++) {
            if (array[j]=='a') {
                a++;
            } else if (array[j]=='e') {
                e++;
            } else if (array[j]=='i') {
                i++;
            } else if (array[j]=='o') {
                o++;
            } else if (array[j]=='u') {
                u++;
            }
        }                        
        System.out.println("Número de A's: "+a+
                            "\nNúmero de E's: "+e+
                            "\nNúmero de I's: "+i+
                            "\nNúmero de O's: "+o+
                            "\nNúmero de U's: "+u);
    }    
}
