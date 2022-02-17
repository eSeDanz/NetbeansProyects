/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5supuestopractico7;

import java.io.IOException;

/**
 *
 * @author alumno
 */
public class WhileRaro {

    public static void main(String[] args) throws IOException {

        System.out.print("Introduzca un texto: ");
        while (true) {
            int letra = System.in.read();
            System.out.println((char) letra);
        }
    }
}
