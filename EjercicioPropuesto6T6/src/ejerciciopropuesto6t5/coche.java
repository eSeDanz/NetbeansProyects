/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto6t5;

public class coche {
    private String marca;
    private String modelo;
    public coche() {
        marca = "Ferrari";
        modelo = "F40";
    }
    public coche(String mar, String mod) {
        marca = mar;
        modelo = mod;
    }
    public void sout() {
        System.out.println("La marca es "+ marca);
        System.out.println("El modelo es "+modelo);
    }
}
