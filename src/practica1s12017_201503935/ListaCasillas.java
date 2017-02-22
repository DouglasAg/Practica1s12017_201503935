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
public class ListaCasillas {
    private NodoCasilla inicio;
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

    public void agregarAlFinal(int x, int y) {
        NodoCasilla nuevo = new NodoCasilla();
        nuevo.setX(x);
        nuevo.setY(y);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            NodoCasilla aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }


    public void eliminar() {
        inicio = null;
        tamanio = 0;
    }

    public void listar() {
        if (!esVacia()) {
            NodoCasilla aux = inicio;
            int i = 0;
            while (aux != null) {
                System.out.println(i + "Pos x:" + aux.getX());
                System.out.println(i + "Pos y:" + aux.getY());
                aux = aux.getSiguiente();
                i++;
            }
        }
    }

}
