/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {        
        Libro f1 = new Libro();
        f1.setISBN(4587);
        f1.setTitulo("Diferente");
        f1.setAutor("Eloy Moreno");
        f1.setNumpag(392);
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce el ISBN: ");
        int ISBN = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el título: ");
        String titulo = sc.nextLine();
        System.out.print("Introduce el autor: ");
        String autor = sc.nextLine();
        System.out.print("Introduce el número de páginas: ");
        int numpag = sc.nextInt();
        Libro f2 = new Libro(ISBN, titulo, autor, numpag);  
        System.out.println("");
        Libro f3 = new Libro(456, "La bestia", "Carmen Mola", 544);
        f1.mostrarTodo();
        f2.mostrarTodo();
        f3.mostrarTodo();
        Libro.muestraLibros();
        if (f1.getNumpag()>f2.getNumpag() && f1.getNumpag()>f3.getNumpag()) {
            System.out.println("El libro con más páginas es "+f1.getTitulo());
        } else if (f2.getNumpag()>f1.getNumpag() && f2.getNumpag()>f3.getNumpag()) {
            System.out.println("El libro con más páginas es "+f2.getTitulo());
        } else {
            System.out.println("El libro con más páginas es "+f3.getTitulo());
        }
    }
    
}
