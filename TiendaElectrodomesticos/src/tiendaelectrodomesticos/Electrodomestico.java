/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

import java.util.HashMap;


public abstract class Electrodomestico {
    private String modelo;
    private double pbase;
    protected char consumo;
    private double peso;
    private static final String MODELODEF="Desconocido";
    private static final double PBASEDEF=100;
    private static final char CONSUMODEF='F';
    private static final double PESODEF=5; 
    public static int numtotal;
    public static HashMap<Character,Double> letras; 
    
    
    public Electrodomestico(){
        modelo=MODELODEF;
        pbase=PBASEDEF;
        consumo=CONSUMODEF;
        peso=PESODEF;
        numtotal++;
    }

    public Electrodomestico(String modelo, double pbase, char consumo, double peso) {
        this.modelo = modelo;
        this.pbase = pbase;
        //this.consumo = consumo;
        comprobarConsumo(consumo);
        this.peso = peso;
        numtotal++;
    }
    
    public static void rellenarLetras() {
        letras = new HashMap<>();
        letras.put('A', (double)100);
        letras.put('B', (double)80);
        letras.put('C', (double)60);
        letras.put('D', (double)50);
        letras.put('E', (double)30);
        letras.put('F', (double)10);
    }

    public String getModelo() {
        return modelo;
    }

    public double getPbase() {
        return pbase;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    public static int getNumtotal() {
        return numtotal;
    }

    public static HashMap<Character, Double> getLetras() {
        return letras;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPbase(double pbase) {
        this.pbase = pbase;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static void setLetras(HashMap<Character, Double> letras) {
        Electrodomestico.letras = letras;
    }
    
    private void comprobarConsumo(char letra) {
        if(letra < 'A' || letra > 'F') {
            this.consumo= CONSUMODEF;
        }
        else
            this.consumo = letra;
    }
    
    public double incrementoPrecio() {
        
    }
}
