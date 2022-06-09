/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacendebebidas;

public abstract class Bebidas {

    private int identificador;
    private double cantidadLitros;
    private double precio;
    private String marca;

    public Bebidas(int identificador, double cantidadLitros, double precio, String marca) {
        this.identificador = identificador;
        this.cantidadLitros = cantidadLitros;
        this.precio = precio;
        this.marca = marca;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getCantidadLitros() {
        return cantidadLitros;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setCantidadLitros(double cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return  "Identificador: " + identificador + ", Cantidad de Litros: " + cantidadLitros + ", Precio: " + precio + ", Marca: " + marca;
    }    
    
}
