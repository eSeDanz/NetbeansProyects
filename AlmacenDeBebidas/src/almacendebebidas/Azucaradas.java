/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacendebebidas;

public class Azucaradas extends Bebidas {

    private double porcentajeAzucar;
    private boolean promocion;

    public Azucaradas(double porcentajeAzucar, boolean promocion, int identificador, double cantidadLitros, double precio, String marca) {
        super(identificador, cantidadLitros, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    @Override
    public double getPrecio() {
        if (isPromocion() == true) {
            return super.getPrecio() * 0.9;
        } else {
            return super.getPrecio();
        }
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public String toString() {
        return "Bebida Azucarada( " + super.toString() + ", Porcentaje de Azucar: " + porcentajeAzucar + ", Promoción: " + promocion + ")";
    }
}
