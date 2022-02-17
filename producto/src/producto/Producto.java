/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto;

/**
 *
 * @author alumno
 */
public class Producto {

    double precio;
    static double rebaja;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecioFinal() {
        return (this.precio - (this.precio * rebaja / 100));
    }

    public static void infoRebajaActual() {
        System.out.println("Rebaja actual: " + rebaja + "%.");
    }

    public static void main(String[] args) {
        Producto p1 = new Producto(10);
        Producto p2 = new Producto(30);
        Producto.infoRebajaActual();
        System.out.println("Precio p1: " + p1.getPrecioFinal());
        System.out.println("Precio p2: " + p2.getPrecioFinal());
        
        p2.rebaja = 25;
        p1.infoRebajaActual();
        System.out.println("Precio p1 primeras rebajas: " + p1.getPrecioFinal());
        System.out.println("Precio p2 primeras rebajas: " + p2.getPrecioFinal());
        
        Producto.rebaja = 50;
        p2.infoRebajaActual();
        System.out.println("Precio p1 segundas rebajas: " + p1.getPrecioFinal());
        System.out.println("Precio p2 segundas rebajas: " + p2.getPrecioFinal());
    }

}
