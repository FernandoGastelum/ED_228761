/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

/**
 * La clase Nodo representa un nodo en una estructura de datos tipo lista enlazada.
 * Cada nodo almacena un valor entero y una referencia al siguiente nodo en la lista.
 * @author Ilian Fernando Gastelum Romo
 */
public class Nodo {
    
    private int valor;
    private Nodo siguiente;

    /**
     * Constructor por defecto. Crea un nodo sin valor ni siguiente.
     */
    public Nodo() {
    }

    /**
     * Constructor que inicializa el nodo con un valor y una referencia al siguiente nodo.
     *
     * @param valor El valor que se almacena en el nodo.
     * @param siguiente La referencia al siguiente nodo en la lista.
     */
    public Nodo(int valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
    public Nodo(int valor) {
        this.valor = valor;
        
    }
    /**
     * Obtiene el valor almacenado en el nodo.
     *
     * @return El valor almacenado en el nodo.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Establece el valor del nodo.
     *
     * @param valor El valor que se desea almacenar en el nodo.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Obtiene la referencia al siguiente nodo en la lista.
     *
     * @return El siguiente nodo en la lista, o null si no hay siguiente.
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Establece la referencia al siguiente nodo en la lista.
     *
     * @param siguiente El nodo que será el siguiente en la lista.
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Representa el nodo como una cadena de texto.
     *
     * @return Una cadena que describe el nodo en formato "Nodo{valor=valor, siguiente=siguiente}".
     */
    @Override
    public String toString() {
        return "Nodo{" + "valor=" + valor + ", siguiente=" + siguiente + '}';
    }
}
