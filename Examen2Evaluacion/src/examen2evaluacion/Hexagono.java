/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2evaluacion;

public class Hexagono extends Figura {

    public Hexagono(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return (this.perimetro() * (this.getAltura() / 2)) / 2;
    }

    @Override
    public double perimetro() {
        return 6 * this.getBase();
    }

    //Dibujo sensual
    @Override
    public void mostrarDibujo() {
        int alt;
        if (this.getAltura() % 2 == 0) {
            alt = this.getAltura() / 2;
        } else {
            alt = this.getAltura() / 2 + 1;
        }
        
        for (int i = 1; i <= alt; i++) {
            //Espacios en blanco
            for (int k = 1; k <= alt - i; k++) {
                System.out.print(" ");
            }
            //Asteriscos
            for (int j = 1; j <= (2 * i) - 1 + this.getBase() - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = alt-1; i >= 1; i--) {
            //Espacios en blanco
            for (int k = alt-i; k >= 1; k--) {
                System.out.print(" ");
            }
            //Asteriscos
            for (int j = (2 * i) - 1 + this.getBase() - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
