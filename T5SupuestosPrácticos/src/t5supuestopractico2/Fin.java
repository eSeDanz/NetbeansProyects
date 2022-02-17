/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5supuestopractico2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Fin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        do {
            System.out.println("Introduce la palabra mágica: ");
            entrada = sc.nextLine();
        } while (!(entrada.equals("FIN")));
    }
}
