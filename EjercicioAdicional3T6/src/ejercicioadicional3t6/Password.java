/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioadicional3t6;
import java.lang.Math;

public class Password {
    private int longitud;
    private String contraseña;
    public static String numeros = "0123456789";
    public static String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    public static String minusculas = "abcdefghijklmnñopqrstuvwxyz";
    
    public Password() {
        longitud = 8;
        generarPassword();
    }
    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }
    public void generarPassword() {
        String pwd="";
        char pos;
        
        for (int i=1; i<=longitud; i++) {        
            int op=(int)(Math.random()*3+1);
            
            
            
            
        }
        
    }
    public int getLongitud() {
        return longitud;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
//    public boolean esFuerte() {
//        return (contraseña)
//    }
}
//https://www.programacionenjava.com/blog/2008/04/09/javabasico/generacion-de-contrasenas-passwords/