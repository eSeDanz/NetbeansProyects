/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico2t7;

public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;
    
    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion =  duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "Título :"+titulo
                +"\nAutor :"+autor
                +"\nFormato :"+formato
                +"\nDuración :"+ duracion;
    }
    
    public void equals(Multimedia m) {
        if (this.titulo.equals(m.getTitulo()) && this.autor.equals(m.getAutor()))
            System.out.println("Titulo y autor son iguales");
        else { System.out.println("Titulo y autor son diferentes");
        }
//                return true;
//        return false;
    }
}
