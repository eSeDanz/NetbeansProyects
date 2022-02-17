/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3t7;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado;
    
    public Libro(String cod, String tit, int año) {
        super(cod, tit, año);
        prestado = false;       
    }
    
    @Override
    public String toString() {
        if (prestado == false) {
            return super.toString()+"\nPrestado: No";
        }   else {
            return super.toString()+"\nPrestado: Si";
        }
    }

    @Override
    public void prestar() {
        prestado = true;
    }
    
    @Override
    public void devolver() {
        prestado = false;
    }
    
    @Override
    public boolean prestado() {
        return prestado;
    }
    
    @Override
    public String getCodigo() {
        return super.getCodigo();
    }

    @Override
    public int getAño() {
        return super.getAño();
    }
    
}

