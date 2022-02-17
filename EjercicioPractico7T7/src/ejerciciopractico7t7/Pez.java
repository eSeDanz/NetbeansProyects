/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico7t7;

public class Pez {

private String nombre;
private static int numpeces = 0;

public Pez() {
    nombre = "Nemo";
    numpeces++;
}

public Pez (Pez p) {
    nombre = p.nombre;
    numpeces++;
}

public static int getNumPeces(){
    return numpeces;
}

public String getNombre(){
    return this.nombre;
}

public void setNombre(String n) {
    this.nombre = n;
}

public boolean equals(Pez p){
    if(this.nombre.equals(p.nombre))
        return true;
    else
        return false;
}

@Override
public String toString(){
    return nombre;
}

    public static void main(String[] args) {
        Pez p1 = new Pez();
        Pez p2 = new Pez(p1);
        
        System.out.println("Número de peces creados: "+ Pez.getNumPeces());
        
        if(p1.equals(p2))
            System.out.println(p1.getNombre() +" es igual a "+ p2.getNombre());
            System.out.println(p1.toString() +" y "+ p2+ " son iguales");
    }
    
}
