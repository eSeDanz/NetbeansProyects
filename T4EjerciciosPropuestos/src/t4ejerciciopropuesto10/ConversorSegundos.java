/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4ejerciciopropuesto10;

/**
 *
 * @author Dani
 */
public class ConversorSegundos {

    public static void main(String[] args) {
        int t = 86512;
        int[] resultado = conversor(t);
        
        System.out.println("Horas: " + resultado[0]);
        System.out.println("Minutos: " + resultado[1]);
        System.out.println("Segundos: " + resultado[2]);
    }

    public static int[] conversor(int t) {
        int horas = t / 3600;
        t %= 3600;
        int minutos = t / 60;
        t %= 60;

        int[] tiempo = {horas, minutos, t};

        return tiempo;
    }
}
