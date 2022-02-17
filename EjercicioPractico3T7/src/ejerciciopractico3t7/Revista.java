/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3t7;

public class Revista extends Publicacion {
    private int numero;
    
    public Revista(String cod, String tit, int año, int num) {
        super(cod, tit, año);
        numero = num;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return (super.toString() + "\nNúmero: " + numero);
    }
    
    
}
