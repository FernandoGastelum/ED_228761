/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

/**
 *
 * @author gaspa
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(int valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente=siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "valor=" + valor + ", siguiente=" + siguiente + '}';
    }
    
    
}
