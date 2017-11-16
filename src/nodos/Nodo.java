/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author hernan
 */
public class Nodo {
    
    private int informacion;
    private Nodo siguiente;
    
    public Nodo()
    {
        this.informacion = 0;
        this.siguiente = null;
    }
    
    public void serInformacion(int informacion)
    {
        this.informacion = informacion;
    }
    
    public void colcarNodo (Nodo nodosig)
    {
        this.siguiente = nodosig;
    }
    
    public void imprimirNodos()
    {
        System.out.println(this.informacion);
    }
    
    public Nodo getNodo()
    {
      return siguiente;  
    }
    
}
