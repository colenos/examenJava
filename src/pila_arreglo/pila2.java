package pila_arreglo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hernan
 */
public class pila2 {
    
    private int tamaño;
    private int top;
    private String arreglo[];
    
    public pila2 (int tamaño)
    {
        this.tamaño = tamaño;
        this.top=0;
        this.arreglo = new String[tamaño];
    }
    
    //pila vacia
    public boolean isEmpty()
    {
        if(top==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //pila llena
    public boolean llena()
    {
        if (top==tamaño)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //push insertar
    public void Push(String dato)
    {
        if (llena())
        {
            System.out.println("Error pila llena");
        }
        else
        {
            arreglo[top]=dato;
            top++;
        }
    }
    
    //pop borrar
    public void Pop()
    {
        if(isEmpty())
        {
            System.out.println("Error pila vacia");
        }
        else
        {
            top--;
        }
    }
    
    public void imprimir()
    {
        if(isEmpty())
        {
            System.out.println("Error pila vacia");
        }
        else
        {
            for (int i=0;i<top;i++)
            {
                System.out.println(arreglo[i]+" ");
            }
        }
    }
    
}
