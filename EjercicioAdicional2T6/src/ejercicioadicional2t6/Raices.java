/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioadicional2t6;
import java.lang.Math;
public class Raices {
    public double a, b, c;
    //Constructores
    
    public Raices (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Metodos
    public void obtenerRaices() {
        double sol1 = (-b + Math.sqrt(getDiscriminante())/2*a);
        double sol2 = (-b - Math.sqrt(getDiscriminante())/2*a);
        System.out.println("Raiz 1: "+sol1);
        System.out.println("Raiz 2: "+sol2);
    }
    public void obtenerRaiz() {
        double solunica = -b/2*a;
        System.out.println("Raiz: "+solunica);
    }
    public double getDiscriminante() {
        double discriminante = Math.pow(b, 2)- 4 * a * c;
        return discriminante;
    }
    public boolean tieneRaices() {        
        if (getDiscriminante() > 0) {
            return true;
        } 
        return false;
    }
    public boolean tieneRaiz() {
        double discriminante = getDiscriminante();
        boolean Raiz = false;
        if (discriminante == 0) {
            Raiz = true;
        } return Raiz;
    }
    
    public void calcular(){
        if(tieneRaices())
            obtenerRaices();
        else if(tieneRaiz())
            obtenerRaiz();
        else
            System.out.println("No tiene solución");
    }
}

