/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto4t6;

/**
 *
 * @author alumno
 */
public class satelite {

    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    satelite(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    satelite() {
        meridiano = paralelo = distancia_tierra = 0;
    }

    public void setPosicion(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    public void variaAltura(double desplazamiento) {
        distancia_tierra = distancia_tierra + desplazamiento;
    }

    public boolean enOrbita() {
        if (distancia_tierra <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void variaPosicion(double variap, double variam) {
        paralelo = paralelo + variap;
        meridiano = meridiano + variam;
    }

    public void printPosicion() {
        System.out.println("El satellite se encuentra en el paralelo " + paralelo + " meridiano " + meridiano + " a una distancia de la tierra de " + distancia_tierra + " kilómetros");
    }
}
