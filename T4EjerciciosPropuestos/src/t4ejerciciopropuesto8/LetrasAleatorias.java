/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4ejerciciopropuesto8;

/**
 *
 * @author Dani
 */
public class LetrasAleatorias {

    public static void main(String[] args) {

        char letra;
        boolean vocal;

        letra = (char) (Math.random() * 26 + 65);
        vocal = ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U'));

        System.out.println("La letra seleccionada es la " + letra);
        if (vocal == true) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una consonante");
        }

    }
}
