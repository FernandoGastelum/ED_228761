/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lineales;

import Nodos.Nodo;

/**
 *
 * @author Ilian Fernando Gastelum Romo
 */
public class LESC {
    private Nodo inicio;
    private int tam;

    /**
     * Constructor de la lista circular.
     */
    public LESC() {
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
        Nodo nuevo = new Nodo(valor);
        if (isEmpty()) {
            nuevo.setSiguiente(nuevo);
            inicio = nuevo;
        } else {
            Nodo actual = inicio;
            while (actual.getSiguiente() != inicio) {
                actual = actual.getSiguiente();
            }
            nuevo.setSiguiente(inicio);
            actual.setSiguiente(nuevo);
            inicio = nuevo;
        }
        tam++;
    }

    /**
     * Agrega un elemento al final de la lista.
     * @param valor El valor a agregar.
     */
    public void addLast(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (isEmpty()) {
            nuevo.setSiguiente(nuevo);
            inicio = nuevo;
        } else {
            Nodo actual = inicio;
            while (actual.getSiguiente() != inicio) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
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
                Nodo actual = inicio;
                while (actual.getSiguiente() != inicio) {
                    actual = actual.getSiguiente();
                }
                inicio = inicio.getSiguiente();
                actual.setSiguiente(inicio);
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
                Nodo actual = inicio;
                while (actual.getSiguiente().getSiguiente() != inicio) {
                    actual = actual.getSiguiente();
                }
                actual.setSiguiente(inicio);
            }
            tam--;
        }
    }

    /**
     * Imprime los elementos de la lista circular.
     */
    public void print() {
        if (!isEmpty()) {
            Nodo actual = inicio;
            do {
                System.out.print(actual.getValor() + " -> ");
                actual = actual.getSiguiente();
            } while (actual != inicio);
            System.out.println("(inicio)");
        } else {
            System.out.println("Lista vacía");
        }
    }
}
