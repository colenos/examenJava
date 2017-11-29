/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen2017;

/**
 *
 * @author hernan
 */
public class Arbol {
    
    private Nodo raiz;

    public Arbol() {
    }

    public Arbol(Nodo raiz) {
        this.raiz = null;
    }
    
    public void postOrden()
    {
        postOrden(this.raiz);
    }
    
     private void postOrden(Nodo n)
    {
        if (n != null)
        {
            
            postOrden(n.getHijoIzq());
            postOrden(n.getHijoDer());
            System.out.print(" "+ n.getDato());
        }
    }
    
}
