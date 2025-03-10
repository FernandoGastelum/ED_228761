/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lineales;

import Nodos.Nodo;

/**
 * La clase LES implementa una lista enlazada simple de nodos, donde cada nodo
 * contiene un valor entero y una referencia al siguiente nodo en la lista.
 * Proporciona métodos para agregar, eliminar, buscar y obtener elementos en la lista.
 * @author Ilian Fernando Gastelum Romo
 */
public class LES {
    private Nodo inicial;
    private int tam = 0;
    /**
     * Verifica si la lista está vacía.
     * 
     * @return true si la lista está vacía, false si contiene al menos un elemento.
     */
    public boolean isEmpty() {
        return tam <= 0;
    }

    /**
     * Obtiene el tamaño actual de la lista.
     * 
     * @return El tamaño de la lista.
     */
    public int size() {
        return tam;
    }

    /**
     * Agrega un nuevo nodo con el valor especificado al principio de la lista.
     * 
     * @param valor El valor del nuevo nodo.
     * @return El valor del nuevo nodo si se agrega correctamente, 0 si el valor es inválido (<= 0).
     */
    public int addFirst(int valor) {
        if (valor <= 0) {
            return 0;
        }
        Nodo nuevoNodo = new Nodo(valor, inicial);
        inicial = nuevoNodo;
        tam++;
        return valor;
    }

    /**
     * Agrega un nuevo nodo con el valor especificado al final de la lista.
     * 
     * @param valor El valor del nuevo nodo.
     * @return true si el nodo se agrega correctamente, false si el valor es inválido (<= 0).
     */
    public boolean addLast(int valor) {
        if (valor <= 0) {
            return false;
        }
        Nodo nuevoNodo = new Nodo(valor, null);
        if (inicial == null) {
            inicial = nuevoNodo;
        } else {
            Nodo actual = inicial;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        tam++;
        return true;
    }

    /**
     * Elimina el primer nodo de la lista.
     * 
     * @return true si se eliminó el nodo correctamente, false si la lista está vacía.
     */
    public boolean removeFirst() {
        if (isEmpty()) {
            return false;
        }
        inicial = inicial.getSiguiente();
        tam--;
        return true;
    }

    /**
     * Elimina el último nodo de la lista.
     * 
     * @return true si se eliminó el nodo correctamente, false si la lista está vacía.
     */
    public boolean removeLast() {
        if (isEmpty()) {
            return false;
        }
        if (tam == 1) {
            inicial = null;
        } else {
            Nodo actual = inicial;
            while (actual.getSiguiente() != null && actual.getSiguiente().getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
        }
        tam--;
        return true;
    }

    /**
     * Verifica si un valor especificado existe en la lista.
     * 
     * @param valor El valor a buscar en la lista.
     * @return true si el valor se encuentra en algún nodo de la lista, false en caso contrario.
     */
    public boolean contains(int valor) {
        Nodo actual = inicial;
        while (actual != null) {
            if (actual.getValor() == valor) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    /**
     * Obtiene el valor del nodo en la posición especificada de la lista.
     * 
     * @param index El índice (posición) del nodo cuyo valor se desea obtener.
     * @return El valor del nodo en la posición indicada si el índice es válido, 
     *         o un valor fuera de rango si el índice no es válido (menor que 0 o mayor o igual al tamaño de la lista).
     * @throws IndexOutOfBoundsException si el índice es inválido.
     */
    public int getElement(int index) {
        if (index < 0 || index >= tam) {
            System.out.println("El valor está fuera del rango");
            return -1; // Indicador de error
        }
        Nodo actual = inicial;
        for (int i = 0; i < index; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getValor();
    }

    /**
     * Elimina todos los elementos de la lista, dejándola vacía.
     */
    public void clear() {
        inicial = null;
        tam = 0;
    }

    /**
     * Devuelve una representación en cadena de la lista enlazada.
     * 
     * @return Una cadena que representa el estado de la lista, mostrando el nodo inicial y el tamaño.
     */
    @Override
    public String toString() {
        return "LES{" + "inicial=" + inicial + ", tam=" + tam + '}';
    }
    
}
