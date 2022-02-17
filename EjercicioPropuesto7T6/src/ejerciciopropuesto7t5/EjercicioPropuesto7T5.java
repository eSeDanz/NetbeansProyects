/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto7t5;


public class EjercicioPropuesto7T5 {


    public static void main(String[] args) {
        consumo f1 = new consumo(100,1,86,1.21);
        System.out.println("El tiempo empleado en realizar el viaje es "+f1.getTiempo()+ " horas");
        System.out.println("El consumo medio del vehiculo en litros cada 100 kilometros es "+f1.consumoMedio());
        System.out.println("El consumo medio del vehiculo en euros cada 100 kilometros es "+f1.consumoEuros());
        f1.setKms(200);
        f1.setLitros(3);
        f1.setVmed(100);
        f1.setPGas(1.11);
        System.out.println("El tiempo empleado en realizar el viaje es "+f1.getTiempo()+ " horas");
        System.out.println("El consumo medio del vehiculo en litros cada 100 kilometros es "+f1.consumoMedio());
        System.out.println("El consumo medio del vehiculo en euros cada 100 kilometros es "+f1.consumoEuros());
    }
    
}
