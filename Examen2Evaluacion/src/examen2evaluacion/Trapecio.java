/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2evaluacion;

public class Trapecio extends Figura {

    private int Base;

    public Trapecio(int base, int altura, int Base) {
        super(base, altura);
        this.Base = Base;
    }

    @Override
    public double area() {
        return (double)(this.getBase() + Base)*getAltura()/2;
    }

    @Override
    public double perimetro() {
        double x;
        x= (double)(Base-this.getBase())/2;
        double c;
        c=Math.sqrt(Math.pow(this.getAltura(), 2)+Math.pow(x, 2));
        return this.getBase()+c+c+Base;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nBase Grande: " + this.Base;
    }

    @Override
    public void setBase(int Base) {
        this.Base = Base;
    }
    
    @Override
    public void mostrarDibujo() {
        for (int i = 1; i <= this.getAltura(); i++) {
            //Espacios en blanco
            for (int k = 1; k <= this.getAltura() - i; k++) {
                System.out.print(" ");
            }
            //Asteriscos
            for (int j = 1; j <= (2 * i) - 1 + this.getBase()-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
