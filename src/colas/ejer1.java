/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
/**
 *
 * @author hernan
 */
public class ejer1 {
    
    public Queue cola;
    public Queue cola2;
    public int num;
    
    public void llenarCola()
    {
        
        cola = new LinkedList();
        
        for (int i = 0; i < 10; i++) {
            
            num = (int)((Math.random()*50+1)-25);
            cola.offer(num);
        }
        
     
        
        JOptionPane.showMessageDialog(null, cola, "COLA INICIO", 1);
 
    }
    
    
    public void ColaNegativa()
    {
        cola2 = new LinkedList();
        
        while (!cola.isEmpty()) {
            num = (int)(cola.poll());
            if (num < 0 )
            {
             cola2.offer(num);
            }
        }
        
        JOptionPane.showMessageDialog(null, cola2, "COLA NEGATIVA", 2, null);
        System.out.println("cola negativa: "+ cola2);
    }
    
    public boolean compararCola(Queue cola3,Queue cola4)
    {
        return cola3.equals(cola4);
    }
    
    public static void main(String[] args) {
        
        ejer1 ej = new ejer1();
        ej.llenarCola();
        ej.ColaNegativa();
        
    }
    
    
    
}
