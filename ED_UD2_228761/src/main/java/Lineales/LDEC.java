/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lineales;

import Nodos.NodoD;

/**
 *
 * @author Ilian Fernando Gastelum Romo
 */
public class LDEC {
    private NodoD inicio;
    private int tam;

    /**
     * Constructor de la lista doblemente enlazada circular.
     */
    public LDEC() {
        this.inicio = null;
        this.tam = 0;
    }

    /**
     * Verifica si la lista está vacía.
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return tam == 0;
    }

    /**
     * Obtiene el tamaño de la lista.
     * @return Número de elementos en la lista.
     */
    public int size() {
        return tam;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     * @param valor El valor a agregar.
     */
    public void addFirst(int valor) {
        NodoD nuevo = new NodoD(valor);
        if (isEmpty()) {
            nuevo.setSig(nuevo);
            nuevo.setAnt(nuevo);
            inicio = nuevo;
        } else {
            NodoD ultimo = inicio.getAnt();
            nuevo.setSig(inicio);
            nuevo.setAnt(ultimo);
            inicio.setAnt(nuevo);
            ultimo.setSig(nuevo);
            inicio = nuevo;
        }
        tam++;
    }

    /**
     * Agrega un elemento al final de la lista.
     * @param valor El valor a agregar.
     */
    public void addLast(int valor) {
        NodoD nuevo = new NodoD(valor);
        if (isEmpty()) {
            nuevo.setSig(nuevo);
            nuevo.setAnt(nuevo);
            inicio = nuevo;
        } else {
            NodoD ultimo = inicio.getAnt();
            nuevo.setSig(inicio);
            nuevo.setAnt(ultimo);
            ultimo.setSig(nuevo);
            inicio.setAnt(nuevo);
        }
        tam++;
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst() {
        if (!isEmpty()) {
            if (tam == 1) {
                inicio = null;
            } else {
                NodoD ultimo = inicio.getAnt();
                inicio = inicio.getSig();
                inicio.setAnt(ultimo);
                ultimo.setSig(inicio);
            }
            tam--;
        }
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void removeLast() {
        if (!isEmpty()) {
            if (tam == 1) {
                inicio = null;
            } else {
                NodoD ultimo = inicio.getAnt();
                NodoD penultimo = ultimo.getAnt();
                penultimo.setSig(inicio);
                inicio.setAnt(penultimo);
            }
            tam--;
        }
    }

    /**
     * Verifica si un valor está en la lista.
     * @param valor El valor a buscar.
     * @return true si el valor está en la lista, false en caso contrario.
     */
    public boolean contains(int valor) {
        if (isEmpty()) return false;
        NodoD actual = inicio;
        do {
            if (actual.getValor() == valor) return true;
            actual = actual.getSig();
        } while (actual != inicio);
        return false;
    }

    /**
     * Obtiene el valor en una posición específica.
     * @param index Índice del elemento a obtener.
     * @return El valor en la posición indicada.
     * @throws IndexOutOfBoundsException Si el índice está fuera de rango.
     */
    public int getElement(int index) {
        if (index < 0 || index >= tam) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        NodoD actual = inicio;
        for (int i = 0; i < index; i++) {
            actual = actual.getSig();
        }
        return actual.getValor();
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    public void clear() {
        inicio = null;
        tam = 0;
    }

    /**
     * Devuelve una representación en cadena de la lista.
     * @return Una cadena con los valores de la lista.
     */
    @Override
    public String toString() {
        if (isEmpty()) return "Lista vacía";
        StringBuilder sb = new StringBuilder();
        NodoD actual = inicio;
        do {
            sb.append(actual.getValor()).append(" <-> ");
            actual = actual.getSig();
        } while (actual != inicio);
        sb.append("(inicio)");
        return sb.toString();
    }

    /**
     * Imprime los elementos de la lista doblemente enlazada circular.
     */
    public void print() {
        System.out.println(this.toString());
    }
}
