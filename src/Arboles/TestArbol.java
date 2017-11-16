/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author hernan
 */
public class TestArbol {
    
      public static void main(String[] args) {
        
        ArbolBinario ab = new ArbolBinario();
        
        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);
        Nodo n4 = new Nodo(4);
        Nodo n5 = new Nodo(5);
        
        n1.setHijoDer(n3);
        n1.setHijoIzq(n2);
        n2.setHijoIzq(n4);
        n2.setHijoDer(n5);
        
        ab.setRaiz(n1);
        System.out.println("PREORDEN");
        ab.preorden();
        System.out.println("");
        System.out.println("POSTORDEN");
        ab.postOrden();
        System.out.println("");
        System.out.println("INORDEN");
        ab.inOrden();
        System.out.println("");
          System.out.println("*****");
        System.out.println("BUSQUEDA");
        System.out.println(ab.buscar(5));
        System.out.println(ab.buscar(22));
          System.out.println("***");
          System.out.println("Contar Nodos");
          System.out.println(ab.contar());
          
          System.out.println("****");
          System.out.println(ab.sumar());
          System.out.println(ab.altura());
          System.out.println(ab.buscarMayor());
        
    }
    
}
