/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen2017;

import java.util.ArrayList;

/**
 *
 * @author hernan
 */
public class TestArbol {

    public static void main(String[] args) {

        Arbol ab = new Arbol();
        Obra o1 = new Obra(123, "Juan", "casa", 2012,2000);
        Obra o2 = new Obra(456, "Juanito", "casa", 2013,3000);
        Obra o3 = new Obra(789, "Juana", "casa", 2012,4000);
        Obra o4 = new Obra(111, "Pedro", "casa", 2016,5000);
        Obra o5 = new Obra(222, "Maria", "casa", 2017,6000);

        Nodo n1 = new Nodo(o1);
        Nodo n2 = new Nodo(o2);
        Nodo n3 = new Nodo(o3);
        Nodo n4 = new Nodo(o4);
        Nodo n5 = new Nodo(o5);

        n1.setHijoDer(n3);
        n1.setHijoIzq(n2);
        n2.setHijoIzq(n4);
        n2.setHijoDer(n5);
        
//        
//           1
//        2     3
//      4   5

    ab.setRaiz(n1);
    System.out.println("POSTORDEN");
    ab.postOrden();
    ab.imprimirLista();
    
   ab.llenarPila(o1);
   ab.llenarPila(o2);
   ab.llenarPila(o3);
   ab.llenarPila(o4);
   ab.llenarPila(o5);
   
   ab.mostrarPila();




    }
}
