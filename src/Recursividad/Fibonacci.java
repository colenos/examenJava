/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author hernan
 */
public class Fibonacci {
    
    public int fibonacci(int x){
        if(x==0){
            return 0;
        }
        else
        {
            if(x==1)
            {
                return 1;
            }
            else
            {
                return fibonacci(x-1) + fibonacci(x-2);
            }
        }
    }
    
}
