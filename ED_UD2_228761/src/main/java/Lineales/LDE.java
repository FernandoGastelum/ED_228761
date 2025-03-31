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
public class LDE {
    private NodoD inicial;
    private int tam = 0;

    /**
     * Constructor por defecto de la lista.
     */
    public LDE() {
    }

    /**
     * Verifica si la lista está vacía.
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean isEmpty(){
        return tam <= 0;
    }

    /**
     * Obtiene el tamaño de la lista.
     * @return número de elementos en la lista.
     */
    public int size(){
        return tam;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     * @param valor El valor a agregar.
     * @return true si se agregó correctamente.
     */
    public boolean addFirst(int valor) {
        NodoD nN = new NodoD(valor);
        if (tam == 0) {
            inicial = nN;
        } else {
            nN.setSig(inicial);
            inicial.setAnt(nN);
            inicial = nN;
        }
        tam++;
        return true;
    }
    
    /**
     * Agrega un elemento al final de la lista.
     * @param valor El valor a agregar.
     * @return true si se agregó correctamente.
     */
    public boolean addLast(int valor){
        NodoD nN = new NodoD(valor);
        if(tam == 0){
            inicial = nN;
        } else {
            NodoD actual = inicial;
            while(actual.getSig() != null){
                actual = actual.getSig();
            }
            actual.setSig(nN);
            nN.setAnt(actual);
        }
        tam++;
        return true;
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst(){
        if (tam == 1) {
            inicial = null;
        } else if(tam > 1){
            inicial = inicial.getSig();
            inicial.setAnt(null);
        }
        tam = Math.max(0, tam - 1);
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void removeLast() {
        if (tam == 1) {
            inicial = null;
        } else if (tam > 1) {
            NodoD actual = inicial;
            while (actual.getSig() != null) {
                actual = actual.getSig();
            }
            actual.getAnt().setSig(null);
        }
        tam = Math.max(0, tam - 1);
    }

    /**
     * Verifica si un valor está contenido en la lista.
     * @param val El valor a buscar.
     * @return true si el valor está en la lista, false en caso contrario.
     */
    public boolean contains(int val){
        NodoD actual = inicial;
        while(actual != null){
            if (actual.getValor() == val) {
                return true;
            }
            actual = actual.getSig();
        }
        return false;
    }

    /**
     * Obtiene el valor de un elemento en una posición específica.
     * @param index Índice del elemento a obtener.
     * @return El valor almacenado en la posición indicada.
     * @throws IndexOutOfBoundsException Si el índice está fuera de rango.
     */
    public int getElement(int index) {
        if (index < 0 || index >= tam) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        NodoD actual = inicial;
        for (int i = 0; i < index; i++) {
            actual = actual.getSig();
        }
        return actual.getValor();
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    public void clear(){
        inicial = null;
        tam = 0;
    }

    /**
     * Imprime los elementos de la lista en orden.
     */
    public void print(){
        NodoD actual = inicial;
        while(actual != null){
            System.out.println(actual.toString());
            actual = actual.getSig();
        }
    }
}