/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto1t8;

import java.util.Scanner;

public class Matriz {

    private int numf;
    private int numc;
    private int[][] matriz;
    
    public static void main(String[] args) {
        
    }

/*    public Matriz(int numf, int numc) {
        this.numf=numf;
        this.numc=numc;
        matriz= new int[numf][numc];
    }
*/            
    private void solicitarTamanyo() {
        Scanner sc= new Scanner(System.in);
        int filas;
        int columnas;
        System.out.print("Introduce el número de filas: ");
        filas=sc.nextInt();
        System.out.println("Introduce el número de columnas: ");
        columnas=sc.nextInt();
        matriz= new int[filas][columnas];
//        Matriz f1= new Matriz(filas, columnas);
        asignarDatos();
    }
    
    private void asignarDatos() {
        if(matriz==null){
            System.out.println("No hay matriz...");
            return;
        }        
        for(int i=0; i<numf; i++){
            for(int j=0; j<numc; j++){
                matriz[i][j] = (int)(Math.random()*100+1);
            }
        }
    }
    
    private int maximo() {
        if(matriz==null)
            return -1;
        
        int max = matriz[0][0];
        for(int[] filas: matriz){
            for(int elementos: filas){
                if(elementos>max)
                    max = elementos;
            }
        }
        return max;
    }
    
    private int minimo() {
        if(matriz==null)
            return -1;        
        int min = matriz[0][0];
        for(int[] filas: matriz){
            for(int elementos: filas){
                if(elementos<min)
                    min = elementos;
            }
        }
        return min;
    }
    
    
        
}
