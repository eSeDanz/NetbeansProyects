/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto1t8;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    private int numf;
    private int numc;
    private int[][] matriz;
    
    public static void main(String[] args) {
        
        Matriz f1= new Matriz();
        Matriz f2= new Matriz();
        f1.solicitarTamanyo();
        f2.solicitarTamanyo();
        f1.mostrarMatriz();
        f2.mostrarMatriz();
        f1.suma(f2);
        f1.mostrarMatriz();
        f1.traspuesta();
        f1.mostrarMatriz();
        System.out.println(f1.toString());
    }

/*    public Matriz(int numf, int numc) {
        this.numf=numf;
        this.numc=numc;
        matriz= new int[numf][numc];
    }
*/         
    public void mostrarMatriz() {
        System.out.println(toString());
        System.out.println("");
    }
    
    @Override
    public String toString() {
        String mostrarMatriz="La matriz es la siguiente: ";
        for (int i = 0; i < matriz.length; i++) {
            mostrarMatriz+="\n";
            for (int j = 0; j < matriz[i].length; j++) {
                mostrarMatriz+=matriz[i][j]+" ";                
            }   
        }
        return mostrarMatriz;
    }
    
    private  void solicitarTamanyo() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        numf=sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        numc=sc.nextInt();
        matriz= new int[numf][numc];
//        Matriz f1= new Matriz(filas, columnas);
        asignarDatos();
    }
    
    private  void asignarDatos() {
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
    
    private  int maximo() {
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
    
    private  int minimo() {
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

    public int getNumf() {
        return numf;
    }

    public int getNumc() {
        return numc;
    }

    public  int[][] getMatriz() {
        return matriz;
    }
            
    private void suma(Matriz matriz) {
        if(numf==matriz.getNumf()&&numc==matriz.getNumc()) {
            for(int i = 0; i<this.matriz.length;i++) {
                for (int j=0 ; j<this.matriz[i].length; j++) {
                    this.matriz[i][j]=this.matriz[i][j]+matriz.getMatriz()[i][j];
                }                
            }
        }
    }
        
    public void traspuesta() {
        if(numf==numc) {
            int[][] matrizaux= new int[numf][numc];
            for (int i = 0; i < numf; i++) {
                for (int j = 0; j < numc; j++) {
                    matrizaux[i][j]=this.matriz[j][i];
                }
            } 
            this.matriz=matrizaux;
        } else {
            System.out.println("Las matrices no son cuadradas");
        }
    }
}
