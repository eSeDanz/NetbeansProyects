/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico2t7;

public class Principal {

    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Rocky", "Stallone",Formato.midi,120,"Paco",null);
        Pelicula p2 = new Pelicula("Terminator", "Swarzenager",Formato.mp3,140,"Rodrigo",null);
        Pelicula p3 = new Pelicula("Terminator", "Pedro",Formato.avi,155,"Jesus","Maria");
        
        System.out.println(p1.toString());
        System.out.println("");
        
        p2.equals(p3);
        System.out.println("");
        
        p1.setActor("Rodrigo");
        p1.setActriz("Carmen");
        p1.setAutor("Juan");
        System.out.println(p1.toString());
        System.out.println("");
        
        Disco d1 = new Disco("Chromophobia", "Gui Boratto",Formato.midi,120,Genero.techno);
        Disco d2 = new Disco("Ame", "Richie Hawtin",Formato.mp3,140,Genero.clasica);
        Disco d3 = new Disco("Rogelio", "Yisus",Formato.avi,155,Genero.electronica);
        
        System.out.println(d1.toString());
        System.out.println("");
        
        d2.equals(d3);
        System.out.println("");
        
        d1.setGenero(Genero.electronica);
        d1.setFormato(Formato.wav);
        d1.setDuracion(6);
        System.out.println(d1.toString());
    }
    
}
