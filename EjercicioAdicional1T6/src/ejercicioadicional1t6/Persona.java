/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioadicional1t6;

public class Persona {
    private String nombre;
    private int edad;
    private static final char SEXO= 'H';
    private double peso;
    private double altura;
    private char sex;
    private int numper;
    //constructor por defecto
    public Persona(){
        sex = SEXO;
        numper++;
    }
    //constructor con nombre,edad y sexo
    public Persona(String nombre, int edad, char SEXO) {
        this.nombre = nombre;
        this.edad = edad;
        this.sex = SEXO;
        numper++;
    }
    //constructor con todos los atributos como parametros
    public Persona(String nombre, int edad, char SEXO, double peso, double altura, int numper) {
        this.nombre = nombre;
        this.edad = edad;
        this.sex = SEXO;
        this.peso = peso;
        this.altura = altura;
        numper++;
    }  
    //Métodos
    public int getNumPer () {
        return numper;
    }
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
}
