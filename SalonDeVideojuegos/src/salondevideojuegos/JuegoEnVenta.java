/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salondevideojuegos;

public class JuegoEnVenta extends Juego {

    private double precio;
    private int numcopias = 0;

    public JuegoEnVenta() {
        super();
    }

    public JuegoEnVenta(String titulo, String fabricante, int año, double precio, int numcopias) {
        super(titulo, fabricante, año);
        this.precio = precio;
        this.numcopias = numcopias;
        super.setTotaljuegos(numcopias);
    }

    public void vender() {
        numcopias--;
    }

    @Override
    public String toString() {
        return "Titulo: " + super.getTitulo()
                + "\nFabricante: " + super.getFabricante()
                + "\nAño: " + super.getAño()
                + "\nPrecio de venta: " + this.precio
                + "\nNumero de copias disponibles: " + this.numcopias;
    }
}
