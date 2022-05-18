/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico7t12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vehiculo implements Serializable {

    private String matricula;
    private String marca;
    private String modelo;
    private transient double tamDepo;
    private static final String RUTA = "C:\\Users\\Dani\\Rogelio\\NetbeansProyects\\EjercicioPractico7T12\\src\\ejerciciopractico7t12\\Serializado.bin";
    private static final long serialVersionUID = 1L;
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Vehiculo v1= new Vehiculo("4554-KFK", "Mini", "John Cooper Works", 40);
        serializar(v1);
        Vehiculo recuperado=leerSerializado();
        System.out.println(recuperado.matricula);
        System.out.println(recuperado.marca);
        System.out.println(recuperado.modelo);
    }

    public Vehiculo(String matricula, String marca, String modelo, double tamDepo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tamDepo = tamDepo;
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
    
    public void solicitarDatos() {   
        boolean error;
        do {
            error = false;
            try {
                System.out.print("Introduce la matricula: ");
                matricula = sc.nextLine();
                System.out.print("Introduce la marca: ");
                marca = sc.nextLine();
                System.out.print("Introduce el modelo: ");
                modelo = sc.nextLine();
                System.out.print("Introduce el tamaño del deposito en litros: ");
                tamDepo = sc.nextDouble();
            } catch (InputMismatchException ime) {
                System.out.println("Error en el tipo de datos introducidos");
                error = true;
            } sc.nextLine();
        } while (error);
    }
    
    public static void serializar(Vehiculo v) throws FileNotFoundException, IOException{
        FileOutputStream fos= new FileOutputStream(RUTA);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(v);
        oos.close();
        fos.close();
    }
    
    public static Vehiculo leerSerializado() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis= new FileInputStream(RUTA);
        ObjectInputStream ois= new ObjectInputStream(fis);
        Vehiculo recuperado= (Vehiculo)ois.readObject();
        ois.close();
        fis.close();
        return recuperado;
    }
}
