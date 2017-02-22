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
public class NodoCircular {

    private String valor;
    private NodoCircular siguiente;
    private ListaSimple letras;

    public void Nodo() {
        this.valor = "";
        this.siguiente = null;
        this.letras = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NodoCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }

    public ListaSimple getLetras() {
        return letras;
    }

    public void setLetras(ListaSimple letras) {
        this.letras = letras;
    }

}
