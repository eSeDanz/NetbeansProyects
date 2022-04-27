/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ampliacion;


public class Main {


    public static void main(String[] args) {
        System.out.println(mult_rusa(700,7));
    }
    
    public static int mult_rusa(int multiplicando, int multiplicador){
        if(multiplicando==1){
            return (multiplicador);
        } else if(multiplicando%2==0){
            return mult_rusa(multiplicando/2, multiplicador*2);
        } else {
            return multiplicador+mult_rusa(multiplicando/2, multiplicador*2);
        }
    }
}
