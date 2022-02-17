/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refactorizacion3;

import java.util.List;

public class Profesor extends Persona {
    String nombre;
    int edad;
    List<Prestamo> prestamos;
    
    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
    }
    
    public void printInformacionPersonal() {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Teléfono: "+ numeroDeTelefono);
    }
    
    public void printTodaLaInformacion() {
        printInformacionPersonal();
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }
}
