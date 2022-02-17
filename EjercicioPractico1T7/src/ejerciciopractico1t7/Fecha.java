/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico1t7;

public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha (int dia, int mes, int año) {
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    
    @Override
    public String toString() {
        return this.dia+"/"+this.mes+"/"+this.año;
    }
    
}
