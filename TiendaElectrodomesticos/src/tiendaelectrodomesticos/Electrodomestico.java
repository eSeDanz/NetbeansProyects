/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

import java.util.HashMap;

/**
 *
 * @author alumno
 */
public abstract class Electrodomestico {
    private String modelo;
    private double pbase;
    protected char consumo;
    private double peso;
    public static int numtotal;
    public static HashMap<Character,Double> letras; 
    
    
    public Electrodomestico(){
        modelo="Desconocido";
        pbase=100;
        consumo='F';
        peso=5;
        numtotal++;
    }

    public Electrodomestico(String modelo, double pbase, char consumo, double peso) {
        this.modelo = modelo;
        this.pbase = pbase;
        this.consumo = consumo;
        this.peso = peso;
        numtotal++;
    }
}
