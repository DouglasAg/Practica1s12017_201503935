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
public class NodoCola {
    private String valor;
    private NodoCola siguiente;

    public void Nodo(){
        this.valor = "";
        this.siguiente = null;
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
}
