/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refactorizacion5;

public abstract class Forma {   
    
    private double lado;

    public Forma (double lado){
        this.lado = lado;        
    }

    public double getLado() {
        return lado;
    }    
    
    public abstract double area();
}


