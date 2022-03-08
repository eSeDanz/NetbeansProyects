/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2evaluacion;

public class Triangulo extends Figura {

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return (double) this.getBase() * this.getAltura() / 2;
    }

    @Override
    public double perimetro() {
        double c;
        c = Math.sqrt(Math.pow(this.getAltura(), 2) + Math.pow((double) this.getBase() / 2, 2));
        return this.getBase() + c + c;
    }

    @Override
    public void mostrarDibujo() {
        for (int i = 1; i <= this.getAltura(); i++) {
            //Espacios en blanco
            for (int k = 1; k <= this.getAltura() - i; k++) {
                System.out.print(" ");
            }
            //Asteriscos
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
