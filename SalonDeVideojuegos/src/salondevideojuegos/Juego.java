/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salondevideojuegos;

import java.util.Calendar;

public abstract class Juego {

    private String titulo;
    private String fabricante;
    private int año;
    private static int totaljuegos = 0;
    private static final int AÑODEF = 1970;

    public Juego() {
        titulo = "Sin titulo";
        fabricante = "Desconocido";
        año = AÑODEF;
    }

    public Juego(String tit, String fab, int año) {
        titulo = tit;
        fabricante = fab;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAño() {
        return año;
    }

    public static int getTotaljuegos() {
        return totaljuegos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public static void setTotaljuegos(int numcopias) {
        totaljuegos += numcopias;
    }

    private void comprobarAño(int a) {
        Calendar cal = Calendar.getInstance();
        int año = cal.get(Calendar.YEAR);
        if (a < 1970 || a > año) {
            this.año = AÑODEF;
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo
                + "\nFabricante: " + this.fabricante
                + "\nAño: " + this.año;
    }

    public boolean equals(Juego m) {
        if (this.titulo.equals(m.getTitulo()) && this.fabricante.equals(m.getFabricante()) && this.año == m.getAño()) {
            return true;
        }
        return false;
    }

    public int compareTo(Juego m) {
        if (this.titulo.compareTo(m.getTitulo()) < 0) {
            return -1;
        } else if (this.titulo.compareTo(m.getTitulo()) > 0) {
            return 1;
        } else if (this.fabricante.compareTo(m.getFabricante()) < 0) {
            return -1;
        } else if (this.fabricante.compareTo(m.getFabricante()) > 0) {
            return 1;
        } else if (this.año < m.getAño()) {
            return -1;
        } else if (this.año > m.getAño()) {
            return 1;
        } else {
            return 0;
        }
    }
}
