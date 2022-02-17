/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto1t6;

public class EjercicioPropuesto1T6 {

    private double cambio;
    //Constructores
    public EjercicioPropuesto1T6() {
        cambio = 1.36;
    }
    public EjercicioPropuesto1T6(double cambioV) {
        cambio = cambioV;
    }
    //Métodos
    public double dolarToEuros(double dolar) {
        return dolar / cambio;
    }
    public double eurosToDolar(double euro){
        return euro * cambio;
    }
    //Main
    public static void main(String[] args) {
        EjercicioPropuesto1T6 f1 = new EjercicioPropuesto1T6();
        EjercicioPropuesto1T6 f2 = new EjercicioPropuesto1T6(1.50);
            System.out.println(f1.cambio);
            System.out.println(f2.cambio);
            System.out.println(f1.dolarToEuros(50));
            System.out.println(f2.dolarToEuros(50));
            System.out.println(f1.eurosToDolar(50));
            System.out.println(f2.eurosToDolar(50));
    }
    
}
