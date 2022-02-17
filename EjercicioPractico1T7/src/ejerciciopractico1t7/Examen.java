/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico1t7;

public class Examen {
    private String asignatura;
    private String aula;
    private Fecha fecha;
    private Hora hora;
    
    public Examen (String as, String au, Fecha f, Hora h) {
        asignatura=as;
        aula=au;
        fecha=f;
        hora=h;
    }
    public static void main(String[] args) {
        Fecha f1 = new Fecha (05,11,2021);
        Hora h1 = new Hora (10,05);
        Examen e1 = new Examen("Programacion", "79",f1, h1);
        
    }    
}
