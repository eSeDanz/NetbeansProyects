/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricamonedatimbre;

public abstract class Dinero {

    private double valor;
    private int anyoEmi;

    public Dinero(double valor, int anyoEmi) {
        this.valor = valor;
        this.anyoEmi = anyoEmi;
    }

    public double getValor() {
        return valor;
    }

    public int getAnyoEmi() {
        return anyoEmi;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAnyoEmi(int anyoEmi) {
        this.anyoEmi = anyoEmi;
    }

    public boolean equals(Dinero d) {
        return (this.anyoEmi == d.anyoEmi && this.valor == d.valor);
    }

    public int compareTo(Dinero d) {
        if (this.anyoEmi > d.anyoEmi) {
            return 1;
        } else if (this.anyoEmi < d.anyoEmi) {
            return -1;
        } else if (this.valor > d.valor) {
            return 1;
        } else if (this.valor < d.valor) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "valor: " + valor + "\naño: " + anyoEmi;

    }

}
