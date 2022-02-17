/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numpag;
    private static int numlib = 0;
    private static final int ISBNDEF = 204;

    public Libro() {
        ISBN = ISBNDEF;
        titulo = null;
        autor = null;
        numpag = 0;
        numlib++;
    }

    public Libro(int ISBN, String titulo, String autor, int numpag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
        numlib++;
    }

    public static void muestraLibros() {
        System.out.println("Hay "+numlib+" libros creados");
    }

    public int getISBN() {
        return this.ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setISBN(int ISBN) {
        if (this.comprobarISBN(ISBN)==true) {
        this.ISBN = ISBN;    
        } else {
            this.ISBN = ISBNDEF;
        }        
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }
    
    public boolean comprobarISBN(int ISBN) {
        boolean comprobar= false;
        if (ISBN<=999 && ISBN>=201 && ISBN%10>0) {
            comprobar= true;
        }
        return comprobar;
    }
    
    public int obtenerFilas() {
        return this.ISBN/100;
    }
    
    public int obtenerColumnas() {
        return this.ISBN%10;
    }
    
    public void mostrarQR() {
        for (int i=1; i<=this.obtenerFilas();i++) {
            System.out.print("|");
            for (int x=1; x<=this.obtenerColumnas(); x++) {
                int r = (int)Math.floor(Math.random()* 2 +0);
                if (r==0) {
                    System.out.print(" ");
                } else 
                    System.out.print("*");               
            }
            System.out.print("|");
            System.out.println("");
        }
    }
    
    public void mostrarRomboide() {
        int suma=0;
        int numero=this.obtenerFilas()*this.obtenerColumnas();
        for (int i=1; i<=this.obtenerFilas();i++) {
            for (int k = 1; k <= this.obtenerFilas()-i; k++) {
            System.out.print( " ");
            }
            for (int x=1; x<=this.obtenerColumnas(); x++) {
                int r = (int)Math.floor(Math.random()* 10 +0);
                    System.out.print(r + " ");
                    suma+=r;
            }
            System.out.println("");
        }
        System.out.println("Suma total: "+suma+"    Promedio: "+(double)suma/numero);
    }
    
    @Override
    public String toString() {
        return "El libro "+titulo+" con ISBN "+ISBN+" creado por el autor "+autor+" tiene "+numpag+" páginas.";
    }
    
    public void mostrarTodo() {
        System.out.println(this.toString());
        System.out.println("Su código QR es:");
        this.mostrarQR();
        System.out.println("Ha generado el siguiente romboide ("+this.obtenerFilas()+"x"+this.obtenerColumnas()+")");
        this.mostrarRomboide();
        System.out.println("");
    }
    
}
