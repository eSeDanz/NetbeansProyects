/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3t7;

public class Publicacion {
    private String codigo;
    private String titulo;
    private int año;
    
    public Publicacion(String cod, String tit, int año) {
        codigo = cod;
        titulo = tit;
        this.año = año;
    }
    
    @Override
    public String toString() {
    return "Título: "+titulo+"\nCódigo: "+codigo+"\nAño: "+año;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAño() {
        return año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    public void setAño(int año) {
        this.año = año;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
