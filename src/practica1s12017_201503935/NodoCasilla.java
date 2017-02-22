/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12017_201503935;

/**
 *
 * @author ddani
 */
public class NodoCasilla {

    private int x;
    private int y;
    private NodoCasilla siguiente;

    public void Nodo() {
        this.x = 0;
        this.y = 0;
        this.siguiente = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public NodoCasilla getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCasilla siguiente) {
        this.siguiente = siguiente;
    }

}
