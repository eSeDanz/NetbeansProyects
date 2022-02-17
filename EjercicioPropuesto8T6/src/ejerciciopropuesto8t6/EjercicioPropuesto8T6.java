/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto8t6;

public class EjercicioPropuesto8T6 {
    private double Papas;
    private double Chocos;
    //Constructores
    public EjercicioPropuesto8T6 () {
        Papas = 0;
        Chocos = 0;
    }
    public EjercicioPropuesto8T6 (double p, double c) {
        Papas = p;
        Chocos = c;
    }    
    //Métodos
    public void addChocos(int x) {
        Chocos = Chocos + x;
    }   
    public void addPapas(int x) {
        Papas = Papas + x;
    }
    public int getComensales() {
        double calculop = (int) (3*Papas);
        double calculoc = (int) (3*Chocos)/0.5;
        if (calculop <= calculoc) {
            return (int) calculop;
        } else {
        return (int) calculoc;
        }
    }
    public void showChocos() {
        System.out.println("En el almacén hay " + Chocos + " Kg de Chocos.");
    }
    public void showPapas() {
        System.out.println("En el almacén hay " + Papas + " Kg de Papas.");
    }
    public static void main(String[] args) {
        EjercicioPropuesto8T6 f1 = new EjercicioPropuesto8T6(2,1);
        f1.showChocos();
        f1.showPapas();
        System.out.println("El restaurante puede atender a "+f1.getComensales()+" comensales.");
        System.out.println("Vamos a añadir Chocos y Papas al almacén...");
        f1.addChocos(1);
        f1.addPapas(2);
        f1.showChocos();
        f1.showPapas();
        System.out.println("El restaurante puede atender a "+f1.getComensales()+" comensales.");
    }

}
