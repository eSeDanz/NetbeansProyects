/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto3t6;

public class EjercicioPropuesto3T6 {

    public static void main(String[] args) {
        numero f1 = new numero(10);
        System.out.println("El valor del número es igual a "+f1.getValor());
        f1.anyade(5);
        System.out.println("El método anyade da como resultado "+f1.getValor());
        f1.resta(5);
        System.out.println("El método resta da como resultado "+f1.getValor());
        System.out.println("El método getDoble da como resultado "+f1.getDoble());
        System.out.println("El método getTriple da como resultado "+f1.getTriple());
        f1.setValor(20);
        System.out.println("El método setValor inicializa el número a "+ f1.getValor());
    }
    
}
