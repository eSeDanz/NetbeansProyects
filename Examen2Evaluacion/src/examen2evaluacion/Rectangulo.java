/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2evaluacion;

public class Rectangulo extends Figura {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return this.getBase()*this.getAltura();
    }

    @Override
    public double perimetro() {
        return 2*(getBase()+getAltura());
    }
    
    public void mostrarDibujo() {
        
    }
}
