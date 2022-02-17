/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4ejerciciopropuesto10;

/**
 *
 * @author Dani
 */
public class ConversorSegundosCutre {

    public static void main(String[] args) {
        int t = 86512;
        int horas = t / 3600;
        t %= 3600;
        int minutos = t / 60;
        t %= 60;
        if (horas > 1) {
            System.out.println(horas + " horas");
        } else if (horas == 1) {
            System.out.println(horas + " hora");
        }
        if (minutos > 1) {
            System.out.println(minutos + " minutos");
        } else if (minutos == 1) {
            System.out.println(minutos + " minuto");
        }
        if (t > 1) {
            System.out.println(t + " segundos");
        } else if (t == 1) {
            System.out.println(t + " segundo");
        } else {
            System.out.println("Has puesto 0 segundos o un numero negativo");
        }
    }
}
