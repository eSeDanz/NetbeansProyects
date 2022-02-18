/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto7t8;

import java.util.Arrays;

public abstract class ArraysOrdenados {

    private static int[] array1= {4,7,6,11,18};
    private static int[] array2= {2,5,9};

    public static void main(String[] args) {
        int[] combinado=combinarArrays(array1, array2);
        System.out.println(Arrays.toString(combinado));
    }

    private static int[] combinarArrays(int[] x, int[] y) {
        int[] combinado=new int[x.length+y.length];
        System.arraycopy(x, 0, combinado, 0, x.length);
        System.arraycopy(y, 0, combinado, x.length, y.length);
        Arrays.sort(combinado);
        return combinado;
    }
}