/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ed_ud2_228761;

import Lineales.LDE;
import Lineales.LES;

/**
 *
 * @author gaspa
 */
public class ED_UD2_228761 {
    public void LES(){
        LES lista = new LES();

        // Añadir elementos al principio
        lista.addFirst(10);
        lista.addFirst(20);
        lista.addFirst(30);

        // Añadir elementos al final
        lista.addLast(40);
        lista.addLast(50);

        // Imprimir la lista
        System.out.println("Lista después de agregar elementos: " + lista);

        // Verificar si la lista contiene ciertos valores
        System.out.println("¿Contiene 20? " + lista.contains(20));
        System.out.println("¿Contiene 100? " + lista.contains(100));

        // Obtener elementos por índice
        System.out.println("Elemento en la posición 2: " + lista.getElement(2));

        // Eliminar el primer elemento
        lista.removeFirst();
        System.out.println("Lista después de eliminar el primer elemento: " + lista);

        // Eliminar el último elemento
        lista.removeLast();
        System.out.println("Lista después de eliminar el último elemento: " + lista);

        // Limpiar la lista
        lista.clear();
        System.out.println("Lista después de limpiar: " + lista);
    }
    
    public void LDE(){
        LDE lista = new LDE();

        System.out.println("Lista vacía: " + lista.isEmpty());

        // Agregar elementos
        lista.addFirst(10);
        lista.addFirst(20);
        lista.addLast(30);
        lista.addLast(40);
        System.out.println("Tamaño después de agregar elementos: " + lista.size());

        // Verificar elementos
        System.out.println("Elemento en índice 0: " + lista.getElement(0));
        System.out.println("Elemento en índice 2: " + lista.getElement(2));

        // Buscar elementos
        System.out.println("¿Contiene 20? " + lista.contains(20));
        System.out.println("¿Contiene 50? " + lista.contains(50));

        // Eliminar primeros y últimos elementos
        lista.removeFirst();
        System.out.println("Tamaño después de removeFirst(): " + lista.size());

        lista.removeLast();
        System.out.println("Tamaño después de removeLast(): " + lista.size());

        // Limpiar la lista
        lista.clear();
        System.out.println("Lista vacía después de clear(): " + lista.isEmpty());
    }

    public static void main(String[] args) {
        ED_UD2_228761 test = new ED_UD2_228761();
        test.LDE();
    }
    
}
