/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen2017;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author hernan
 */
public class Arbol {
    
    private Nodo raiz;
    private ArrayList<Obra> lista = new ArrayList<>();
    Stack pila = new Stack();
    

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
            
            if (n.getDato().getAdjudicacion() < 2015) {
                lista.add(n.getDato());
            }
            
            System.out.println(" "+ n.getDato().getCodigo()+" "+ n.getDato().getNombreEncargado());
           
            
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }
     
     
    public void imprimirLista()
    {
        for (Obra ob  : lista) {
            
            System.out.println(ob.getCodigo()+" "+ob.getValorObra());
        }
    }
    
    
    
    
    public void llenarPila(Obra o)
    {
           
                pila.push(o);
        
         
    }
    
    public void mostrarPila()
    {
        
            System.out.println(pila);
        
        
    }
    
}
