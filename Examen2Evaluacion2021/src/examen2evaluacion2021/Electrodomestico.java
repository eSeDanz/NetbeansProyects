/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2evaluacion2021;

import java.util.HashMap;

public abstract class Electrodomestico {

    private String modelo;
    private double precio_base;
    protected char consumo;
    private double peso;
    public static int nTotal;
    public static HashMap<Character, Integer> letras;

    public Electrodomestico() {
        modelo = "Desconocido";
        precio_base = 100;
        consumo = 'F';
        peso = 5;
        nTotal++;
    }

    public Electrodomestico(String modelo, double precio_base, char consumo, double peso) {
        this.modelo = modelo;
        this.precio_base = precio_base;
        comprobarConsumo(consumo);
        this.peso = peso;
        nTotal++;
    }

    public static void rellenarLetras() {
        letras = new HashMap<>();
        letras.put('A', 100);
        letras.put('B', 80);
        letras.put('C', 60);
        letras.put('D', 50);
        letras.put('E', 30);
        letras.put('F', 10);
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioBase() {
        return precio_base;
    }

    public double getPeso() {
        return peso;
    }

    public void setModelo(String m) {
        modelo = m;
    }

    public void setPrecioBase(double p) {
        precio_base = p;
    }

    public void setPeso(double p) {
        peso = p;
    }

    private void comprobarConsumo(char letra) {
        if (letra < 'A' || letra > 'F') {
            consumo = 'F';
        } else {
            consumo = letra;
        }
    }

    public final double incrementoPrecio() {
        double plus;
        plus = (double) letras.get(consumo);

        if (peso >= 0 && peso < 19) {
            plus += 10;
        } else if (peso >= 20 && peso < 49) {
            plus += 50;
        } else if (peso >= 50 && peso <= 79) {
            plus += 80;
        } else if (peso >= 80) {
            plus += 100;
        }

        return plus;
    }

    @Override
    public String toString() {
        return "\nModelo: " + modelo
                + "\nPrecio base: " + precio_base
                + "\nConsumo: " + consumo
                + "\nPeso: " + peso;
    }
}
