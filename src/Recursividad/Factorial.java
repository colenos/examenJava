/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author hernan
 */
public class Factorial {
    
    //revisar factorial en wikipedia.
    
    public int factorial(int x){ // *entrar un 4 , entra 3, entra 2, entra 1 ,entra 0
        
        if(x==0){
            return 1;
        }
        else
        {
            return x*factorial(x-1);
        }
        
        
        /*
         * 1ra 4*factorial(4-1); es 3 en parentesis // factorial (3) = 6 * 4 = 24
         * 2da 3*factorial(3-1); es 2 en parentesis //factorial (2) = 2 * 3 = 6 
         * 3ra 2*factorial(2-1); es 1 en parentesis //fatorial (1) = 1 , ya que 1* fatorial(0) = 2 
         * 4ta 1*factorial(1-1); es 0 en parentesis  // factorial (0) = 1 * 1 = 1;
         * 5ta devuelve 1;
         * 
         * ahora se devuelve
         * 1ra 4*6; = 24
         * 2da 3*2; 
         * 3ra 2*1; 
         * 4ta 1*1;
         * 5ta 1;
         * 
         * 
         */
        
    }
    
    
}
