/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejerciciopropuesto1;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorialRecursivo(5));
        System.out.println(factorialIterativo(5));
        
    }

    public static int factorialRecursivo(int factorial) {
        if (factorial == 1) {
            return factorial;
        } else if (factorial == 0) {
            return 1;
        } else 
            return factorial * factorialRecursivo(factorial - 1);
        
    }

    public static int factorialIterativo(int factorial) {
        int i, fac=1;
        for(i=factorial; i>0; i--){
            fac=fac*i;
        } 
        return fac;
    }
}
