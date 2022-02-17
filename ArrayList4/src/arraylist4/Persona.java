/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist4;

public class Persona {

    private String dni;
    private String apellidos;
    private String nombre;
    private char sexo;
    private int edad;
    private double peso;

    public Persona(String dni, String apellidos, String nombre, char sexo, int edad, double peso) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public String getDni() {
        return dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + ", con DNI número " + dni + ", sexo " + sexo + ", " + edad + " años, " + peso + " kilos";
    }
}
