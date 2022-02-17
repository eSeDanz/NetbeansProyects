/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico2t7;

public class Disco extends Multimedia {
    private Genero genero;

    public Disco(String titulo, String autor, Formato formato, int duracion, Genero genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()+"\nGenero: "+genero;
    }
}
