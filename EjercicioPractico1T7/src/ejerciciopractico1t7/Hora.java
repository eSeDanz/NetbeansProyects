/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico1t7;

public class Hora {
    private int hora;
    private int minuto;

    public Hora (int hora, int minuto) {
        this.hora=hora;
        this.minuto=minuto;
    }
    
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
    
    @Override
    public String toString() {
        return this.hora+":"+this.minuto;
    }
}
