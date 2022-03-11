/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricamonedatimbre;

/**
 *
 * @author alumno
 */
public class Billete extends Dinero {
    private double altura;
    private double anchura;

    public Billete(double altura, double anchura, double valor, int anyoEmi) {
        super(valor, anyoEmi);
        this.altura = altura;
        this.anchura = anchura;
    }
    
    public Billete(Billete f1) {
        super(f1.getValor(), f1.getAnyoEmi());
        this.altura= f1.altura;
        this.anchura= f1.anchura;
    }   
    
     @Override
    public String toString() {
        return "BILLETE" ;

    }
}
