/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricamonedatimbre;

public class Moneda extends Dinero {
    private double diametro;
    private double peso;

    public Moneda(double valor, int anyoEmi, double diametro, double peso) {
        super(valor, anyoEmi);
        this.diametro = diametro;
        this.peso = peso;
    }
    
    public Moneda(Moneda f1) {
        super(f1.getValor(), f1.getAnyoEmi());
        this.diametro= f1.diametro;
        this.peso= f1.peso;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getPeso() {
        return peso;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "MONEDA\n" + 
               super.toString() +
               "\nDiametro: " + diametro +
               "\nPeso: " + peso;
    }
}
