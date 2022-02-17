/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto7t5;

public class consumo {
    private double Kms;
    private double litros;
    private double vmed;
    private double Pgas;
    //constructor
    public consumo(){
        Kms = 0;
        litros = 0;
        vmed = 0;
        Pgas = 0;
    }   
    public consumo(double k, double l, double v, double pg){
        Kms = k;
        litros = l;
        vmed = v;
        Pgas = pg;
    }   
    //métodos
    public double getTiempo(){
        double horas;
        horas = Kms / vmed;
        return horas;
    }
    public double consumoMedio(){
        return (litros * 100)/Kms;
    }
    public double consumoEuros(){
        return ((litros * Pgas)*100)/Kms;
    }
    public void setKms(double k){
        Kms = k;
    }
    public void setLitros(double l){
        litros = l;
    }
    public void setVmed(double v){
        vmed = v;
    }
    public void setPGas(double pg){
        Pgas = pg;
    }
}
