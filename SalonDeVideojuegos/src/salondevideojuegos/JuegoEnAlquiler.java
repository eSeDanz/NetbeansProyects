/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salondevideojuegos;

public class JuegoEnAlquiler extends Juego implements Alquilable {

    private double precio;
    private int numcopias = 0;
    private int numdias;

    public JuegoEnAlquiler() {
        super();
    }

    public JuegoEnAlquiler(String titulo, String fabricante, int año, double precio, int numdias, int numcopias) {
        super(titulo, fabricante, año);
        this.precio = precio;
        this.numdias = numdias;
        this.numcopias = numcopias;
        super.setTotaljuegos(numcopias);
    }

    public JuegoEnAlquiler(JuegoEnAlquiler jue) {
        super(jue.getTitulo(), jue.getFabricante(), jue.getAño());
        this.precio = jue.precio;
        this.numdias = jue.numdias;
        this.numcopias = jue.numcopias;
        super.setTotaljuegos(jue.numcopias);
    }

    @Override
    public void alquilar() {
        numcopias--;
    }

    @Override
    public void devolver() {
        numcopias++;
    }

    @Override
    public double precioFinal() {
        return this.precio * this.numdias;
    }

    @Override
    public String toString() {
        return "Titulo: " + super.getTitulo()
                + "\nFabricante: " + super.getFabricante()
                + "\nAño: " + super.getAño()
                + "\nPrecio por dia: " + this.precio
                + "\nNumero de dias de alquiler: " + this.numdias
                + "\nPrecio Final del alquiler: " + precioFinal()
                + "\nNumero de copias disponibles: " + this.numcopias
                + "\n";
    }
}
