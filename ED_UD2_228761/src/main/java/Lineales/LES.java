/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lineales;

import Nodos.Nodo;

/**
 *
 * @author gaspa
 */
public class LES {
    private Nodo inicial;
    private int tam = 0;
    
    public boolean isEmpty(){
        return tam<=0;
    }
    public int size(){
        return tam;
    }
    public int addFirst(int valor){
        if(valor<=0){
            return 0;
        }
        Nodo nuevoNodo = new Nodo(valor,inicial);
        inicial=nuevoNodo;
        tam++;
        return valor;
    }
    public boolean addLast(int valor){
        if(valor<=0){
            return false;        
        }
        Nodo nuevoNodo = new Nodo(valor,null);
        if(inicial==null){
            inicial = nuevoNodo;
        }else{
            Nodo actual = inicial;
            while(actual.getSiguiente()!=null){
                actual=actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
            tam++;
        }
        return true;
    }
    public boolean removeFirst(){
        if (isEmpty()) {
            return false; 
        }
        inicial = inicial.getSiguiente(); 
        tam--;
        return true;
    }
    public boolean removeLast(){
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
    public boolean contains(int valor){
        Nodo actual = inicial;
        while (actual != null) {
            if (actual.getValor() == valor) {
                return true; 
            }
            actual = actual.getSiguiente();
        }
        return false; 
    }
    public int getElement(int valor){
        if (valor < 0 || valor >= tam) {
            System.out.println("El valor esta fuera del rango");
            return valor;
        }
        Nodo actual = inicial;
        for (int i = 0; i < valor; i++) {
            actual = actual.getSiguiente(); 
        }
        return actual.getValor();
    }
    public void clear(){
        inicial = null;
        tam = 0;
    }

    @Override
    public String toString() {
        return "LES{" + "inicial=" + inicial + ", tam=" + tam + '}';
    }
    
}
