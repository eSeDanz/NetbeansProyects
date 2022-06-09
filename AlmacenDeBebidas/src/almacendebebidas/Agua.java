/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacendebebidas;

public class Agua extends Bebidas {

    private String manantial;

    public Agua(String manantial, int identificador, double cantidadLitros, double precio, String marca) {
        super(identificador, cantidadLitros, precio, marca);
        this.manantial = manantial;
    }

    public String getManantial() {
        return manantial;
    }

    public void setManantial(String manantial) {
        this.manantial = manantial;
    }

    @Override
    public String toString() {
        return "Agua Mineral( " + super.toString() +", Manantial: "+manantial+")";
    }
}
