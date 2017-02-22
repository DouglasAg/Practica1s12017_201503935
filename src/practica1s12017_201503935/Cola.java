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
public class Cola {

    private NodoCola inicio;
    private int tamanio;

    public void Lista() {
        inicio = null;
        tamanio = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregar(String valor) {
        NodoCola nuevo = new NodoCola();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            NodoCola aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public String eliminar() {
        NodoCola aux = new NodoCola();
        aux = inicio;
        if (aux.getSiguiente() == null) {
            inicio = null;
        } else {
            inicio = aux.getSiguiente();
        }
        return aux.getValor();
    }

    public void listar() {
        if (!esVacia()) {
            NodoCola aux = inicio;
            int i = 0;
            while (aux != null) {
                System.out.println(i + "Dato" + aux.getValor());
                aux = aux.getSiguiente();
                i++;
            }
        }
    }

}
