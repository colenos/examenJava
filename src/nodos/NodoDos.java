/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;
import java.util.LinkedList;
import java.util.Iterator;
/**
 *
 * @author hernan
 */
public class NodoDos {
    public static void main(String[] args) {
        
        LinkedList lista = new LinkedList();
        lista.add(1);
        lista.add(2);
        lista.add(298);
        lista.addFirst("palabra");//se puso al ultimo en la demostracion.
        
        System.out.println(lista);
        
        Iterator recorre = lista.iterator();
        
        /*System.out.println(recorre.next());
        System.out.println(recorre.next());
        System.out.println(recorre.next());
        */
        // error de no encuentrar mas elementosSystem.out.println(recorre.next());
        
        
        //asi me evito imprimir a cada rato y el error del recorrido
        while (recorre.hasNext()) {
            
            System.out.println(recorre.next());
            
        }
        
        lista.remove(0);
        
        System.out.println("El tamaño de la lista es " + lista.size());
        
        System.out.println("elemento 0: " + lista.get(0));
        System.out.println("elemento 1: " + lista.get(1));
        System.out.println("elemento 2: " + lista.get(2));
        
        System.out.println("primer elemento de una lista: " + lista.getFirst());
        System.out.println("Ultimo valor de la lista: " + lista.getLast());
        
        
        
    }
    
}
