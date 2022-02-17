/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico8t7;

/**
 *
 * @author alumno
 */
public class Encargado extends Empleado{
    
    @Override
    public double getSueldo(){
        return (super.getSueldo() * 1.1);
    }
    
}
