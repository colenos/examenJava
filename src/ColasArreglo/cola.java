
package ColasArreglo;

/**
 *
 * @author hernan
 */
public class cola {
    
    private Object [] cola;
    private int inicio;
    private int fin;
    
    public cola (int tamaño)
    {
        cola = new Object[tamaño];
        inicio = fin = -1;
    }
    
    public boolean isEmpty()
    {
        return inicio == fin;
    }
    
    public boolean isFull()
    {
        return fin == cola.length-1;
    }
    
    public void insertarCola(Object elemento)
    {
        if (isFull()){
            System.out.println("Cola llena");
        }
        else
        {
            cola[++fin] = elemento;
            
        }
    }
    
    public Object eliminaCola()
    {
        if(isEmpty()){
            System.out.println("La cola esta vacia");
            return "cola vacia";
        }
        else
        {
            return cola[++inicio];
        }
    }
    
    
    public void imprimirCola()
    {
        if(isEmpty())
        {
            System.out.println("Cola vacia");
        }
        else
        {
            if(inicio == -1)
            {
                for (int i = 0; i < fin+1; i++) {
                    System.out.println(cola[i]);
                }
            }
            else
            {
                for (int j = inicio; j < fin; j++) {
                    System.out.println(cola[j]);
                }
            }
        }
    }
    
}
