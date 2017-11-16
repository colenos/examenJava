package pilas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hernan
 */

import java.util.*;


public class pila1 {
    
    public static void main(String[] args) {
        
        Stack pila = new Stack();
        
    /**
     * PUSH
     * PEEK
     * POP
     * SEARCH
     * isEmpty
     */    
        
        //insertamos numeros
        
//        pila.push(1);//5
//        pila.push(2);//4
//        pila.push(3);//3
//        pila.push(4);//2
//        pila.push(5);//1
//        
        pila.push("a");
        pila.push("b");
        pila.push("c");
        pila.push("d");
        
        int busqueda = pila.search("c");
        //Object top = pila.pop();
        System.out.println(pila.peek());
        System.out.println("");
        System.out.println(busqueda);
        
        
    }
    
    
    
}
