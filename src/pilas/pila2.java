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

public class pila2 {
    
    Stack pila1 = new Stack();
    
    public void llenarPila()
    {
        //int arreglo[] = new int[10];
        int c=0;
        for (int i = 0; i < 10; i++) {
            pila1.push((int)(Math.random()*10+1));
        }
        System.out.println(pila1);
        
        //cuantos 2 hay en la estructura
        for (int i = 0; i < 10; i++) {
            int dos = pila1.search(2);
            System.out.println(dos);
             c =c+1;
        }
        System.out.println(c);
        
        
                
     }
    
    
    
    
    public static void main(String[] args) {
        
        Stack pila = new Stack();
        
        pila2 p = new pila2();
        p.llenarPila();
        
       // int i=10;
        for (int i = 0; i < 11; i++) {
            pila.push((int)(Math.random()*10)+1);
            
        }
        System.out.println("pila= "+pila);
       while (!pila.empty()) {
           System.out.println(pila.pop());            
        }
        
    }
    
}
