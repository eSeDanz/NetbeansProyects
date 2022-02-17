/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico3t8;

public class Main {

    public static void main(String[] args) {
        int[][] matriz = new int[5][8];
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }    
}
