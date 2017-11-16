/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_arreglo;

/**
 *
 * @author hernan
 */
public class PruebaPila2 {
    
    public static void main(String[] args) {
        
        pila2 p = new pila2(4);
        
        p.Push("a");
        p.Push("b");
        p.Push("c");
        p.Push("d");
        p.imprimir();
        
        
        System.out.println("");
        System.out.println("POP");
        p.Pop();
        p.imprimir();
        System.out.println("");
        p.Pop();
        p.imprimir();
        System.out.println("");
        p.Pop();
        p.imprimir();
        System.out.println("");
        p.Pop();
        p.imprimir();
        
        
        
        
        
        
    }
    
}
