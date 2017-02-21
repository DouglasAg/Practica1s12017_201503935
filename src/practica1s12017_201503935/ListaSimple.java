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
public class ListaSimple {

    private NodoSimple inicio;
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

    public void agregarAlFinal(String valor) {
        NodoSimple nuevo = new NodoSimple();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            NodoSimple aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public void agregarAlInicio(String valor) {
        NodoSimple nuevo = new NodoSimple();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }

    public boolean buscar(String referencia) {
        NodoSimple aux = inicio;
        boolean encontrado = false;
        while (aux != null && encontrado != true) {
            if (referencia == aux.getValor()) {
                encontrado = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }

    public void eliminar() {
        inicio = null;
        tamanio = 0;
    }

    public void listar() {
        if (!esVacia()) {
            NodoSimple aux = inicio;
            int i = 0;
            while (aux != null) {
                System.out.println(i + "Valor .[ " + aux.getValor() + " ]");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }

}
