/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refactorizacion4;
    
public class Player {
    int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void mueveDerecha() {
        this.x+=1;
    }
    
    public void mueveIzquierda() {
        this.x-=1;
    }
    
    public void mueveArriba() {
        this.y-=1;
    }
    
    public void mueveAbajo(){
        this.y+=1;
    }
}
