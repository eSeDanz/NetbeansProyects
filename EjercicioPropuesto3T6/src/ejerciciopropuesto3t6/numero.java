/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto3t6;

public class numero {
    private int valor;
    //Constructores
    public numero(){
        valor=0;
    }
    public numero(int n){
        valor=n;
    }
    //Métodos
    public void anyade(int a){
        valor= valor + a;
    }
    public void resta(int b){
        valor = valor - b;
    }
    public int getValor(){
        return valor;
    }
    public int getDoble() {
        return valor *2;
    }
    public int getTriple() {
        return valor *3;
    }
    public void setValor(int v){
        valor = v;
    }
}
