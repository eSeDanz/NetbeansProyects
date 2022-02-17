/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto5t6;

public class peso {
    private double pesokg;
    public peso() {
        pesokg = 30;
    }
    public peso(double p, String m) {
        switch (m) {
            case "Lb": pesokg = p * 0.453;
            break;
            case "Li": pesokg = p / 14.59;
            break;
            case "Oz": pesokg = p * 0.02835;
            break;
            case "P": pesokg = p * 0.00155;
            break;
            case "K": pesokg = p;
            break;
            case "G": pesokg = p * 1000;
            break;
            case "Q": pesokg = p / 43.3;
            break;
            default: pesokg = 0;
        }
    }
    public double getLibras() {
        return pesokg / 0.453;
    }
    public double getLingotes() {
        return pesokg * 14.59;
    }
    public double getPeso(String m) {
        switch (m) {
            case "Lb": return pesokg / 0.453;
            case "Li": return pesokg * 14.59;
            case "Oz": return pesokg / 0.02835;
            case "P": return pesokg / 0.00155;
            case "K": return pesokg;
            case "G": return pesokg / 1000;
            case "Q": return pesokg * 43.3;
            default: return 0;
        }
    }
}
