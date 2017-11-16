package pilas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hernan
 */

import java.util.Stack;
public class pila3 {
 
    Stack pila = new Stack();
    Stack pila2 = new Stack();
    int num;
    
    public void llenarPila()
    {
            for (int i = 0; i < 5; i++) {
            
                num = ((int) (Math.random()*20)+1);
                System.out.println(num);
                
                while (pila.contains(num))
                {
                    num = ((int) (Math.random()*20)+1);
                    System.out.println("dos"+num);
                    
                }
                pila.push(num);
        }
         
    }
    
    public void mostrarPila()
    {
        System.out.println(pila);
    }
    
    
   
    
    
    public static void main(String[] args) {
        
        pila3 p = new pila3();
        
        p.llenarPila();
        p.mostrarPila();
        //p.atencionCliente();
            
    }
    
}
