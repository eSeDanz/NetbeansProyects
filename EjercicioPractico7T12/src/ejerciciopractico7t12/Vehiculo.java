/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico7t12;

import java.io.Serializable;
import java.util.Scanner;


public class Vehiculo implements Serializable{

    private String matricula;
    private String marca;
    private String modelo;
    private double tamDepo;
    private static Scanner sc= new Scanner(System.in);
//    private static serialVersionUID;
    
    public static void main(String[] args) {
        
    }

    public Vehiculo(String matricula, String marca, String modelo, double tamDepo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.tamDepo=tamDepo;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTamDepo() {
        return tamDepo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamDepo(double tamDepo) {
        this.tamDepo = tamDepo;
    }
    
    public void solicitarDatos(){
        System.out.print("Introduce la matricula: ");
        matricula=sc.nextLine();
        System.out.print("Introduce la marca: ");
        marca=sc.nextLine();
        System.out.print("Introduce el modelo: ");
        modelo=sc.nextLine();
        System.out.print("Introduce el tamaño del deposito: ");
        tamDepo=sc.nextDouble();
        sc.hasNextLine();
    }
}
