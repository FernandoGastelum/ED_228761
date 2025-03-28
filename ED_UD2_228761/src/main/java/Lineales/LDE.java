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

    public LDE() {
    }
    public boolean isEmpty(){
        return tam <= 0;
    }
    public int size(){
        return tam;
    }
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
    
    public boolean addLast(int valor){
        NodoD nN = new NodoD(valor);
        if(tam == 0){
            inicial = nN;
            tam++;
            return true;
        }else{
            NodoD actual = inicial;
            while(actual.getSig() != null){
                actual = actual.getSig();
            }
            actual.setSig(nN);
            nN.setAnt(actual);
            tam++;
            return true;
        }
    }
    public void removeFirst(){
        if (tam == 1) {
            inicial=null;
            tam--;
        }else if(tam>1){
            inicial = inicial.getSig();
            inicial.getAnt().setSig(null);
            inicial.setAnt(null);
            tam--;
        }
    }
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
    public boolean contains(int val){
        NodoD actual = inicial;
        boolean b=false;
        while(actual !=null){
            if (actual.getValor()==val) {
                b = true;
                break;
            }else{
                actual=actual.getSig();
            }  
        }
        return b;
    }
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
    public void clear(){
        inicial = null;
        tam = 0;
    }
    public void print(){
        NodoD actual = inicial;
        
        while(actual!= null){
            System.out.println(actual.toString());
            actual = actual.getSig();
        }
    }
}