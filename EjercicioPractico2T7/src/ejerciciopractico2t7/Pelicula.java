/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico2t7;

public class Pelicula extends Multimedia {
    private String actor;
    private String actriz;

    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        if (actor == null && actriz == null) {
            throw new IllegalArgumentException("Ambos atributos " + "no pueden estar vacíos");
        }
        this.actor = actor;
        this.actriz = actriz;
    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()+"\nActor: "+actor
                +"\nActriz: "+actriz;
    }
}
