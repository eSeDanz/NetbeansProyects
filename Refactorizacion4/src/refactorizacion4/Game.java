/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refactorizacion4;

public class Game {

    Player p;

    public static void main(String[] args) {

    }

    public void movement(String m) {
        if (m.equalsIgnoreCase("Derecha")) {
            p.mueveDerecha();
        }
        if (m.equalsIgnoreCase("Izquierda")) {
            p.mueveIzquierda();
        }
        if (m.equalsIgnoreCase("Arriba")) {
            p.mueveArriba();
        }
        if (m.equalsIgnoreCase("Abajo")) {
            p.mueveAbajo();
        }
    }
}
