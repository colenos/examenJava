
package colas;
import java.util.LinkedList;
/**
 *
 * @author hernan
 */
public class cola {
    
    //offer, poll
    
    public static void main(String[] args) {
        //FIFO 
        
        LinkedList cola = new LinkedList();
        for (int i = 1; i < 11; i++) {
            cola.offer(i);
            // si hago cola.push(i);, muestra la filosifa de pila, LIFO
        }
        System.out.println(cola);
        
        while (cola.peek()!=null) {
            System.out.println(cola.poll());
            
        }
        
        
    }
    
}
