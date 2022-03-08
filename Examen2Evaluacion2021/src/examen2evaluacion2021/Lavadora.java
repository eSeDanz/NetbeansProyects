/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2evaluacion2021;

public final class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
        super();
        carga = 5;
    }

    public Lavadora(String modelo, double precio_base, char consumo, double peso, double carga) {
        super(modelo, precio_base, consumo, peso);
        this.carga = carga;
    }

    public Lavadora(Lavadora la) {
        this.setModelo(la.getModelo());
        this.setPrecioBase(la.getPrecioBase());
        this.consumo = la.consumo;
        this.setPeso(la.getPeso());
        this.carga = la.carga;
    }

    public double precioFinal() {
        double plus = super.incrementoPrecio();
        if (carga > 30) {
            plus += 50;
        }

        return this.getPrecioBase() + plus;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCarga: " + carga
                + "\nPrecio Final: " + this.precioFinal();
    }
}
