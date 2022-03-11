/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricamonedatimbre;

public class Moneda extends Dinero {
    private double diametro;
    private double peso;

    public Moneda(double diametro, double peso, double valor, int anyoEmi) {
        super(valor, anyoEmi);
        this.diametro = diametro;
        this.peso = peso;
    }
    
    public Moneda(Moneda f1) {
        super(f1.getValor(), f1.getAnyoEmi());
        this.diametro= f1.diametro;
        this.peso= f1.peso;
    }
}
