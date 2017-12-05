/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen2017;

import java.util.ArrayList;


public class TestArbol {

    public static void main(String[] args) {

        Arbol ab = new Arbol();
        Obra obj1 = new Obra(111, "Pedro", "Casa", 2013,3000);
        Obra obj2 = new Obra(222, "Juan", "Casa", 2014,4000);
        Obra obj3 = new Obra(333, "Diego", "Casa", 2015,5000);
        Obra obj4 = new Obra(444, "Alexis", "Casa", 2012,2000);
        Obra obj5 = new Obra(555, "Maria", "Casa", 2016,5000);

        Nodo n1 = new Nodo(obj1);
        Nodo n2 = new Nodo(obj2);
        Nodo n3 = new Nodo(obj3);
        Nodo n4 = new Nodo(obj4);
        Nodo n5 = new Nodo(obj5);

        n1.setHijoDer(n3);
        n1.setHijoIzq(n2);
        n2.setHijoIzq(n4);
        n2.setHijoDer(n5);
        

    ab.setRaiz(n1);
    System.out.println("POSTORDEN");
    ab.postOrden();
    ab.imprimirLista();
    
   ab.llenarPila(obj1);
   ab.llenarPila(obj2);
   ab.llenarPila(obj3);
   ab.llenarPila(obj4);
   ab.llenarPila(obj5);
   
   ab.mostrarPila();




    }
}
