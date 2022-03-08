/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2evaluacion;

import java.util.HashMap;

public abstract class Figura {

    private int base;
    private int altura;
    public static int nTotal;
    public static HashMap<Integer, Character> relleno;

    public Figura() {
        nTotal++;
    }

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
        nTotal++;
    }

    public static void rellenarRelleno() {
        relleno = new HashMap<>();
        relleno.put(1, '*');
        relleno.put(2, '$');
        relleno.put(3, '@');
        relleno.put(4, '&');
        relleno.put(5, '€');
    }
    
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public abstract double area();

    public abstract double perimetro();
    
    public abstract void mostrarDibujo();

    @Override
    public String toString() {
        return "\nBase: " + base
                + "\nAltura: " + altura
                + "\nÁrea: " + this.area()
                + "\nPerímetro: " + this.perimetro();
    }
}
