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
public class ejer1_5D {
    
    public Queue cola = new LinkedList();
    public int menor=100;
    public int mayor=0;
    public int x;
    public int y;
    
    public void llenarCola()
    {
        
        
        int tamano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Tamaño", "Cola", 2));
        
        
        for (int i = 0; i < tamano; i++) {
            
           int x = (int)(Math.random()*10+1);
           
           cola.offer(x);
            
//            if (x < menor)
//            {
//                menor = x;
//            }
//            
//            if (x>mayor)
//            {
//                mayor = x;
//            }
            
            
        }
        
        
        JOptionPane.showMessageDialog(null, cola, "Mostrando Cola", 1);
        //System.out.println(cola);
        
    }
    
    
    public void numeroMayoMenorrCola()
    {
        
        while (!cola.isEmpty()) {
           
            x= (int)cola.poll();
            
            if (x < menor)
            {
                menor = x;
                
            }
              
            if (x > mayor)
            {
                mayor = x;
                
            }
        
            
        }
        JOptionPane.showMessageDialog(null, "el menor es: "+menor, "Mostrando Cola", 1);
        JOptionPane.showMessageDialog(null, "el mayor es: "+mayor, "Mostrando Cola", 1);
        
    }
    
    public static void main(String[] args) {
        ejer1_5D cola = new ejer1_5D();
        cola.llenarCola();
        cola.numeroMayoMenorrCola();
    }
    
    
}
