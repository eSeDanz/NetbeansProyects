/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refactorizacion5;

public class Circulo extends Forma {
    
    public Circulo(double lado) {
        super(lado);
    }
    
    @Override
    public double area() {
        return Math.PI*(Math.pow(super.getLado(), 2));
    }
}
