/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico8t7;

public class Principal {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        Encargado enc = new Encargado();
        
        emp1.setSueldo(1200);
        enc.setSueldo(1200);
        
        System.out.println("El sueldo del empleado es "+ emp1.getSueldo());
        System.out.println("El sueldo del encargado es "+ enc.getSueldo());
    }
    
}
