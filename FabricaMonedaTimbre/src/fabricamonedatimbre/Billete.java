/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricamonedatimbre;

public class Billete extends Dinero {
    private double altura;
    private double anchura;

    public Billete(double valor, int anyoEmi, double altura, double anchura) {
        super(valor, anyoEmi);
        this.altura = altura;
        this.anchura = anchura;
    }
    
    public Billete(Billete f1) {
        super(f1.getValor(), f1.getAnyoEmi());
        this.altura= f1.altura;
        this.anchura= f1.anchura;
    }   

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getAltura() {
        return altura;
    }

    public double getAnchura() {
        return anchura;
    }
    
    @Override
    public String toString() {
        return "BILLETE\n" + 
               super.toString() +
               "\nAltura: " + altura +
               "\nAnchura: " + anchura;
    }
}
