/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejerciciopropuesto6;

import java.util.Scanner;

public class transformabase {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num, base;
        System.out.print("Introduce el número que quieres convertir: ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce la base a la que quieres convertirlo(2,8,16): ");
        base = sc.nextInt();
        sc.nextLine();
        while (base != 2 && base != 8 && base != 16) {
            System.out.println("La base introducida es incorrecta");
            System.out.print("Vuelva a introducir la base(2,8,16): ");
            base = sc.nextInt();
        }
        if (base == 2) {
            decimalBinario(num);
        } else if (base == 8) {
            decimalOctal(num);
        } else {
            decimalHexadecimal(num);
        }
    }

    public static void decimalBinario(int num) {
        if (num < 2) {
            System.out.print(num);
        } else {
            decimalBinario(num / 2);
            System.out.print(num % 2);
        }
    }

    public static void decimalOctal(int num) {
        if (num < 8) {
            System.out.print(num);
        } else {
            decimalOctal(num / 8);
            System.out.print(num % 8);
        }
    }

    public static void decimalHexadecimal(int num) {
        if (num < 16) {
            System.out.print(HexToString(num));
        }else{
            decimalHexadecimal(num/16);
            System.out.print(HexToString(num%16));
        }
    }
    
    public static String HexToString(int num){
        if (num == 10) {
                return "A";
            } else if (num == 11) {
                return "B";
            } else if (num == 12) {
                return "C";
            } else if (num == 13) {
                return "D";
            } else if (num == 14) {
                return "E";
            } else if (num == 15) {
                return "F";
            } else {
                return ""+num;
            }
    }
}
