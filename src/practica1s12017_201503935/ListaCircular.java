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
public class ListaCircular {

    private NodoCircular inicio;
    private NodoCircular ultimo;
    private int tamanio;

    public void Lista() {
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregar(String valor, ListaSimple lista) {
        NodoCircular nuevo = new NodoCircular();
        nuevo.setValor(valor);
        nuevo.setLetras(lista);
        
        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
        tamanio++;
    }

    public boolean buscar(String referencia) {
        NodoCircular aux = inicio;
        boolean encontrado = false;
        do {
            if (referencia.equals(aux.getValor())) {
                encontrado = true;
            } else {
                aux = aux.getSiguiente();
            }
        } while (aux != inicio && encontrado != true);
        return encontrado;
    }

    /**
     * Elimina la lista
     */
    public void eliminar() {
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }

    public void listar() {
        if (!esVacia()) {

            NodoCircular aux = inicio;
            int i = 0;
            System.out.print("-> ");
            do {
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            } while (aux != inicio);
        }
    }

}
