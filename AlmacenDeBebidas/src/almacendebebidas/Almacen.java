/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacendebebidas;

import java.io.Serializable;

public class Almacen implements Serializable {

    private static final long serialVersionUID = 1L;
    private Bebidas[][] almacen;

    public Almacen(int filas, int columnas) {
        almacen = new Bebidas[filas][columnas];
    }

    public Bebidas[][] getAlmacen() {
        return almacen;
    }

    public void agregarBebida(Bebidas b) {
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[0].length; j++) {
                if (almacen[i][j] == null) {
                    almacen[i][j] = b;
                    return;
                }
            }
        }
    }

    public boolean eliminarBebida(int identificador) {
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[0].length; j++) {
                if (almacen[i][j].getIdentificador() == identificador) {
                    almacen[i][j] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public void calcularPrecioTotal() {
        double precioTotal = 0;
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[0].length; j++) {
                precioTotal += almacen[i][j].getPrecio();
            }
        }
        System.out.println("El precio total de todas las bebidas en el almacen es igual a: " + precioTotal + " euros");
    }

    public void calcularPrecioTotalMarca(String marca) {
        double precioMarca = 0;
        int index = 0;
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[0].length; j++) {
                if (almacen[i][j].getMarca() == marca) {
                    precioMarca += almacen[i][j].getPrecio();
                    index++;
                }
            }
        }
        if (index == 0) {
            System.out.println("No se han encontrado bebidas de esa marca en el almacén");
        } else {
            System.out.println("El precio total de todas las bebidas de la marca " + marca + " es igual a: " + precioMarca + " euros");
        }
    }

    public void calcularPrecioEstante(int fila) {
        double precioEstante = 0;
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[0].length; j++) {
                if (i == fila) {
                    precioEstante += almacen[i][j].getPrecio();
                }
            }
        }
        if (precioEstante == 0) {
            System.out.println("No hay bebidas en esa fila del almacén");
        } else {
            System.out.println("El precio total de todas las bebidas en el estante " + fila + " es igual a: " + precioEstante + " euros");
        }
    }

    public void contarBebidasAlmacen() {
        int numBebidas = 0;
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[0].length; j++) {
                if (almacen[i][j] != null) {
                    numBebidas++;
                }
            }
        }
        if (numBebidas == 0) {
            System.out.println("No hay bebidas en el almacén");
        } else {
            System.out.println("En el almacen hay " + numBebidas + " bebidas en total");
        }
    }

    public void mostrarInformacion() {
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[0].length; j++) {
                almacen[i][j].toString();
            }
        }
    }
}
