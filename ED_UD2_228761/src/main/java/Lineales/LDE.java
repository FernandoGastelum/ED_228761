/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lineales;

import Nodos.NodoD;

/**
 *
 * @author gaspa
 */
public class LDE {
    private NodoD inicial;
    private int tam = 0;

    public LDE() {
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
    public void print(){
        NodoD actual = inicial;
        
        while(actual!= null){
            System.out.println(actual.toString());
            actual = actual.getSig();
        }
    }
}