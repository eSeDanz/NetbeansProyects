/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.io.Serializable;

public class Libro implements Serializable {

    private String titulo;
    private String autor;
    private String editorial;
    private boolean prestado;
    private int numPasillo;
    private String ISBN;
    private double precio;
    private String bibliotecario;
    private String usuario;
    private static final long serialVersionUID = 1L;

    public Libro(String titulo, String autor, String editorial, int numPasillo, String ISBN, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPasillo = numPasillo;
        this.ISBN = ISBN;
        this.precio = precio;
        this.bibliotecario = "";
        this.usuario = "";
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public int getNumPasillo() {
        return numPasillo;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public String getBibliotecario() {
        return bibliotecario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void setBibliotecario(String bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        String prestado = "";
        if (isPrestado()) {
            prestado += "(Este libro ha sido prestado por el bibliotecario " + getBibliotecario() + " al usuario " + getUsuario()+")";
        }
        return "Titulo= " + titulo + ", autor= " + autor + ", editorial= " + editorial + ", numPasillo= " + numPasillo + ", ISBN= " + ISBN + ", precio= " + precio + " " + prestado;
    }
}
